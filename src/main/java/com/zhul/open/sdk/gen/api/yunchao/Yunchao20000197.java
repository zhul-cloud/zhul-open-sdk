package com.zhul.open.sdk.gen.api.yunchao;


import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000197Params;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000197Result;

/**
 * 云超门店库存查询
 * Created by yanglikai on 2019/5/23.
 */
public class Yunchao20000197 extends AbstractAPI {

  private String host;

  public Yunchao20000197(String host) {
    this.host = host;
  }

  @Override
  public String getHttpMethod() {
    return "GET";
  }

  @Override
  public Class getResultModelClass() {
    return Yunchao20000197Result.class;
  }

  @Override
  public Class getParamModelClass() {
    return Yunchao20000197Params.class;
  }

  @Override
  public String getHttpUrl() {
    // http://openapis.yonghui.cn/yhds/api/query
    return host + "/yhds/api/query";
  }
}
