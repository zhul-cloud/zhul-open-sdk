package com.zhul.open.sdk.gen.model.kdn;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * 即时查询
 * Created by yanglikai on 2019/3/21.
 */
@Data
public class Kdniao1002Result extends KdniaoResult {

  @JsonProperty(value = "OrderCode")
  private String orderCode;    // 订单编号

  @JsonProperty(value = "ShipperCode")
  private String shipperCode;  // 快递公司编码

  @JsonProperty(value = "LogisticCode")
  private String logisticCode; // 快递单号

  @JsonProperty(value = "State")
  private Integer state;       // 物流状态(0-无轨迹、1-已揽收、2-在途中、3-签收、4-问题件)

  @JsonProperty(value = "Traces")
  private List<Trace> traces;  // 物流轨迹

  /**
   * 轨迹
   */
  @Data
  public static class Trace implements Serializable {
    @JsonProperty(value = "AcceptTime")
    private String acceptTime;    // 轨迹发生时间

    @JsonProperty(value = "AcceptStation")
    private String acceptStation; // 轨迹描述
  }
}
