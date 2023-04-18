package com.zhul.open.sdk.client.processor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhul.open.sdk.client.processor.ResponsePostProcessor;

/**
 * Created by yanglikai on 2019/3/20.
 */
public class KdniaoNormalPostProcessor implements ResponsePostProcessor {
  @Override
  public String execute(String response) {
    if (isOK(response) == true) {
      return proc4Succ(response);
    }

    return proc4Failed(response);
  }

  public boolean isOK(String response) {
    JSONObject rspJson;
    try {
      rspJson = JSON.parseObject(response);
    } catch (ClassCastException e) {
      String message = e.getMessage();
      throw new ClassCastException(message + "  ,response:" + response);
    }
    if (rspJson == null) {
      return false;
    }
    boolean success = rspJson.getBoolean("Success");
    if (success == false) {
      return false;
    }

    return true;
  }


  private String proc4Succ(String response) {
    JSONObject rsp = new JSONObject();
    rsp.put("response", JSONObject.parseObject(response));
    return rsp.toJSONString();
  }

  private String proc4Failed(String response) {
    JSONObject rspJson = JSON.parseObject(response);
    String code = rspJson.getString("ResultCode");
    String message = rspJson.getString("Reason");

    JSONObject error = new JSONObject();
    error.put("code", code);
    error.put("msg", message);

    JSONObject result = new JSONObject();
    result.put("error_response", error);
    return result.toJSONString();
  }
}
