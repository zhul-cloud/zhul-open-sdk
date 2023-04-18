package com.zhul.open.sdk;

import com.zhul.open.sdk.client.manager.YunchaoApiManager;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000196Params;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000196Result;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000197Params;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000197Result;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000198Params;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000198Result;
import com.zhul.open.sdk.properties.YunchaoProperties;
import org.junit.Test;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class YunchaoApiTest {

  @Test
  public void test4Yunchao20000196() {
    YunchaoProperties properties = new YunchaoProperties();
    properties.setHost("http://openapis.yonghui.cn");

    Yunchao20000196Params params = new Yunchao20000196Params();
    params.setShopId("9906");
    params.setProductCode("934564");

    Yunchao20000196Result result = YunchaoApiManager.init().setup(properties).request(params);
    System.out.println(result);
  }

  @Test
  public void test4Yunchao20000197() {
    YunchaoProperties properties = new YunchaoProperties();
    properties.setHost("http://openapis.yonghui.cn");

    Yunchao20000197Params params = new Yunchao20000197Params();
    params.setShopId("9973");
    params.setProductCode("156458");

    Yunchao20000197Result result = YunchaoApiManager.init().setup(properties).request(params);
    System.out.println(result);
  }


  @Test
  public void test4Yunchao2000198() {
    YunchaoProperties properties = new YunchaoProperties();
    properties.setHost("http://openapis.yonghui.cn");

    Yunchao20000198Params params = new Yunchao20000198Params();
    params.setDcId("9971");
    params.setProductCode("658946");

    Yunchao20000198Result result = YunchaoApiManager.init().setup(properties).request(params);
    System.out.println(result);
  }
}
