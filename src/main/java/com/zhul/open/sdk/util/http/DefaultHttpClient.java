package com.zhul.open.sdk.util.http;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.zhul.open.sdk.exception.ApiException;
import com.zhul.open.sdk.util.json.JSONUtils;
import java.io.IOException;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.codec.Charsets;
import org.apache.http.Header;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class DefaultHttpClient implements HttpClient {
  private Integer maxRouteCount = Integer.valueOf(10);
  private Integer maxConnectionCount = Integer.valueOf(1000);
  private Integer socketTimeout = Integer.valueOf(10000);
  private Integer connectionTimeout = Integer.valueOf(2000);
  private CloseableHttpClient client = null;

  public DefaultHttpClient() {
    this.init();
  }

  public void init() {
    SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
    SSLContext sslContext = null;

    try {
      sslContextBuilder.loadTrustMaterial((KeyStore) null, new TrustStrategy() {
        @Override
        public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
          return true;
        }
      });
      sslContext = sslContextBuilder.build();
    } catch (Exception var6) {
      throw new ApiException(var6);
    }

    SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, new String[]{"TLSv1"}, (String[]) null, NoopHostnameVerifier.INSTANCE);
    Registry registry =
        RegistryBuilder
            .create()
            .register("http", new PlainConnectionSocketFactory())
            .register("https", sslConnectionSocketFactory)
            .build();
    PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager(registry);
    this.client = HttpClients.custom().setMaxConnPerRoute(this.maxRouteCount.intValue()).setMaxConnTotal(this.maxConnectionCount.intValue()).setConnectionManager(poolingHttpClientConnectionManager).setDefaultRequestConfig(RequestConfig.custom().setConnectTimeout(this.connectionTimeout.intValue()).setSocketTimeout(this.socketTimeout.intValue()).build()).build();
  }

  @Override
  public String get(String var1) {
    Preconditions.checkArgument(var1 != null, "Uri cannot be null");
    HttpGet httpGet = new HttpGet(var1);

    try {
      CloseableHttpResponse response = this.client.execute(httpGet);
      return EntityUtils.toString(response.getEntity());
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  @Override
  public String get(String var1, Params var2) {
    Preconditions.checkArgument(var1 != null, "Uri cannot be null");
    Preconditions.checkArgument(var2 != null, "Params cannot be null");
    HttpGet httpGet = this.getGet(var1, var2);

    try {
      CloseableHttpResponse response = this.client.execute(httpGet);
      return EntityUtils.toString(response.getEntity());
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  @Override
  public <T> T get(String uri, TypeReference<T> ref) {
    String rsp = this.get(uri);
    return JSONUtils.tBean(rsp, ref);
  }

  @Override
  public <T> T get(String uri, Params params, TypeReference<T> ref) {
    String rsp = this.get(uri, params);
    return JSONUtils.tBean(rsp, ref);
  }

  @Override
  public String post(String var1, Params var2) {
    Preconditions.checkArgument(var1 != null, "Uri cannot be null");
    Preconditions.checkArgument(var2 != null, "Params cannot be null");
    HttpPost httpPost = getPost(var1, var2);

    try {
      CloseableHttpResponse response = this.client.execute(httpPost);
      int statusCode = response.getStatusLine().getStatusCode();
      if (statusCode == HttpStatus.SC_OK) {
        return EntityUtils.toString(response.getEntity());
      }

      if (statusCode == HttpStatus.SC_INTERNAL_SERVER_ERROR) {
        throw new ApiException(String.format("第三方接口服务器异常(%s)", statusCode));
      }

      return String.valueOf(statusCode);
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  @Override
  public <T> T post(String uri, Params params, TypeReference<T> ref) {
    String rsp = this.post(uri, params);
    return JSONUtils.tBean(rsp, ref);
  }

  @Override
  public String put(String var1, Params var2) {
    Preconditions.checkArgument(var1 != null, "Uri cannot be null");
    Preconditions.checkArgument(var2 != null, "Params cannot be null");
    HttpPut httpPut = this.getPut(var1, var2);

    try {
      CloseableHttpResponse response = this.client.execute(httpPut);
      return EntityUtils.toString(response.getEntity());
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  @Override
  public <T> T put(String uri, Params params, TypeReference<T> ref) {
    String rsp = this.put(uri, params);
    return JSONUtils.tBean(rsp, ref);
  }

  @Override
  public String delete(String uri) {
    Preconditions.checkArgument(uri != null, "Uri cannot be null");
    HttpDelete httpDelete = new HttpDelete(uri);

    try {
      CloseableHttpResponse response = this.client.execute(httpDelete);
      return EntityUtils.toString(response.getEntity());
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  @Override
  public <T> T delete(String uri, TypeReference<T> ref) {
    String rsp = this.delete(uri);
    return JSONUtils.tBean(rsp, ref);
  }

  @Override
  public String delete(String uri, Params params) {
    Preconditions.checkArgument(uri != null, "Uri cannot be null");
    Preconditions.checkArgument(params != null, "Params cannot be null");
    HttpDelete httpDelete = this.getDelete(uri, params);

    try {
      CloseableHttpResponse response = this.client.execute(httpDelete);
      return EntityUtils.toString(response.getEntity());
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  @Override
  public <T> T delete(String uri, Params params, TypeReference<T> ref) {
    String rsp = this.delete(uri, params);
    return JSONUtils.tBean(rsp, ref);
  }

  private HttpGet getGet(String uri, Params params) {
    HttpGet httpGet = new HttpGet(uri);
    Iterator headers = params.getHeaders().iterator();

    while (headers.hasNext()) {
      Header header = (Header) headers.next();
      httpGet.setHeader(header);
    }

    String query = URI.create(uri).getQuery();
    List<NameValuePair> pairs = Lists.newArrayList();
    if (query != null) {
      pairs = URLEncodedUtils.parse(query, Charsets.UTF_8);
    }

    if (((List) pairs).size() == 0) {
      uri = uri + "?";
    } else {
      uri = uri + "&";
    }

    String data = params.toString();
    if (data.length() > 0) {
      uri = uri + data;
    }

    httpGet.setURI(URI.create(uri));
    return httpGet;
  }

  private HttpPost getPost(String uri, Params params) {
    HttpPost httpPost = new HttpPost(uri);
    Iterator headers = params.getHeaders().iterator();

    while (headers.hasNext()) {
      Header header = (Header) headers.next();
      httpPost.setHeader(header);
    }

    if (params.getContentType() == null
        || params.getContentType() != null && params.getContentType().equals(ContentType.DEFAULT_TEXT)) {
      params.setContentType(ContentType.create("application/x-www-form-urlencoded", Charsets.UTF_8));
    }

    httpPost.setEntity(params.toEntity());
    return httpPost;
  }

  private HttpPut getPut(String uri, Params params) {
    HttpPut httpPut = new HttpPut(uri);
    Iterator headers = params.getHeaders().iterator();

    while (headers.hasNext()) {
      Header header = (Header) headers.next();
      httpPut.addHeader(header);
    }

    if (params.getContentType() == null
        || params.getContentType() != null && params.getContentType().equals(ContentType.DEFAULT_TEXT)) {
      params.setContentType(ContentType.create("application/x-www-form-urlencoded", Charsets.UTF_8));
    }

    httpPut.setEntity(params.toEntity());
    return httpPut;
  }

  private HttpDelete getDelete(String uri, Params params) {
    HttpDelete httpDelete = new HttpDelete(uri);
    Iterator headers = params.getHeaders().iterator();

    while (headers.hasNext()) {
      Header header = (Header) headers.next();
      httpDelete.addHeader(header);
    }

    String query = URI.create(uri).getQuery();
    List<NameValuePair> pairs = Lists.newArrayList();
    if (query != null) {
      pairs = URLEncodedUtils.parse(query, Charsets.UTF_8);
    }

    if (((List) pairs).size() == 0) {
      uri = uri + "?";
    } else {
      uri = uri + "&";
    }

    String data = params.toString();
    if (data.length() > 0) {
      uri = uri + data;
    }

    httpDelete.setURI(URI.create(uri));
    return httpDelete;
  }

  @Override
  public void close() {
    try {
      this.client.close();
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }
}
