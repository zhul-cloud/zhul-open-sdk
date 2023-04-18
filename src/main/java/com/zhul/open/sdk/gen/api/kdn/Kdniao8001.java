package com.zhul.open.sdk.gen.api.kdn;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8001Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8001Result;

/**
 * 即时查询接口(增值版)
 * Created by yanglikai on 2019/3/21.
 */
public class Kdniao8001 extends AbstractAPI {
  @Override
  public String getHttpMethod() {
    return "POST";
  }

  @Override
  public Class getResultModelClass() {
    return Kdniao8001Result.class;
  }

  @Override
  public Class getParamModelClass() {
    return Kdniao8001Params.class;
  }

  @Override
  public String getHttpUrl() {
    return "http://api.kdniao.com/Ebusiness/EbusinessOrderHandle.aspx";
  }
}
