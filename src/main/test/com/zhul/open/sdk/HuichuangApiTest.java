package com.zhul.open.sdk;

import com.zhul.open.sdk.client.manager.HuichuangApiManager;
import com.zhul.open.sdk.gen.model.huichuang.SMS1015Params;
import com.zhul.open.sdk.gen.model.huichuang.SMS1015Result;
import com.zhul.open.sdk.properties.HuichuangProperties;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class HuichuangApiTest {

  @Test
  public void testToSMS1015() {
    HuichuangProperties properties = new HuichuangProperties();
    properties.setHost("http://mms-thirdparty-t1.yonghuivip.com");

    List<SMS1015Params.Item> items = new ArrayList<>();
    SMS1015Params.Item item0 = new SMS1015Params.Item();
    item0.setShopCode("9l07");
    item0.setSkuCode("10");
    item0.setDeliveryLocationCode("sw003");
    items.add(item0);

    SMS1015Params.Item item00 = new SMS1015Params.Item();
    item00.setShopCode("9l07");
    item00.setSkuCode("102498");
    item00.setDeliveryLocationCode("sw072");
    items.add(item00);

    SMS1015Params params = new SMS1015Params();
    params.setItems(items);

    SMS1015Result result = HuichuangApiManager.init().setup(properties).request(params);
    System.out.println(result);
  }
}
