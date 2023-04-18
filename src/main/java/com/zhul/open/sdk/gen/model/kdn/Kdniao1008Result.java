package com.zhul.open.sdk.gen.model.kdn;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import lombok.Data;

/**
 * 轨迹订阅
 * Created by yanglikai on 2019/3/21.
 */
@Data
public class Kdniao1008Result extends KdniaoResult {

  @JsonProperty(value = "UpdateTime")
  public Date updateTime;             // 更新时间

  @JsonProperty(value = "EstimatedDeliveryTime")
  private Date estimatedDeliveryTime; // 订单预计到货时间
}
