package com.zhul.open.sdk.gen.model.kdn;

import lombok.Data;

/**
 * 轨迹订阅
 * Created by yanglikai on 2019/3/21.
 */
@Data
public class Kdniao1008Params extends Kdniao1007Params {

  public Kdniao1008Params(String requestType) {
    super(requestType);
  }

  public Kdniao1008Params() {
    super("1008");
  }
}
