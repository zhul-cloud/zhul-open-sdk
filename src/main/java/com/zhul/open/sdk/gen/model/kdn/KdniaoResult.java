package com.zhul.open.sdk.gen.model.kdn;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

/**
 * Created by yanglikai on 2019/3/20.
 */
@Data
public class KdniaoResult implements APIResult {

  @JsonProperty(value = "EBusinessID")
  private String businessID;           // 用户ID

  @JsonProperty(value = "ResultCode")
  private String resultCode;           // 返回编码

  @JsonProperty(value = "Reason")
  private String reason;               // 原因

  @JsonProperty(value = "Success")
  private Boolean success = Boolean.FALSE;

  @JsonProperty(value = "UniquerRequestNumber")
  private String uniquerRequestNumber; // 唯一标识

  @JsonProperty(value = "PrintTemplate")
  private String printTemplate;        // 面单打印模板内容(html格式)
}
