package com.zhul.open.sdk.client.executor;

import com.google.common.collect.Maps;
import com.zhul.open.sdk.api.API;
import com.zhul.open.sdk.client.auth.Basic;
import com.zhul.open.sdk.util.http.HttpClient;
import java.util.Map;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.entity.ContentType;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class BasicExecutor extends AbstractExecutor {
  private Basic basic;

  public BasicExecutor(HttpClient httpClient, Basic basic) {
    this.basic = basic;
    this.httpClient = httpClient;
  }

  @Override
  protected void prepare(ExecutionContext context) {
    API api = context.getApi();
    Map<String, String> headers = api.getHeaders();
    String basicAuth = basic.getUserName().concat(":").concat(basic.getPassword());
    Base64 base64 = new Base64();
    String encodeVal = new String(base64.encode(basicAuth.getBytes()));
    headers.put("Authorization", "Basic ".concat(encodeVal));

    Map<String, Object> params = api.getAPIParams().toParams();
    Map<String, Object> newParams = Maps.newHashMap();
    for (Map.Entry<String, Object> entry : params.entrySet()) {
      String key = entry.getKey();
      Object value = entry.getValue();

      newParams.put(key, value);
    }

    context.setParams(newParams);
    context.setUrl(api.getHttpUrl());
    context.setContentType(ContentType.APPLICATION_JSON);
  }
}
