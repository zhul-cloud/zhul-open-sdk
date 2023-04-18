package com.zhul.open.sdk.gen.api.kdn;


import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8008Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8008Result;

/**
 * 轨迹订阅接口(增值版)
 * Created by yanglikai on 2019/3/21.
 */
public class Kdniao8008 extends AbstractAPI {
  @Override
  public String getHttpMethod() {
    return "POST";
  }

  @Override
  public Class getResultModelClass() {
    return Kdniao8008Result.class;
  }

  @Override
  public Class getParamModelClass() {
    return Kdniao8008Params.class;
  }

  @Override
  public String getHttpUrl() {
    return "http://api.kdniao.com/Ebusiness/EbusinessOrderHandle.aspx";
  }
}
