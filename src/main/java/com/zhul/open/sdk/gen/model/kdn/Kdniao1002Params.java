package com.zhul.open.sdk.gen.model.kdn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 即时查询
 * Created by yanglikai on 2019/3/21.
 */
@Data
public class Kdniao1002Params extends KdniaoParams {

  @JsonProperty(value = "OrderCode")
  private String orderCode;    // 订单编号

  @JsonProperty(value = "ShipperCode")
  private String shipperCode;  // 快递公司编码

  @JsonProperty(value = "LogisticCode")
  private String logisticCode; // 快递单号

  public Kdniao1002Params() {
    super("1002");
  }

  public Kdniao1002Params(String requestType) {
    super(requestType);
  }
}
