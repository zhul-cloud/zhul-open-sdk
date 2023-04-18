package com.zhul.open.sdk.client.processor;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpStatus;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class SapProcessor implements ResponsePostProcessor {
  @Override
  public String execute(String response) {
    if (isOK(response) == true) {
      return proc4Succ(response);
    }

    return proc4Failed(response);
  }


  public boolean isOK(String response) {
    if (String.valueOf(HttpStatus.SC_ACCEPTED).equals(response)) {
      return true;
    }

    return false;
  }

  private String proc4Succ(String response) {
    JSONObject rsp = new JSONObject();
    rsp.put("success", true);
    rsp.put("code", response);
    rsp.put("message", "ok");

    JSONObject result = new JSONObject();
    result.put("response", rsp);
    return result.toJSONString();
  }

  private String proc4Failed(String response) {
    JSONObject error = new JSONObject();
    error.put("code", response);
    error.put("msg", "");

    JSONObject result = new JSONObject();
    result.put("error_response", error);
    return result.toJSONString();
  }
}
