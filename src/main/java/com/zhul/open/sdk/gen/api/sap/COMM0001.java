package com.zhul.open.sdk.gen.api.sap;


import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.sap.B2B1001Params;
import com.zhul.open.sdk.gen.model.sap.B2B1001Result;
import com.zhul.open.sdk.gen.model.sap.COMM0001Params;
import com.zhul.open.sdk.gen.model.sap.COMM0001Result;

/**
 * 生成凭证后上传给SAP
 */
public class COMM0001 extends AbstractAPI {

  private String url;

  public COMM0001(String url) {
    this.url = url;
  }

  @Override
  public String getHttpMethod() {
    return "POST";
  }

  @Override
  public Class getResultModelClass() {
    return COMM0001Result.class;
  }

  @Override
  public Class getParamModelClass() {
    return COMM0001Params.class;
  }

  @Override
  public String getHttpUrl() {

    return url;
  }
}
