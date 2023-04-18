package com.zhul.open.sdk.gen.api.purchase;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.purchase.FetchTokenParams;
import com.zhul.open.sdk.gen.model.purchase.FetchTokenResult;
import org.apache.http.entity.ContentType;

/**
 * @author huangjinzhou
 * @date 2020/2/10
 */
public class FetchToken extends AbstractAPI {

  private final String authUrl;

  public FetchToken(String authUrl) {
    this.authUrl = authUrl;
  }

  @Override
  public String getHttpMethod() {
    return "POST";
  }

  @Override
  public ContentType getContentType() {
    return ContentType.APPLICATION_JSON;
  }

  @Override
  public Class<FetchTokenResult> getResultModelClass() {
    return FetchTokenResult.class;
  }

  @Override
  public Class<FetchTokenParams> getParamModelClass() {
    return FetchTokenParams.class;
  }

  @Override
  public String getHttpUrl() {
    return this.authUrl;
  }
}
