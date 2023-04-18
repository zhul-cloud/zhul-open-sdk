package com.zhul.open.sdk.gen.api.yunchuang;


import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.sap.COMM0001Params;
import com.zhul.open.sdk.gen.model.sap.COMM0001Result;
import com.zhul.open.sdk.gen.model.yunchuang.SalesOrderParams;
import com.zhul.open.sdk.gen.model.yunchuang.SalesOrderResult;

/**
 * 上传云创销售单据
 */
public class SalesOrderAPI extends AbstractAPI {

  private String url;

  public SalesOrderAPI(String url) {
    this.url = url;
  }

  @Override
  public String getHttpMethod() {
    return "POST";
  }

  @Override
  public Class getResultModelClass() {
    return SalesOrderResult.class;
  }

  @Override
  public Class getParamModelClass() {
    return SalesOrderParams.class;
  }

  @Override
  public String getHttpUrl() {

    return url;
  }
}
