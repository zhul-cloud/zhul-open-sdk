package com.zhul.open.sdk.client.auth;

import com.zhul.open.sdk.model.AuthType;
import org.apache.commons.lang3.StringUtils;

/**
 * @author huangjinzhou
 * @date 2020/2/10
 */
public class BearerToken implements Auth {

  private String accessToken;

  public BearerToken(String accessToken) {
    if (StringUtils.isBlank(accessToken)) {
      throw new IllegalArgumentException("Access token can't be null");
    }

    this.accessToken = accessToken;
  }

  @Override
  public AuthType getType() {
    return AuthType.TOKEN_BASED_BASIC;
  }

  public String getAccessToken() {
    return accessToken;
  }
}
