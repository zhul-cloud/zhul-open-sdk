package com.zhul.open.sdk.gen.api.huichuang;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.huichuang.SMS1015Params;
import com.zhul.open.sdk.gen.model.huichuang.SMS1015Result;

/**
 * 判断云创商品是否可下单
 * Created by yanglikai on 2019/5/23.
 */
public class SMS1015 extends AbstractAPI {

  private static final String PATH = "/sap/checkskuavailableforsale";

  private String host;

  public SMS1015(String host) {
    this.host = host;
  }

  @Override
  public String getHttpMethod() {
    return "POST";
  }

  @Override
  public Class getResultModelClass() {
    return SMS1015Result.class;
  }

  @Override
  public Class getParamModelClass() {
    return SMS1015Params.class;
  }

  @Override
  public String getHttpUrl() {
    //return "http://mms-thirdparty-t1.yonghuivip.com/sap/checkskuavailableforsale";
    return host + PATH;
  }
}
