package com.zhul.open.sdk;

import com.zhul.open.sdk.client.manager.HuichuangApiManager;
import com.zhul.open.sdk.client.manager.YunchuangApiManager;
import com.zhul.open.sdk.gen.model.huichuang.SMS1015Params;
import com.zhul.open.sdk.gen.model.huichuang.SMS1015Result;
import com.zhul.open.sdk.gen.model.yunchuang.SalesOrderParams;
import com.zhul.open.sdk.gen.model.yunchuang.SalesOrderResult;
import com.zhul.open.sdk.properties.HuichuangProperties;
import com.zhul.open.sdk.properties.YunchuangProperties;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class YunchuangApiTest {

  @Test
  public void testToSMS1015() {
    YunchuangProperties properties = new YunchuangProperties();
    properties.setHost("http://hc-internal-open-api-t1.yonghuivip.com/ecc/saleinvoice/caishixian/receive");


    List<SalesOrderParams.Sheet> sheetList = new ArrayList<>();

    SalesOrderParams.Sheet sheet = new SalesOrderParams.Sheet();
    SalesOrderParams.Header header = new SalesOrderParams.Header();

    List<SalesOrderParams.Item> itemList = new ArrayList<>();

    SalesOrderParams.Item item = new SalesOrderParams.Item();

    /**
     * "deliveryBillNo":1571636906707054,
     *                 "orderBillType":"ZG5",
     *                 "outAddressCompanyCode":2120,
     *                 "accountYear":2019,
     *                 "cancelOriginNo":"",
     *                 "outerInvoiceNo":1571636906707012,
     *                 "financeDate":"20191021",
     *                 "accountDate":"20191021",
     *                 "cancelFlag":"",
     *                 "saleNo":2120,
     *                 "inAddressCode":"S9D13",
     *                 "supplierNo":2120,
     *                 "accountLocationNo":"S9D13",
     *                 "currencyType":"CNY",
     *                 "inAddressCompanyCode":"G5000"
     */
    header.setInvoiceNo("Z1190000001");
    header.setOrderBillType("ZG5");
    header.setSettleDcCode("2120");

    item.setLineNo("1");
    item.setProductCode("7601");
    item.setProductName("冠生园蜂蜜500g");
    item.setProductUnitCode("18");
    item.setInvoiceQuanity("1");
    item.setTaxCode("XI");
    item.setNetPrice(BigDecimal.valueOf(10L));
    item.setTax(BigDecimal.valueOf(0.1D));
    item.setTotalPrice(BigDecimal.valueOf(100L));

    itemList.add(item);

    sheet.setHeader(header);
    sheet.setItem(itemList);

    sheetList.add(sheet);



    SalesOrderParams params = new SalesOrderParams();
    params.setSheet(sheetList);

    SalesOrderResult result = YunchuangApiManager.init().setup(properties).request(params);
    System.out.println(result);
  }
}
