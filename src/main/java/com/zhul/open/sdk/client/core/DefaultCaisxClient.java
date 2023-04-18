package com.zhul.open.sdk.client.core;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multimap;
import com.zhul.open.sdk.api.API;
import com.zhul.open.sdk.api.APIFactory;
import com.zhul.open.sdk.client.auth.Auth;
import com.zhul.open.sdk.client.auth.Basic;
import com.zhul.open.sdk.client.auth.BearerToken;
import com.zhul.open.sdk.client.auth.Json;
import com.zhul.open.sdk.client.auth.Sign;
import com.zhul.open.sdk.client.auth.Simple;
import com.zhul.open.sdk.client.auth.Token;
import com.zhul.open.sdk.client.executor.BasicExecutor;
import com.zhul.open.sdk.client.executor.BearerTokenExecutor;
import com.zhul.open.sdk.client.executor.ExecutionContext;
import com.zhul.open.sdk.client.executor.Executor;
import com.zhul.open.sdk.client.executor.JsonExecutor;
import com.zhul.open.sdk.client.executor.SignExecutor;
import com.zhul.open.sdk.client.executor.SimpleExecutor;
import com.zhul.open.sdk.client.executor.TokenExecutor;
import com.zhul.open.sdk.client.processor.ResponsePostProcessor;
import com.zhul.open.sdk.exception.ApiException;
import com.zhul.open.sdk.model.ByteWrapper;
import com.zhul.open.sdk.model.ErrorResponse;
import com.zhul.open.sdk.model.Response;
import com.zhul.open.sdk.util.http.DefaultHttpClient;
import com.zhul.open.sdk.util.http.HttpClient;
import com.zhul.open.sdk.util.json.JSONUtils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/** Created by yanglikai on 2019/5/23. */
public class DefaultCaisxClient implements CaisxClient {
  private HttpClient httpClient = new DefaultHttpClient();
  private Auth auth;
  private ResponsePostProcessor responsePostProcessor;

  public DefaultCaisxClient(Auth auth, ResponsePostProcessor responsePostProcessor) {
    this.auth = auth;
    this.responsePostProcessor = responsePostProcessor;
  }

  @Override
  public <T> T invoke(API api) {
    Preconditions.checkArgument(api != null, "API不能为空");
    Preconditions.checkArgument(api.getAPIParams() != null, "API参数不能为空");
    String result = this._execute(this.auth, api);
    this.handleError(result);

    //noinspection unchecked
    return (T)
        Optional.ofNullable(JSON.parseObject(result))
            .map(o -> o.get("response"))
            .map(Objects::toString)
            .map(s -> JSON.parseObject(s, api.getResultModelClass()))
            .orElse(null);
  }

  @Override
  public String execute(API api) {
    Preconditions.checkArgument(this.auth != null, "Auth can't be null");
    Preconditions.checkArgument(api != null, "API can't be null");
    return this._execute(this.auth, api);
  }

  private String _execute(Auth auth, API api) {
    Preconditions.checkArgument(auth != null, "Auth can't be null");
    Preconditions.checkArgument(api != null, "API can't be null");
    Executor executor = null;
    switch (auth.getType().ordinal()) {
      case 0:
        if ((auth instanceof Sign) == false) {
          throw new ApiException("Auth type not match, expected sign");
        }

        executor = new SignExecutor(this.httpClient, (Sign) auth);
        break;
      case 1:
        if ((auth instanceof Token) == false) {
          throw new ApiException("Auth type not match, expected token");
        }
        executor = new TokenExecutor(this.httpClient, (Token) auth);
        break;
      case 2:
        if ((auth instanceof Simple) == false) {
          throw new ApiException("Auth type not match, expected simple");
        }
        executor = new SimpleExecutor(this.httpClient, (Simple) auth);
        break;
      case 3:
        if ((auth instanceof Basic) == false) {
          throw new ApiException("Auth type not match, expected basic");
        }
        executor = new BasicExecutor(this.httpClient, (Basic) auth);
        break;
      case 4:
        if ((auth instanceof Json) == false) {
          throw new ApiException("Auth type not match, expected json");
        }
        executor = new JsonExecutor(this.httpClient, (Json) auth);
        break;
      case 5:
        if (!(auth instanceof BearerToken)) {
          throw new ApiException("Auth type not match, expected token based basic");
        }

        executor = new BearerTokenExecutor(this.httpClient, (BearerToken) auth);
        break;
      default:
        throw new ApiException("Unknown auth type");
    }

    executor.registerResponsePostProcessor(responsePostProcessor);

    ExecutionContext context = new ExecutionContext();
    context.setApi(api);
    context.setUrl(api.getHttpUrl());
    return executor.execute(context);
  }

  @Override
  public String execute(
      String apiName,
      String apiVersion,
      String httpMethod,
      Map<String, Object> params,
      Multimap<String, ByteWrapper> fileParams) {
    API api = APIFactory.create(apiName, apiVersion, httpMethod, params, fileParams);
    return this.execute(api);
  }

  @Override
  public String getVersion() {
    return "1.0.0";
  }

  @Override
  public void close() throws IOException {
    this.httpClient.close();
  }

  private void handleError(String result) {
    Response<ErrorResponse> response =
        JSONUtils.tBean(result, new TypeReference<Response<ErrorResponse>>() {});
    if (response != null && response.getErrorResponse() != null) {
      ErrorResponse errorResponse = (ErrorResponse) response.getErrorResponse();
      throw new ApiException(errorResponse.toString());
    }
  }
}
