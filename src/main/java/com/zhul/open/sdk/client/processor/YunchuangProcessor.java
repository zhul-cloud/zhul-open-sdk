package com.zhul.open.sdk.client.processor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 辉创接口后置处理器
 * Created by dinglj on 2019/10/23.
 */
public class YunchuangProcessor implements ResponsePostProcessor {

  @Override
  public String execute(String response) {
    if (isOK(response) == true) {
      return proc4Succ(response);
    }

    return proc4Failed(response);
  }


  public boolean isOK(String response) {
    Object obj = JSON.parse(response);
    if (obj instanceof JSONObject) {
      JSONObject rspJson = JSON.parseObject(response);
      if (rspJson.containsKey("code")) {
        return true;
      }
    }

    return false;
  }


  private String proc4Succ(String response) {
    JSONObject rsp = new JSONObject();
    rsp.put("response", JSON.parseObject(response));
    return rsp.toJSONString();
  }

  private String proc4Failed(String response) {
    JSONObject error = new JSONObject();
    error.put("code", "HC_500");
    error.put("msg", response);

    JSONObject result = new JSONObject();
    result.put("error_response", error);
    return result.toJSONString();
  }
}
