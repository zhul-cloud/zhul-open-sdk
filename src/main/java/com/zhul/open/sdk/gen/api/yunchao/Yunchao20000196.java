package com.zhul.open.sdk.gen.api.yunchao;


import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000196Params;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000196Result;

/**
 * 多门店商品移动平均价
 * Created by yanglikai on 2019/5/23.
 */
public class Yunchao20000196 extends AbstractAPI {

  private String host;

  public Yunchao20000196(String host) {
    this.host = host;
  }

  @Override
  public String getHttpMethod() {
    return "GET";
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public Class getResultModelClass() {
    return Yunchao20000196Result.class;
  }

  @Override
  public Class getParamModelClass() {
    return Yunchao20000196Params.class;
  }

  @Override
  public String getHttpUrl() {
    // http://openapis.yonghui.cn/yhds/api/query
    return host + "/yhds/api/query";
  }
}
