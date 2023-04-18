package com.zhul.open.sdk.gen.model.kdn;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 * 即时查询(增值版)
 * Created by yanglikai on 2019/3/21.
 */
@Data
public class Kdniao8001Result extends KdniaoResult {

  @JsonProperty(value = "OrderCode")
  private String orderCode;    // 订单编号

  @JsonProperty(value = "ShipperCode")
  private String shipperCode;  // 快递公司编码

  @JsonProperty(value = "LogisticCode")
  private String logisticCode; // 快递单号

  @JsonProperty(value = "Callback")
  private String callback;     // 用户自定义回传字段

  /**
   * 0-无轨迹
   * 1-已揽件
   * 2-在途中
   * 3-签收
   * 4-问题件
   */
  @JsonProperty(value = "State")
  private String state;        // 物流状态

  /**
   * 1-已揽件
   * 2-在途中
   * 201-到达派件城市
   * 202-派件中
   * 211-已放入快递柜或驿站
   * 3-已签收
   * 301-正常签收
   * 302-派件异常后最终签收
   * 304-代收签收
   * 311-快递柜或驿站签收
   * 4-问题件
   * 401-发货无信息
   * 402-超时未签收
   * 403-超时未更新
   * 404-拒收(退件)
   * 405-派件异常
   * 406-退货签收
   * 407-退货未签收
   * 412-快递柜或驿站超时未取
   */
  @JsonProperty(value = "StateEx")
  private String stateEx;      // 物流状态

  @JsonProperty(value = "Location")
  private String location;     // 所在城市

  @JsonProperty(value = "Traces")
  private List<Trace> traces;  // 物流轨迹

  /**
   * 轨迹
   */
  @Data
  public static class Trace implements Serializable {
    @JsonProperty(value = "AcceptTime")
    private Date acceptTime;      // 轨迹发生时间

    @JsonProperty(value = "AcceptStation")
    private String acceptStation; // 轨迹描述

    @JsonProperty(value = "Location")
    private String location;      // 当前城市

    @JsonProperty(value = "Action")
    private String action;        // 当前状态(同StateEx)

    @JsonProperty(value = "Remark")
    private String remark;        // 备注
  }
}
