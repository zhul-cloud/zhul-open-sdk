package com.zhul.open.sdk.model;

/** Created by yanglikai on 2019/5/23. */
public enum AuthType {
  /** */
  SIGN("sign"),
  TOKEN("token"),
  SIMPLE("simple"),
  BASIC("basic"),
  JSON("json"),
  TOKEN_BASED_BASIC("tokenBasedBasic");

  private String value;

  private AuthType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
