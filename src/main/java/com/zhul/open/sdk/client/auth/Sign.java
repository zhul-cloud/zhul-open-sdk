package com.zhul.open.sdk.client.auth;

import com.zhul.open.sdk.model.AuthType;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class Sign implements Auth {
  private String appId;
  private String appSecret;

  public Sign(String appId, String appSecret) {
    if (StringUtils.isBlank(appId)) {
      throw new IllegalArgumentException("App id can't be empty");
    } else if (StringUtils.isBlank(appSecret)) {
      throw new IllegalArgumentException("App secret can't be empty");
    }

    this.appId = appId;
    this.appSecret = appSecret;
  }

  public String getAppId() {
    return appId;
  }

  public String getAppSecret() {
    return appSecret;
  }

  @Override
  public AuthType getType() {
    return AuthType.SIGN;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Sign sign = (Sign) o;

    return new EqualsBuilder()
        .append(appId, sign.appId)
        .append(appSecret, sign.appSecret)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(appId)
        .append(appSecret)
        .toHashCode();
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Sign{");
    sb.append("appId='").append(appId).append('\'');
    sb.append(", appSecret='").append(appSecret).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
