package com.zhul.open.sdk.exception;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class ApiException extends RuntimeException {
  public ApiException() {
  }

  public ApiException(String msg) {
    super(msg);
  }

  public ApiException(String message, Throwable cause) {
    super(message, cause);
  }

  public ApiException(Throwable cause) {
    super(cause);
  }
}
