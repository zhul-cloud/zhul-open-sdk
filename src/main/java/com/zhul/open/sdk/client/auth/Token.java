package com.zhul.open.sdk.client.auth;

import com.zhul.open.sdk.model.AuthType;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class Token implements Auth {
  private String accessToken;

  public Token(String accessToken) {
    if (StringUtils.isBlank(accessToken)) {
      throw new IllegalArgumentException("Access token can't be null");
    } else {
      this.accessToken = accessToken;
    }
  }

  public String getAccessToken() {
    return accessToken;
  }

  @Override
  public AuthType getType() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;

    if (o == null || getClass() != o.getClass()) return false;

    Token token = (Token) o;

    return new EqualsBuilder()
        .append(accessToken, token.accessToken)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(accessToken)
        .toHashCode();
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Token{");
    sb.append("accessToken='").append(accessToken).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
