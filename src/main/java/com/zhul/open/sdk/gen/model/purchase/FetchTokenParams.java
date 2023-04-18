package com.zhul.open.sdk.gen.model.purchase;

import com.alibaba.fastjson.JSON;
import com.zhul.open.sdk.model.APIParams;
import java.util.Map;
import lombok.Data;

/**
 * @author huangjinzhou
 * @date 2020/2/10
 */
@Data
public class FetchTokenParams implements APIParams {

  /** secretId : 1233 secretKey : HHK4VTQsSGEOXOO2aetzxRZIKewvaOH5 */
  private String secretId;

  private String secretKey;

  /** 单位：分钟 */
  private Integer expires;

  public FetchTokenParams(String secretId, String secretKey, Integer expires) {
    this.secretId = secretId;
    this.secretKey = secretKey;
    this.expires = expires;
  }

  @Override
  public Map<String, Object> toParams() {
    return JSON.parseObject(JSON.toJSONString(this));
  }
}
