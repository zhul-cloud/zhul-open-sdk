package com.zhul.open.sdk.gen.model.kdn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 即时查询(增值版)
 * Created by yanglikai on 2019/3/21.
 */
@Data
public class Kdniao8001Params extends KdniaoParams {

  @JsonProperty(value = "OrderCode")
  private String orderCode;    // 订单编号

  @JsonProperty(value = "CustomerName")
  private String customerName; // 商家编码

  @JsonProperty(value = "ShipperCode")
  private String shipperCode;  // 快递公司编码

  @JsonProperty(value = "LogisticCode")
  private String logisticCode; // 快递单号

  public Kdniao8001Params() {
    super("8001");
  }

  public Kdniao8001Params(String requestType) {
    super(requestType);
  }
}
