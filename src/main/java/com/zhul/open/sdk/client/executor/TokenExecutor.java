package com.zhul.open.sdk.client.executor;

import com.google.common.collect.Maps;
import com.zhul.open.sdk.api.API;
import com.zhul.open.sdk.client.auth.Token;
import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.util.http.HttpClient;
import com.zhul.open.sdk.util.misc.TimeUtil;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class TokenExecutor extends AbstractExecutor implements Executor {
  private Token token;

  public TokenExecutor(HttpClient httpClient, Token token) {
    this.token = token;
    this.httpClient = httpClient;
  }

  @Override
  protected void prepare(ExecutionContext context) {
    API api = context.getApi();
    APIParams apiParams = api.getAPIParams();
    Map<String, Object> params = apiParams.toParams();
    Map<String, Object> finalParams = Maps.newHashMap();

    String key;
    String newValue;
    for (Iterator var6 = params.keySet().iterator(); var6.hasNext(); finalParams.put(key, newValue)) {
      key = (String) var6.next();
      Object value = params.get(key);
      newValue = value.toString();
      if (value instanceof Date) {
        Date tmp = (Date) value;
        newValue = TimeUtil.formatTime(tmp);
      }
    }

    finalParams.put("access_token", this.token.getAccessToken());
    context.setParams(finalParams);
    context.setUrl(api.getHttpUrl() + "/oauthentry");
  }
}
