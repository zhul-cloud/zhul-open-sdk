package com.zhul.open.sdk.client.executor;

import com.google.common.collect.Maps;
import com.zhul.open.sdk.api.API;
import com.zhul.open.sdk.client.auth.Json;
import com.zhul.open.sdk.util.http.HttpClient;
import java.util.Map;
import org.apache.http.entity.ContentType;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class JsonExecutor extends AbstractExecutor {
  private Json json;

  public JsonExecutor(HttpClient httpClient, Json json) {
    this.json = json;
    this.httpClient = httpClient;
  }

  @Override
  protected void prepare(ExecutionContext context) {
    API api = context.getApi();
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
