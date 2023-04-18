package com.zhul.open.sdk.client.processor;

/**
 * @author huangjinzhou
 * @date 2020/2/10
 */
public class NoOpeResponsePostProcessor implements ResponsePostProcessor {

  @Override
  public String execute(String response) {
    return response;
  }
}
