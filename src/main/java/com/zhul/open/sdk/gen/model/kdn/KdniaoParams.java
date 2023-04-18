package com.zhul.open.sdk.gen.model.kdn;

import cn.hutool.core.codec.Base64;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.util.json.JSONUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

/**
 * Created by yanglikai on 2019/3/20.
 */
@Data
public abstract class KdniaoParams implements APIParams {

  @JsonIgnore
  private String apiKey;      // API Key

  @JsonIgnore
  private String businessID;  // 用户ID

  @JsonIgnore
  private String requestType; // 请求接口指令

  //public KdniaoParams(String requestType) {
  //  this(ResourceConfig.kdniaoApiKey(), ResourceConfig.kdniaoBusinessID(), requestType);
  //}

  public KdniaoParams(String requestType) {
    this("", "", requestType);
  }

  public KdniaoParams(String apiKey, String businessID, String requestType) {
    this.apiKey = apiKey;
    this.businessID = businessID;
    this.requestType = requestType;
  }

  @Override
  public Map<String, Object> toParams() {
    Map<String, Object> params = new HashMap();

    try {
      String requestData = JSONUtils.tJSON(this);
      params.put("RequestData", requestData);
      params.put("EBusinessID", businessID);
      params.put("RequestType", requestType);
      String dataSign = encrypt(requestData, apiKey, "UTF-8");
      params.put("DataSign", dataSign);
      params.put("DataType", "2");
    } catch (Exception e) {
      e.printStackTrace();
    }

    return params;
  }

  private String encrypt(String content, String keyValue, String charset) throws UnsupportedEncodingException, Exception {
    if (keyValue != null) {
      return base64(MD5(content + keyValue, charset), charset);
    }
    return base64(MD5(content, charset), charset);
  }

  private String MD5(String str, String charset) throws Exception {
    MessageDigest md = MessageDigest.getInstance("MD5");
    md.update(str.getBytes(charset));
    byte[] result = md.digest();
    StringBuffer sb = new StringBuffer(32);
    for (int i = 0; i < result.length; i++) {
      int val = result[i] & 0xff;
      if (val <= 0xf) {
        sb.append("0");
      }
      sb.append(Integer.toHexString(val));
    }
    return sb.toString().toLowerCase();
  }

  private String base64(String str, String charset) throws UnsupportedEncodingException {
    String encoded = Base64.encode(str.getBytes(charset));
    return encoded;
  }
}
