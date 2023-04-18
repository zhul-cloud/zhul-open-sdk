package com.zhul.open.sdk.gen.api.kdn;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1007Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1007Result;

/**
 * 电子面单接口
 * Created by yanglikai on 2019/3/20.
 */
public class Kdniao1007 extends AbstractAPI {
  @Override
  public String getHttpMethod() {
    return "POST";
  }

  @Override
  public Class getResultModelClass() {
    return Kdniao1007Result.class;
  }

  @Override
  public Class getParamModelClass() {
    return Kdniao1007Params.class;
  }

  @Override
  public String getHttpUrl() {
    return "http://api.kdniao.com/api/EOrderService";
  }
}
