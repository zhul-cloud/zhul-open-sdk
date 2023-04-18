package com.zhul.open.sdk.client.executor;

import com.google.common.collect.Maps;
import com.zhul.open.sdk.api.API;
import com.zhul.open.sdk.client.auth.BearerToken;
import com.zhul.open.sdk.util.http.HttpClient;
import java.util.Map;
import java.util.Optional;
import org.apache.http.entity.ContentType;

/**
 * @author huangjinzhou
 * @date 2020/2/6
 */
public class BearerTokenExecutor extends AbstractExecutor {

  private final BearerToken token;

  public BearerTokenExecutor(HttpClient httpClient, BearerToken token) {
    this.token = token;
    super.httpClient = httpClient;
  }

  @Override
  protected void prepare(ExecutionContext context) {
    API api = context.getApi();

    Map<String, Object> finalParams = Maps.newHashMap();
    finalParams.putAll(api.getAPIParams().toParams());
    context.setParams(finalParams);
    context.setUrl(api.getHttpUrl());
    context.setContentType(
        Optional.ofNullable(api.getContentType()).orElse(ContentType.APPLICATION_JSON));
    api.getHeaders().put("Authorization", "Bearer ".concat(this.token.getAccessToken()));
  }
}
