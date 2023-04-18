package com.zhul.open.sdk.gen.api.sap;


import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.sap.B2B1001Params;
import com.zhul.open.sdk.gen.model.sap.B2B1001Result;

/**
 * 内部销售订单
 * （已切换辉创系统的云创门店，在彩食鲜系统制作销售订单后上传给SAP生成正式销售订单）
 * Created by yanglikai on 2019/5/23.
 */
public class B2B1001 extends AbstractAPI {

  private String host;

  public B2B1001(String host) {
    this.host = host;
  }

  @Override
  public String getHttpMethod() {
    return "POST";
  }

  @Override
  public Class getResultModelClass() {
    return B2B1001Result.class;
  }

  @Override
  public Class getParamModelClass() {
    return B2B1001Params.class;
  }

  @Override
  public String getHttpUrl() {
    StringBuffer sb = new StringBuffer();
    sb.append("http://");
    sb.append(host);
    sb.append("/RESTAdapter/B2B1001");

    return sb.toString();
  }
}
