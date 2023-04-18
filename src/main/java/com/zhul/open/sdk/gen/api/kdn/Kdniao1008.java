package com.zhul.open.sdk.gen.api.kdn;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1008Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1008Result;

/**
 * 轨迹订阅接口
 * Created by yanglikai on 2019/3/21.
 */
public class Kdniao1008 extends AbstractAPI {
  @Override
  public String getHttpMethod() {
    return "POST";
  }

  @Override
  public Class getResultModelClass() {
    return Kdniao1008Result.class;
  }

  @Override
  public Class getParamModelClass() {
    return Kdniao1008Params.class;
  }

  @Override
  public String getHttpUrl() {
    return "http://api.kdniao.com/Ebusiness/EbusinessOrderHandle.aspx";
  }
}
