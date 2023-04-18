package com.zhul.open.sdk.client.processor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpStatus;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class COMM0001Processor implements ResponsePostProcessor {
    @Override
    public String execute(String response) {
        if (isOK(response) == true) {
            return proc4Succ(response);
        }

        return proc4Failed(response);
    }


    public boolean isOK(String response) {
        Object obj = JSON.parse(response);
        if (obj instanceof JSONObject && ((JSONObject)obj).containsKey("ITEM")) {
                return true;
            }

        return false;
    }

    private String proc4Succ(String response) {
        JSONObject result = new JSONObject();
        result.put("response", JSON.parseObject(response));
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
