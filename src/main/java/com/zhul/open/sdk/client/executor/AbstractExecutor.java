package com.zhul.open.sdk.client.executor;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimap;
import com.zhul.open.sdk.api.API;
import com.zhul.open.sdk.client.processor.ResponsePostProcessor;
import com.zhul.open.sdk.exception.ApiException;
import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.model.ByteWrapper;
import com.zhul.open.sdk.model.FileParams;
import com.zhul.open.sdk.util.http.HttpClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.entity.ContentType;

/**
 * Created by yanglikai on 2019/5/23.
 */
public abstract class AbstractExecutor implements Executor {
  protected HttpClient httpClient;
  protected ResponsePostProcessor responsePostProcessor;

  public AbstractExecutor() {
  }

  protected abstract void prepare(ExecutionContext context);

  @Override
  public void registerResponsePostProcessor(ResponsePostProcessor responsePostProcessor) {
    this.responsePostProcessor = responsePostProcessor;
  }

  @Override
  public String execute(ExecutionContext context) {
    this.prepare(context);
    String response = _execute(context);
    return responsePostProcessor.execute(response);
  }

  protected String _execute(ExecutionContext context) {
    Preconditions.checkArgument(this.httpClient != null, "Http client can't be null");
    API api = context.getApi();
    String method = api.getHttpMethod();
    HttpClient.Params.Builder builder = new HttpClient.Params.Builder();
    Map<String, Object> plainParams = context.getParams();
    Iterator var1 = plainParams.keySet().iterator();

    while (var1.hasNext()) {
      String key = (String) var1.next();
      Object value = plainParams.get(key);
      builder.add(key, value);
    }

    APIParams apiParams = api.getAPIParams();
    Multimap val;
    if (apiParams != null && apiParams instanceof FileParams) {
      val = ((FileParams) apiParams).toFileParams();
      context.setFileParams(val);
    }

    val = context.getFileParams();
    Iterator var2;
    String key;
    Map headers;
    if (val != null) {
      headers = val.asMap();
      var2 = headers.keySet().iterator();

      while (var2.hasNext()) {
        key = (String) var2.next();
        Collection<ByteWrapper> byteWrappers = (Collection) headers.get(key);
        Iterator var3 = byteWrappers.iterator();

        while (var3.hasNext()) {
          ByteWrapper byteWrapper = (ByteWrapper) var3.next();
          builder.add(key, byteWrapper.getData());
        }
      }
    }

    if (api.getHeaders() != null && api.getHeaders().size() > 0) {
      headers = api.getHeaders();
      var2 = headers.keySet().iterator();

      while (var2.hasNext()) {
        key = (String) var2.next();
        builder.header(key, (String) headers.get(key));
      }
    }

    String apiName = api.getName();
    String url = context.getUrl();
    if (apiName != null) {
      String service = apiName.substring(0, apiName.lastIndexOf("."));
      key = apiName.substring(apiName.lastIndexOf(".") + 1, apiName.length());
      String version = api.getVersion();
      url = String.format("%s%s%s%s", context.getUrl(), service, version, key);
    }

    builder.header("User-Agent", "X-CSX-Client 1.0.0 - Java");
    HttpClient.Params params = builder.build();

    if (api.hasFiles() && val != null && val.size() > 0) {
      params.setContentType(ContentType.MULTIPART_FORM_DATA);
    } else {
      params.setContentType(context.getContentType());
    }

    if ("GET".equalsIgnoreCase(method)) {
      return this.httpClient.get(url, params);
    } else if ("POST".equalsIgnoreCase(method)) {
      return this.httpClient.post(url, params);
    } else if ("PUT".equalsIgnoreCase(method)) {
      return this.httpClient.put(url, params);
    } else if ("DELETE".equalsIgnoreCase(method)) {
      return this.httpClient.delete(url, params);
    } else {
      throw new ApiException("Unknown http method, known(GET, POST, PUT, DELETE)");
    }
  }
}
