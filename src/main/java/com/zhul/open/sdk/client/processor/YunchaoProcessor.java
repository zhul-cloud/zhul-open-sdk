package com.zhul.open.sdk.client.processor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 云超接口后置处理器
 * Created by yanglikai on 2019/5/23.
 */
public class YunchaoProcessor implements ResponsePostProcessor {

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
        String code = rspJson.getString("code");
        if ("S200".equals(code)) {
          return true;
        }
      }
    }

    return false;
  }


  private String proc4Succ(String response) {
    JSONObject result = new JSONObject();

    JSONObject r = JSON.parseObject(response);
    JSONArray array = r.getJSONArray("data");
    result.put("code", r.getString("code"));
    result.put("data", JSON.parse(array.toJSONString()));

    JSONObject rsp = new JSONObject();
    rsp.put("response", result);
    return rsp.toJSONString();
  }

  private String proc4Failed(String response) {
    JSONObject rspJson = JSON.parseObject(response);
    String code = rspJson.getString("code");
    String message = rspJson.getString("message");

    JSONObject error = new JSONObject();
    error.put("code", code);
    error.put("msg", message);

    JSONObject result = new JSONObject();
    result.put("error_response", error);
    return result.toJSONString();
  }
}
