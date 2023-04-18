package com.zhul.open.sdk.client.auth;


import com.zhul.open.sdk.model.AuthType;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class Json implements Auth {
  @Override
  public AuthType getType() {
    return AuthType.JSON;
  }
}
