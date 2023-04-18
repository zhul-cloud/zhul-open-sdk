package com.zhul.open.sdk.gen.api.yunchao;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000198Params;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000198Result;

/**
 * 云超物流库存查询
 * Created by yanglikai on 2019/5/23.
 */
public class Yunchao20000198 extends AbstractAPI {

  private String host;

  public Yunchao20000198(String host) {
    this.host = host;
  }

  @Override
  public String getHttpMethod() {
    return "GET";
  }

  @Override
  public Class getResultModelClass() {
    return Yunchao20000198Result.class;
  }

  @Override
  public Class getParamModelClass() {
    return Yunchao20000198Params.class;
  }

  @Override
  public String getHttpUrl() {
    // http://openapis.yonghui.cn/yhds/api/query
    return host + "/yhds/api/query";
  }
}
