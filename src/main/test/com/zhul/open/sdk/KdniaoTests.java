package com.zhul.open.sdk;

import com.zhul.open.sdk.client.manager.KdniaoAPIManager;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1002Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1002Result;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1007Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1007Result;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1008Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1008Result;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8001Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8001Result;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8008Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8008Result;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * Created by yanglikai on 2019/3/20.
 */
public class KdniaoTests {

  /**
   * 即时查询
   */
  @Test
  public void testTo1002() {
    Kdniao1002Params params = new Kdniao1002Params();
    params.setBusinessID("1454334");
    params.setApiKey("0c98c0b7-0ca4-45a7-b5fd-deaa6b322fc8");
    params.setOrderCode("012657700390");
    params.setShipperCode("SF");
    params.setLogisticCode("254401232179");

    Kdniao1002Result result = KdniaoAPIManager.kdn1002(params);

    System.out.println(result.toString());
  }

  /**
   * 电子面单
   */
  @Test
  public void testTo1007() {
    Kdniao1007Params.Sender sender = new Kdniao1007Params.Sender();
    sender.setCompany("LV");
    sender.setName("Taylor");
    sender.setMobile("15018442396");
    sender.setProvinceName("上海");
    sender.setCityName("上海");
    sender.setExpAreaName("青浦区");
    sender.setAddress("明珠路73号");

    Kdniao1007Params.Receiver receiver = new Kdniao1007Params.Receiver();
    receiver.setCompany("GCCUI");
    receiver.setName("Yann");
    receiver.setMobile("15018442396");
    receiver.setProvinceName("北京");
    receiver.setCityName("北京");
    receiver.setExpAreaName("朝阳区");
    receiver.setAddress("三里屯街道雅秀大厦");

    List<Kdniao1007Params.Commodity> commoditys = new ArrayList<>();
    Kdniao1007Params.Commodity commodity = new Kdniao1007Params.Commodity();
    commodity.setGoodsName("彩食鲜商品");
    commoditys.add(commodity);

    Kdniao1007Params params = new Kdniao1007Params();
    params.setBusinessID("1454334");
    params.setApiKey("0c98c0b7-0ca4-45a7-b5fd-deaa6b322fc8");
    params.setOrderCode("P0300004724101");
    params.setShipperCode("YTO");
    params.setCustomerName("K59176756");
    params.setCustomerPwd("7bR7YGtL");
    params.setPayType("3");
    params.setMonthCode("7bR7YGtL");
    params.setExpType("1");
    params.setCost(1.0);
    params.setOtherCost(0.0);
    params.setSender(sender);
    params.setReceiver(receiver);
    params.setCommodities(commoditys);
    params.setWeight(0.0);
    params.setQuantity(1);
    params.setVolume(0.0);
    params.setRemark("");
    params.setIsReturnPrintTemplate(0);

    Kdniao1007Result result = KdniaoAPIManager.kdn1007(params);

    System.out.println(result.toString());
    System.out.println(result.getSuccess());
    System.out.println(result.getResultCode());
    System.out.println(result.getBusinessID());
  }

  /**
   * 轨迹订阅
   */
  @Test
  public void testTo1008() {
    Kdniao1007Params.Sender sender = new Kdniao1007Params.Sender();
    sender.setName("1255760");
    sender.setTel("");
    sender.setMobile("13700000000");
    sender.setProvinceName("广东省");
    sender.setCityName("深圳市");
    sender.setExpAreaName("福田区");
    sender.setAddress("测试地址");

    Kdniao1007Params.Receiver receiver = new Kdniao1007Params.Receiver();
    receiver.setName("1255760");
    receiver.setTel("");
    receiver.setMobile("13800000000");
    receiver.setProvinceName("广东省");
    receiver.setCityName("深圳市");
    receiver.setExpAreaName("龙华新区");
    receiver.setAddress("测试地址2");

    List<Kdniao1007Params.Commodity> commoditys = new ArrayList<>();
    Kdniao1007Params.Commodity commodity = new Kdniao1007Params.Commodity();
    commodity.setGoodsName("书本");

    Kdniao1008Params params = new Kdniao1008Params();
    params.setBusinessID("1454334");
    params.setApiKey("0c98c0b7-0ca4-45a7-b5fd-deaa6b322fc8");
    params.setShipperCode("SF");
    params.setOrderCode("SF201608081055208281");
    params.setLogisticCode("3100707578976");
    params.setPayType("1");
    params.setExpType("1");
    params.setCustomerName("");
    params.setCustomerPwd("");
    params.setIsNotice(0);
    params.setSender(sender);
    params.setReceiver(receiver);
    params.setCommodities(commoditys);

    Kdniao1008Result result = KdniaoAPIManager.kdn1008(params);

    System.out.println(result.toString());
  }

  /**
   * 即时查询(增值版)
   */
  @Test
  public void testTo8001() {
    Kdniao8001Params params = new Kdniao8001Params();
    params.setBusinessID("1454334");
    params.setApiKey("0c98c0b7-0ca4-45a7-b5fd-deaa6b322fc8");
    //params.setOrderCode("P0300004722101");
    params.setLogisticCode("820474245536");
    params.setShipperCode("YTO");

    Kdniao8001Result result = KdniaoAPIManager.kdn8001(params);

    System.out.println(result.toString());
  }

  /**
   * 轨迹订阅(增值版)
   */
  @Test
  public void testTo8008() {
    Kdniao1007Params.Sender sender = new Kdniao1007Params.Sender();
    sender.setName("1255760");
    sender.setTel("");
    sender.setMobile("13700000000");
    sender.setProvinceName("广东省");
    sender.setCityName("深圳市");
    sender.setExpAreaName("福田区");
    sender.setAddress("测试地址");

    Kdniao1007Params.Receiver receiver = new Kdniao1007Params.Receiver();
    receiver.setName("1255760");
    receiver.setTel("");
    receiver.setMobile("13800000000");
    receiver.setProvinceName("广东省");
    receiver.setCityName("深圳市");
    receiver.setExpAreaName("龙华新区");
    receiver.setAddress("测试地址2");

    List<Kdniao1007Params.Commodity> commoditys = new ArrayList<>();
    Kdniao1007Params.Commodity commodity = new Kdniao1007Params.Commodity();
    commodity.setGoodsName("书本");

    Kdniao8008Params params = new Kdniao8008Params();
    params.setBusinessID("1454334");
    params.setApiKey("0c98c0b7-0ca4-45a7-b5fd-deaa6b322fc8");
    params.setShipperCode("SF");
    params.setOrderCode("SF201608081055208281");
    params.setLogisticCode("3100707578976");
    params.setPayType("1");
    params.setExpType("1");
    params.setCustomerName("");
    params.setCustomerPwd("");
    params.setIsNotice(0);
    params.setSender(sender);
    params.setReceiver(receiver);
    params.setCommodities(commoditys);

    Kdniao8008Result result = KdniaoAPIManager.kdn8008(params);

    System.out.println(result.toString());
  }
}
