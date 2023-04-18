package com.zhul.open.sdk.gen.model.kdn;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 电子面单
 * Created by yanglikai on 2019/3/20.
 */
@Data
public class Kdniao1007Result extends KdniaoResult {

  @JsonProperty(value = "Order")
  private Order order;

  /**
   * 订单信息
   */
  @Data
  public static class Order implements Serializable {
    @JsonProperty(value = "OrderCode")
    private String orderCode;      // 订单编号

    @JsonProperty(value = "ShipperCode")
    private String shipperCode;    // 快递公司编码

    @JsonProperty(value = "LogisticCode")
    private String logisticCode;   // 快递单号

    @JsonProperty(value = "OriginCode")
    private String originCode;     // 始发地区域编码

    @JsonProperty(value = "DestinatioCode")
    private String destinatioCode; // 目的地区域编码

    @JsonProperty(value = "KDNOrderCode")
    private String kdnOrderCode;   // 快递鸟订单号
  }
}
