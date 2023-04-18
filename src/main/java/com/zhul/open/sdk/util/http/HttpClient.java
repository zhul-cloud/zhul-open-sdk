package com.zhul.open.sdk.util.http;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.zhul.open.sdk.exception.ApiException;
import com.zhul.open.sdk.util.json.JSONUtils;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.Charsets;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

/**
 * Created by yanglikai on 2019/5/23.
 */
public interface HttpClient extends Closeable {
  String get(String var1);

  String get(String var1, HttpClient.Params var2);

  <T> T get(String var1, TypeReference<T> var2);

  <T> T get(String var1, HttpClient.Params var2, TypeReference<T> var3);

  String post(String var1, HttpClient.Params var2);

  <T> T post(String var1, HttpClient.Params var2, TypeReference<T> var3);

  String put(String var1, HttpClient.Params var2);

  <T> T put(String var1, HttpClient.Params var2, TypeReference<T> var3);

  String delete(String var1);

  <T> T delete(String var1, TypeReference<T> var2);

  String delete(String var1, HttpClient.Params var2);

  <T> T delete(String var1, HttpClient.Params var2, TypeReference<T> var3);


  public static class Params {
    private List<Header> headers;
    private Map<String, Object> data;
    private Multimap<String, ContentBody> bodyMultimap;
    private ContentType contentType;

    private Params() {
      this.headers = Lists.newArrayList();
      this.contentType = ContentType.DEFAULT_TEXT;
    }

    public static HttpClient.Params.Builder custom() {
      return new HttpClient.Params.Builder();
    }

    public List<Header> getHeaders() {
      return this.headers;
    }

    public void setHeaders(List<Header> headers) {
      this.headers = headers;
    }

    public ContentType getContentType() {
      return this.contentType;
    }

    public void setContentType(ContentType contentType) {
      this.contentType = contentType;
    }

    @Override
    public String toString() {
      if (this.contentType == ContentType.APPLICATION_JSON) {
        return JSONUtils.tJSON(this.data);
      } else {
        List<NameValuePair> tmp = Lists.newArrayList();
        Iterator var2 = this.data.entrySet().iterator();

        while (var2.hasNext()) {
          Map.Entry<String, Object> entry = (Map.Entry) var2.next();
          tmp.add(new BasicNameValuePair((String) entry.getKey(), entry.getValue().toString()));
        }

        return URLEncodedUtils.format(tmp, Charsets.UTF_8);
      }
    }

    public HttpEntity toEntity() {
      if (!this.contentType.equals(ContentType.MULTIPART_FORM_DATA)) {
        return EntityBuilder.create().setContentType(this.contentType).setContentEncoding("utf-8").setText(this.toString()).build();
      } else {
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        Iterator var2 = this.data.keySet().iterator();

        while (var2.hasNext()) {
          String key = (String) var2.next();
          Object value = this.data.get(key);

          try {
            builder.addPart(key, new StringBody(value.toString(), ContentType.APPLICATION_FORM_URLENCODED));
          } catch (Exception var8) {
            throw new ApiException(var8);
          }
        }

        Map<String, Collection<ContentBody>> items = this.bodyMultimap.asMap();
        Iterator var10 = items.keySet().iterator();

        while (var10.hasNext()) {
          String key = (String) var10.next();
          Collection<ContentBody> value = (Collection) items.get(key);
          Iterator var6 = value.iterator();

          while (var6.hasNext()) {
            ContentBody contentBody = (ContentBody) var6.next();
            builder.addPart(key, contentBody);
          }
        }

        return builder.build();
      }
    }

    public static class Builder {
      private Map<String, Object> data = Maps.newHashMap();
      private Multimap<String, ContentBody> bodyMultimap = ArrayListMultimap.create();
      private List<Header> headers = Lists.newArrayList();
      private ContentType contentType;

      public Builder() {
      }

      public HttpClient.Params.Builder header(String k, String v) {
        this.headers.add(new BasicHeader(k, v));
        return this;
      }

      public HttpClient.Params.Builder add(Map<String, Object> params) {
        this.data.putAll(params);
        return this;
      }

      public HttpClient.Params.Builder add(String k, Object v) {
        if (k != null && v != null) {
          this.data.put(k, v);
          return this;
        }

        throw new IllegalArgumentException("The specified k or v cannot be null");
      }

      public HttpClient.Params.Builder add(String k, ContentBody contentBody) {
        if (contentBody == null) {
          throw new IllegalArgumentException("The specified content body cannot be null");
        }

        this.bodyMultimap.put(k, contentBody);
        return this;
      }

      public HttpClient.Params.Builder setContentType(ContentType contentType) {
        this.contentType = contentType;
        return this;
      }

      public HttpClient.Params build() {
        HttpClient.Params params = new HttpClient.Params();
        params.headers = this.headers;
        params.contentType = this.contentType;
        params.data = this.data;
        params.bodyMultimap = this.bodyMultimap;

        return params;
      }
    }
  }
}
