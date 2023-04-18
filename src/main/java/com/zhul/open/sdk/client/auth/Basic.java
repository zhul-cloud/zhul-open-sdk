package com.zhul.open.sdk.client.auth;

import com.zhul.open.sdk.model.AuthType;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class Basic implements Auth {
  private String userName;
  private String password;

  public Basic(String userName, String password) {
    if (StringUtils.isBlank(userName)) {
      throw new IllegalArgumentException("username can't be empty");
    } else if (StringUtils.isBlank(password)) {
      throw new IllegalArgumentException("password can't be empty");
    }

    this.userName = userName;
    this.password = password;
  }

  public String getUserName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public AuthType getType() {
    return AuthType.BASIC;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Basic basic = (Basic) o;

    return new EqualsBuilder()
        .append(userName, basic.userName)
        .append(password, basic.password)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(userName)
        .append(password)
        .toHashCode();
  }
}
