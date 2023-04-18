package com.zhul.open.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zhul.open.sdk.client.manager.SapApiManager;
import com.zhul.open.sdk.gen.model.sap.B2B1001Params;
import com.zhul.open.sdk.gen.model.sap.B2B1001Result;
import com.zhul.open.sdk.gen.model.sap.B2BPT1002Result;
import com.zhul.open.sdk.gen.model.sap.B2BPT1003Result;
import com.zhul.open.sdk.gen.model.sap.B2BPT1004Result;
import com.zhul.open.sdk.gen.model.sap.B2BPT1009Params;
import com.zhul.open.sdk.gen.model.sap.COMM0001Params;
import com.zhul.open.sdk.gen.model.sap.COMM0001Result;
import com.zhul.open.sdk.gen.model.sap.CSCM1004Params;
import com.zhul.open.sdk.gen.model.sap.OA061BResult;
import com.zhul.open.sdk.gen.model.sap.YCSMS1001Params;
import com.zhul.open.sdk.gen.model.sap.YCSMS1001Params.Header;
import com.zhul.open.sdk.gen.model.sap.YCSMS1002Result;
import com.zhul.open.sdk.gen.model.sap.YCSMS1003Result;
import com.zhul.open.sdk.gen.model.sap.YCSMS1004Result;
import com.zhul.open.sdk.gen.model.sap.YCSMS1005Params;
import com.zhul.open.sdk.gen.model.sap.YCSMS1008Result;
import com.zhul.open.sdk.gen.model.sap.YCSMS1009Result;
import com.zhul.open.sdk.gen.model.sap.YCSMS1010Params;
import com.zhul.open.sdk.gen.model.sap.YCSMS1011Result;
import com.zhul.open.sdk.gen.model.sap.YCSMS1022Params;
import com.zhul.open.sdk.gen.model.yunchuang.CSXYCC004Params;
import com.zhul.open.sdk.gen.model.yunchuang.CSXYCC007Params;
import com.zhul.open.sdk.gen.model.yunchuang.CSXYCC007Params.Item;
import com.zhul.open.sdk.properties.FtpProperties;
import com.zhul.open.sdk.properties.SapProperties;
import com.zhul.open.sdk.util.misc.XMLUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Test;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class SapApiTest {


  @Test
  public void testCOMM0001() {

    SapProperties sap = new SapProperties();
    sap.setHost("http://10.1.31.19:50000/RESTAdapter/FI/COMM/COMM0001");
    sap.setUserName("PID_FK");
    sap.setPassword("1234qwer");

    COMM0001Params params = new COMM0001Params();

    COMM0001Params.Header header = new COMM0001Params.Header();
    header.setAcDocNo("1");
    COMM0001Params.Item item = new COMM0001Params.Item();
    item.setAccountType("1212");

    COMM0001Params.Header header2 = new COMM0001Params.Header();
    header.setAcDocNo("1");
    COMM0001Params.Item item2 = new COMM0001Params.Item();
    item.setAccountType("1212");

    header.setItems(Arrays.asList(item));
    header2.setItems(Arrays.asList(item2));
    params.setHeaders(Arrays.asList(header, header2));

//    System.out.println( JSONUtils.tJSON(params.toParams()));

    COMM0001Result result = SapApiManager.init().setup(sap).request(params);
    System.out.println(result);


  }


  @Test
  public void testToB2B1001() {
    SapProperties sap = new SapProperties();
    sap.setHost("10.1.31.20:50000");
    sap.setUserName("CSCM_Q");
    sap.setPassword("1234qwer");

    B2B1001Params.OrderHeader header = new B2B1001Params.OrderHeader();
    header.setOrderCode("POW05320190422100013");
    header.setOrderType("ZA01");
    header.setSaleDate("20190523");
    header.setSendDate("20190525");
    header.setReturnReason("缺货");
    header.setDcid("W003");
    header.setCreateTime("20190523");

    List<B2B1001Params.OrderItem> items = new ArrayList<>();
    B2B1001Params.OrderItem item0 = new B2B1001Params.OrderItem();
    item0.setGoodCode("243299");
    item0.setOrderLine(1);
    item0.setGoodNumber(new BigDecimal(3));
    item0.setInventory("W003");
    item0.setTicketAmount(23.02);
    items.add(item0);

    B2B1001Params params = new B2B1001Params();
    params.setOrderHeader(header);
    params.setItems(items);

    B2B1001Result result = SapApiManager.init().setup(sap).request(params);
    System.out.println(result);
  }

  @Test
  public void testToB2BPT1009() {
    FtpProperties ftp = new FtpProperties();
    ftp.setHost("10.252.216.4");
    ftp.setUserName("scmftp");
    ftp.setPassword("scmftp");
    ftp.setPath("/home/scmftp/B2BPT1009/PENDING");
    ftp.setFileName("20190523-103847-427_SCM_B2BPT1009_POW05320190419100009_20190523103758.xml");

    List<B2BPT1009Params.Item> items = new ArrayList<>();
    B2BPT1009Params.Item item0 = new B2BPT1009Params.Item();
    item0.setReviewOrderCode("POW05320190419100009");

    items.add(item0);

    B2BPT1009Params params = new B2BPT1009Params();
    params.setItems(items);

    boolean result = SapApiManager.init().setup(ftp).upload(params);
    System.out.println(result);
  }

  @Test
  public void testToB2BPT1002() {
    String value = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "\n" +
        "<ns0:MT_CSCM_B2BPT1002 xmlns:ns0=\"URN:B2BPT1002\">  \n" +
        "  <SHEET> \n" +
        "    <HEADER> \n" +
        "      <id>791eeebc-00d6-40e7-ad2f-0ca68b22cd87</id>  \n" +
        "      <purchase_org_code/>  \n" +
        "      <purchase_voucher/>  \n" +
        "      <voucher_type/>  \n" +
        "      <purchase_group_code/>  \n" +
        "      <company_code/>  \n" +
        "      <voucher_date/>  \n" +
        "      <supplier_code/>  \n" +
        "      <category/>  \n" +
        "      <transfer_location_code/>  \n" +
        "      <review_order_code/>  \n" +
        "      <review_order_flag/>  \n" +
        "      <site_area_code/>  \n" +
        "      <extra_purchase_type/>  \n" +
        "      <supply_model/>  \n" +
        "      <rp_order_type/>  \n" +
        "      <piece_flag/>  \n" +
        "      <currency/>  \n" +
        "      <note/>  \n" +
        "      <send_warehouse_code/>  \n" +
        "      <fresh_order_code/>  \n" +
        "      <return_flag/>  \n" +
        "      <transfer_order_flag/>  \n" +
        "      <system_source/>  \n" +
        "      <super_class/>  \n" +
        "      <place_order_user_id/>  \n" +
        "      <place_order_user_name/> \n" +
        "    </HEADER>  \n" +
        "    <ITEM> \n" +
        "      <id>9693a8c9-f671-4ee8-ae8b-254ed21d0b5d</id>  \n" +
        "      <purchase_voucher/>  \n" +
        "      <line_no/>  \n" +
        "      <location_code/>  \n" +
        "      <warehouse_code/>  \n" +
        "      <product_code/>  \n" +
        "      <qty/>  \n" +
        "      <price_free_tax/>  \n" +
        "      <unit/>  \n" +
        "      <tax_code/>  \n" +
        "      <delivery_date/>  \n" +
        "      <customer/>  \n" +
        "      <free_flag/>  \n" +
        "      <distribute_id/>  \n" +
        "      <distribute_line_no/>  \n" +
        "      <delete_flag/>  \n" +
        "      <order_status/>  \n" +
        "      <fresh_order_line_no/>  \n" +
        "      <min_fresh_qty/>  \n" +
        "      <original_order_code/>  \n" +
        "      <original_received_qty/>  \n" +
        "      <original_order_qty/>  \n" +
        "      <gift_qty/>  \n" +
        "      <gift_ratio/>  \n" +
        "      <original_supplier/>  \n" +
        "      <settle_dc/>  \n" +
        "      <extend_flag/>  \n" +
        "      <extend_order_code/>  \n" +
        "      <received_qty/>  \n" +
        "      <send_qty/>  \n" +
        "      <total_price_include_tax/>  \n" +
        "      <send_warehouse_code/> \n" +
        "    </ITEM> \n" +
        "  </SHEET> \n" +
        "</ns0:MT_CSCM_B2BPT1002>\n";

    String xml =
        value.replace("<ns0:MT_CSCM_B2BPT1002 xmlns:ns0=\"URN:B2BPT1002\">", "")
            .replace("</ns0:MT_CSCM_B2BPT1002>", "");

    B2BPT1002Result result = XMLUtils.tBean(xml, B2BPT1002Result.class);
    System.out.println(result);
  }

  @Test
  public void testToB2BPT1003() {
    String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "\n" +
        "<ns0:MT_B2BPT1003_CSCM xmlns:ns0=\"URN:B2BPT1003\">  \n" +
        "  <ITEM> \n" +
        "    <id>fe8b4636-b830-4c43-ad4f-a6f4ca0b2a96</id>  \n" +
        "    <source_type/>  \n" +
        "    <original_order_code/>  \n" +
        "    <original_line_no/>  \n" +
        "    <piece_flag/>  \n" +
        "    <serial_no/>  \n" +
        "    <process_flag/>  \n" +
        "    <level/>  \n" +
        "    <deal_qty/>  \n" +
        "    <original_location_code/>  \n" +
        "    <product_code/>  \n" +
        "    <shop_to_dc_purchase_order/>  \n" +
        "    <mdc_to_dc_purchase_order/>  \n" +
        "    <shop_to_supplier_purchase_order/>  \n" +
        "    <mdc_to_supplier_purchase_order/>  \n" +
        "    <dc_to_supplier_purchase_order/>  \n" +
        "    <first_sub_class/>  \n" +
        "    <last_sub_class/>  \n" +
        "    <source_object/>  \n" +
        "    <update_user/>  \n" +
        "    <update_date/>  \n" +
        "    <input_time/> \n" +
        "  </ITEM> \n" +
        "</ns0:MT_B2BPT1003_CSCM>\n";

    B2BPT1003Result result = XMLUtils.tBean(xml, B2BPT1003Result.class);
    System.out.println(result);
  }

  @Test
  public void testToB2BPT1004() {
    String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "\n" +
        "<ns0:MT_B2BPT1004_CSCM xmlns:ns0=\"URN:B2BPT1004\">  \n" +
        "  <ITEM> \n" +
        "    <id>efce8d42-ce90-4a59-8a0a-6f00dab8b2a8</id>  \n" +
        "    <product_voucher/>  \n" +
        "    <product_annual/>  \n" +
        "    <product_line_no/>  \n" +
        "    <location_code/>  \n" +
        "    <product_code/>  \n" +
        "    <warehouse_code/>  \n" +
        "    <received_qty/>  \n" +
        "    <unit/>  \n" +
        "    <received_time>2019-04-19 12:34:27</received_time>  \n" +
        "    <move_type/>  \n" +
        "    <purchase_order_code/>  \n" +
        "    <purchase_order_line_no/>  \n" +
        "    <delivery_order_code/>  \n" +
        "    <delivery_order_line_no/>  \n" +
        "    <user_name/>  \n" +
        "    <voucher_code/>  \n" +
        "    <amount/> \n" +
        "  </ITEM> \n" +
        "</ns0:MT_B2BPT1004_CSCM>\n";

    B2BPT1004Result result = XMLUtils.tBean(xml, B2BPT1004Result.class);
    System.out.println(result);
  }

  @Test
  public void testToYCSMS1002() {
    String value = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
        + "\n"
        + "<ns0:MT_YCSMS1002_CSCM xmlns:ns0=\"URN:YCSMS1002:SalesOrder\">\n"
        + "  <SHEET>\n"
        + "    <HEADER>\n"
        + "      <apply_order_code>PRW053190824000021</apply_order_code>\n"
        + "      <sale_order_code>0200141061</sale_order_code>\n"
        + "      <sale_order_type>ZA04</sale_order_type>\n"
        + "      <supplier_code>SW003</supplier_code>\n"
        + "      <supplier_name>福建生鲜配送中心</supplier_name>\n"
        + "      <company_settle_code>1933</company_settle_code>\n"
        + "      <received_location_code>W053</received_location_code>\n"
        + "      <delivery_date>20190824</delivery_date>\n"
        + "      <order_source>1</order_source>\n"
        + "      <filed1/>\n"
        + "      <flied2/>\n"
        + "    </HEADER>\n"
        + "    <ITEM>\n"
        + "      <line_no>000010</line_no>\n"
        + "      <product_code>390779</product_code>\n"
        + "      <qty>40.000</qty>\n"
        + "      <price_include_tax>80.00</price_include_tax>\n"
        + "      <price_free_tax>80.00</price_free_tax>\n"
        + "      <rate>0.00</rate>\n"
        + "      <unit>KG</unit>\n"
        + "      <unit_code>4</unit_code>\n"
        + "      <amount_include_tax>3200.00</amount_include_tax>\n"
        + "      <amount_free_tax>3200.00</amount_free_tax>\n"
        + "      <tax>0.00</tax>\n"
        + "      <flied1/>\n"
        + "      <flied2/>\n"
        + "    </ITEM>\n"
        + "    <ITEM>\n"
        + "      <line_no>000020</line_no>\n"
        + "      <product_code>390780</product_code>\n"
        + "      <qty>50.000</qty>\n"
        + "      <price_include_tax>100.00</price_include_tax>\n"
        + "      <price_free_tax>100.00</price_free_tax>\n"
        + "      <rate>0.00</rate>\n"
        + "      <unit>KG</unit>\n"
        + "      <unit_code>4</unit_code>\n"
        + "      <amount_include_tax>5000.00</amount_include_tax>\n"
        + "      <amount_free_tax>5000.00</amount_free_tax>\n"
        + "      <tax>0.00</tax>\n"
        + "      <flied1/>\n"
        + "      <flied2/>\n"
        + "    </ITEM>\n"
        + "  </SHEET>\n"
        + "</ns0:MT_YCSMS1002_CSCM>";

//    String xml =
//        value.replace("<ns0:MT_YCSMS1002_CSCM xmlns:ns0=\"URN:YCSMS1002:SalesOrder\">", "")
//            .replace("</ns0:MT_YCSMS1002_CSCM>", "");

    List<YCSMS1002Result> result = XMLUtils
        .tBean(value, new TypeReference<List<YCSMS1002Result>>() {
        });
    System.out.println(result);
  }

  @Test
  public void testToYCSMS1003() {
    String value = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
        + "\n"
        + "<ns0:MT_YCSMS1003_CSCM xmlns:ns0=\"URN:YCSMS1003:SalesOrderShipping\">\n"
        + "  <SHEET>\n"
        + "    <HEADER>\n"
        + "      <sale_order_code>0200137159</sale_order_code>\n"
        + "      <logistic_code>7900042004</logistic_code>\n"
        + "      <product_voucher_code>4900316632</product_voucher_code>\n"
        + "      <year>2019</year>\n"
        + "      <apply_order_code>PR9905190824000032</apply_order_code>\n"
        + "      <review_order_code>C9H2400050</review_order_code>\n"
        + "      <supplier_code>SW003</supplier_code>\n"
        + "      <sender_user/>\n"
        + "      <car_number/>\n"
        + "      <shipper_code/>\n"
        + "      <shipped_time>20190824191755</shipped_time>\n"
        + "      <tel/>\n"
        + "      <remark/>\n"
        + "      <sale_order_type>ZA04</sale_order_type>\n"
        + "      <flied1/>\n"
        + "      <flied2/>\n"
        + "    </HEADER>\n"
        + "    <ITEM>\n"
        + "      <line_no>000010</line_no>\n"
        + "      <product_code>390779</product_code>\n"
        + "      <shipped_qty>40.000</shipped_qty>\n"
        + "      <price_include_tax>80.00</price_include_tax>\n"
        + "      <price_free_tax>80.00</price_free_tax>\n"
        + "      <rate>0.00</rate>\n"
        + "      <unit>4</unit>\n"
        + "      <amount_include_tax>3200.00</amount_include_tax>\n"
        + "      <amount_free_tax>3200.00</amount_free_tax>\n"
        + "      <logistic_code>7900042004</logistic_code>\n"
        + "      <remark/>\n"
        + "      <produced_date>00000000</produced_date>\n"
        + "    </ITEM>\n"
        + "    <ITEM>\n"
        + "      <line_no>000020</line_no>\n"
        + "      <product_code>390780</product_code>\n"
        + "      <shipped_qty>50.000</shipped_qty>\n"
        + "      <price_include_tax>100.00</price_include_tax>\n"
        + "      <price_free_tax>100.00</price_free_tax>\n"
        + "      <rate>0.00</rate>\n"
        + "      <unit>4</unit>\n"
        + "      <amount_include_tax>5000.00</amount_include_tax>\n"
        + "      <amount_free_tax>5000.00</amount_free_tax>\n"
        + "      <logistic_code>7900042004</logistic_code>\n"
        + "      <remark/>\n"
        + "      <produced_date>00000000</produced_date>\n"
        + "    </ITEM>\n"
        + "  </SHEET>\n"
        + "</ns0:MT_YCSMS1003_CSCM>\n";

    List<YCSMS1003Result> result = XMLUtils
        .tBean(value, new TypeReference<List<YCSMS1003Result>>() {
        });
    System.out.println(result);
  }

  @Test
  public void testToSMS1008() {
    String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "\n" +
        "<ns0:MT_YCSMS1008_B2B xmlns:ns0=\"URN:YCSMS1008:ApprovalResultsReturn\">\n" +
        "  <item>\n" +
        "    <order_id>RW03920160610000002</order_id>\n" +
        "    <received_time>20160808133838</received_time>\n" +
        "    <error_msg/>\n" +
        "    <sap_orderid>60001548</sap_orderid>\n" +
        "    <status>S</status>\n" +
        "    <interface_no>ECC_B2B1001</interface_no>\n" +
        "  </item>\n" +
        "</ns0:MT_YCSMS1008_B2B>\n";

    YCSMS1008Result result = XMLUtils.tBean(xml, YCSMS1008Result.class);
    System.out.println(result);
  }

  @Test
  public void testToOA061B() {
    String value = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "\n" +
        "<ns1:MT_CSCM_OA061B xmlns:ns1=\"URN:OA061B\">  \n" +
        "  <SHEET> \n" +
        "    <client_code/>  \n" +
        "    <product_code/>  \n" +
        "    <supplier_account/>  \n" +
        "    <purchase_org_code/>  \n" +
        "    <purchase_group_code/>  \n" +
        "    <tax_code/>  \n" +
        "    <purchase_price/>  \n" +
        "    <currency_code/>  \n" +
        "    <price_unit/>  \n" +
        "    <order_price_unit/>  \n" +
        "    <effective_price/>  \n" +
        "    <price_effect_date_control/>  \n" +
        "    <one_time_product/>  \n" +
        "    <producter_code/>  \n" +
        "    <create_time/> \n" +
        "  </SHEET> \n" +
        "</ns1:MT_CSCM_OA061B>\n";

    String xml =
        value.replace("<ns1:MT_CSCM_OA061B xmlns:ns1=\"URN:OA061B\">", "")
            .replace("</ns1:MT_CSCM_OA061B>", "");

    OA061BResult result = XMLUtils.tBean(xml, OA061BResult.class);
    System.out.println(result);
  }

  @Test
  public void testToYCSMS1001() {
    FtpProperties ftp = new FtpProperties();
    ftp.setHost("10.252.216.4");
    ftp.setUserName("scmftp");
    ftp.setPassword("scmftp");
    ftp.setPath("/home/scmftp/YCSMS1001/PENDING");
    ftp.setFileName("SCM_YCSMS1001_PR2279D881908133096_20190812165059.xml");

    YCSMS1001Params.Header header = new Header();
    header.setCatetoryCode("11");
    header.setPoOrgCode("P300");
    header.setDeliverAddressCode("P300");
    header.setApplyTime("2019-08-13 10:34:50");
    header.setCreatedBy("李建");
    header.setApplyId("PR2279D881908133096");

    List<YCSMS1001Params.Item> items = new ArrayList<>();
    YCSMS1001Params.Item item0 = new YCSMS1001Params.Item();
    item0.setRownum("1");
    item0.setGoodsId("1009499");
    item0.setApplyId("PR2279D881908133096");

    items.add(item0);

    YCSMS1001Params.Item item1 = new YCSMS1001Params.Item();
    item1.setRownum("2");
    item1.setGoodsId("1009500");
    item1.setApplyId("PR2279D881908133096");

    items.add(item1);

    YCSMS1001Params params = new YCSMS1001Params();
    params.setHeader(header);
    params.setItems(items);

    boolean result = SapApiManager.init().setup(ftp).upload(params);
    System.out.println(result);
  }

  @Test
  public void testToYCSMS1004() {
    String value = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
        + "\n"
        + "<ns0:MT_YCSMS1004_YCSMS xmlns:ns0=\"URN:YCSMS1004:ClosePurchaseOrder\">\n"
        + "  <SHEET>\n"
        + "    <sale_order_code>OM198150000060</sale_order_code>\n"
        + "    <finish_time>20190327231932</finish_time>\n"
        + "    <expire_finish_flag>Z1</expire_finish_flag>\n"
        + "    <sale_order_type>ZA10</sale_order_type>\n"
        + "    <flied1/>\n"
        + "    <flied2/>\n"
        + "  </SHEET>\n"
        + "  <SHEET>\n"
        + "    <sale_order_code>0204069181</sale_order_code>\n"
        + "    <finish_time>20190327231932</finish_time>\n"
        + "    <expire_finish_flag>Z1</expire_finish_flag>\n"
        + "    <sale_order_type>ZA10</sale_order_type>\n"
        + "    <flied1/>\n"
        + "    <flied2/>\n"
        + "  </SHEET>\n"
        + "</ns0:MT_YCSMS1004_YCSMS>";

    List<YCSMS1004Result> result = XMLUtils
        .tBean(value, new TypeReference<List<YCSMS1004Result>>() {
        });
    System.out.println(result);
  }

  @Test
  public void testToYCSMS1005() {
    FtpProperties ftp = new FtpProperties();
    ftp.setHost("10.252.216.4");
    ftp.setUserName("scmftp");
    ftp.setPassword("scmftp");
    ftp.setPath("/home/scmftp/YCSMS1005/PENDING");
    ftp.setFileName("SCM_YCSMS1005_PO62111908110026_20190814165059.xml");

    YCSMS1005Params.Header header = new YCSMS1005Params.Header();
    header.setApplyId("PO62111908110026");
    header.setDeliverAddressCode("W001");
    header.setAddressCode("9DDN");
    header.setSellType("ZA11");
    header.setPlanTime("2019-08-13");
    header.setApproveAt("2019-08-11 17:04:06");
    header.setOrderType("ZY01");
    header.setObdNo("SH19081175337CA1500");
    header.setRemark("");
    header.setField1("4045216248");
    header.setField2("");

    List<YCSMS1005Params.Item> items = new ArrayList<>();
    YCSMS1005Params.Item item0 = new YCSMS1005Params.Item();
    item0.setRownum("10");
    item0.setGoodsId("1036350");
    item0.setQuantity("1.0000");
    item0.setRemark("8.11订单");
    item0.setUnitName("9");
    item0.setApplyId("PO62111908110026");
    item0.setPriceType("ZXYJ");
    item0.setPrice("7.04");
    item0.setInventoryAddress("B998");
    item0.setReturnReason("");
    item0.setField1("");
    item0.setField2("");

    items.add(item0);

    YCSMS1005Params params = new YCSMS1005Params();
    params.setHeader(header);
    params.setItems(items);

    boolean result = SapApiManager.init().setup(ftp).upload(params);
    System.out.println(result);
  }

  @Test
  public void testToYCSMS1009() {
    String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
        + "\n"
        + "<ns0:MT_YCSMS1009_YCSMS xmlns:ns0=\"URN:YCSMS1009:approvalResults\">\n"
        + "  <ITEM>\n"
        + "    <rownum>1</rownum>\n"
        + "    <approveNo>S908130671</approveNo>\n"
        + "    <addressCode>9M21</addressCode>\n"
        + "    <deliveryAddressCode>W046</deliveryAddressCode>\n"
        + "    <categoryCode>11</categoryCode>\n"
        + "    <goodsId>1082676</goodsId>\n"
        + "    <approveQuantity>0.000</approveQuantity>\n"
        + "    <approveMsg/>\n"
        + "    <applyId>PR6839M211908133197</applyId>\n"
        + "    <inventoryAddressCode>PR6839M211908133197</inventoryAddressCode>\n"
        + "    <amount>24.00</amount>\n"
        + "    <conditionType>PBXX</conditionType>\n"
        + "    <approvedBy>80000801</approvedBy>\n"
        + "    <approvedAt>2019-08-13 10:46:43</approvedAt>\n"
        + "    <planDate>20190820</planDate>\n"
        + "    <mergePrId/>\n"
        + "    <supplierSplitNo/>\n"
        + "    <shopSplitNo/>\n"
        + "    <splitQty>0.000</splitQty>\n"
        + "    <dispersionFlag/>\n"
        + "  </ITEM>\n"
        + "</ns0:MT_YCSMS1009_YCSMS>\n";

    YCSMS1009Result result = XMLUtils.tBean(xml, YCSMS1009Result.class);
    System.out.println(result);
  }

  @Test
  public void testToYCSMS1010() {
    FtpProperties ftp = new FtpProperties();
    ftp.setHost("10.252.216.4");
    ftp.setUserName("scmftp");
    ftp.setPassword("scmftp");
    ftp.setPath("/home/scmftp/YCSMS1010/PENDING");
    ftp.setFileName("SCM_YCSMS1010_PRW05320190812100009_20190814165059666.xml");

    List<YCSMS1010Params.Item> items = new ArrayList<>();
    YCSMS1010Params.Item item0 = new YCSMS1010Params.Item();
    item0.setApplyId("RR5689DC81908130027");
    item0.setRownum("1");
    item0.setSellType("JTRR");
    item0.setAddressCode("9DC8");
    item0.setCategoryCode("12");
    item0.setCreatedDate("20190813");
    item0.setCreatedTime("104611");
    item0.setCreatedBy("李仲琴");
    item0.setRemark("");
    item0.setDeliverAddressCode("W001");
    item0.setGoodsId("979706");
    item0.setQuantity("1.0000");
    item0.setUnit("50");
    item0.setCondtionType("ZPXY");
    item0.setPrice("");
    item0.setPoGroup("A04");
    item0.setMinCategoryCode("12510401");
    item0.setReturnReason("OA公布质量问题的退货");

    items.add(item0);

    YCSMS1010Params params = new YCSMS1010Params();
    params.setItems(items);

    boolean result = SapApiManager.init().setup(ftp).upload(params);
    System.out.println(result);
  }

  @Test
  public void testToYCSMS1011() {
    String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
        + "\n"
        + "<ns0:MT_YCSMS1011_YCSMS xmlns:ns0=\"URN:YCSMS1011:ReturningApprovalResults\">\n"
        + "  <ITEM>\n"
        + "    <applyId>RR0959D401908110123</applyId>\n"
        + "    <rownum>00001</rownum>\n"
        + "    <approveDate>20190812</approveDate>\n"
        + "    <approveTime>185819</approveTime>\n"
        + "    <approveBy>80012873</approveBy>\n"
        + "    <addressCode>9D40</addressCode>\n"
        + "    <deliverAddressCode>W055</deliverAddressCode>\n"
        + "    <inventoryAddress>E020</inventoryAddress>\n"
        + "    <goodsId>1065335</goodsId>\n"
        + "    <approveQuantity>6.000</approveQuantity>\n"
        + "    <approveMsg/>\n"
        + "    <providerCode>20030923</providerCode>\n"
        + "    <providerName>昆山融雪粮油制品有限公司</providerName>\n"
        + "    <refuseReason>超过OA公布的退货时间</refuseReason>\n"
        + "    <approveStatus>R</approveStatus>\n"
        + "  </ITEM>\n"
        + "  <ITEM>\n"
        + "    <applyId>RR0989D431908120092</applyId>\n"
        + "    <rownum>00001</rownum>\n"
        + "    <approveDate>20190812</approveDate>\n"
        + "    <approveTime>185819</approveTime>\n"
        + "    <approveBy>80012873</approveBy>\n"
        + "    <addressCode>9D43</addressCode>\n"
        + "    <deliverAddressCode>W055</deliverAddressCode>\n"
        + "    <inventoryAddress>E020</inventoryAddress>\n"
        + "    <goodsId>608821</goodsId>\n"
        + "    <approveQuantity>2.964</approveQuantity>\n"
        + "    <approveMsg/>\n"
        + "    <providerCode>20034861</providerCode>\n"
        + "    <providerName>嘉兴市鼎亮贸易有限公司</providerName>\n"
        + "    <refuseReason>超过OA公布的退货时间</refuseReason>\n"
        + "    <approveStatus>R</approveStatus>\n"
        + "  </ITEM>\n"
        + "</ns0:MT_YCSMS1011_YCSMS>";

    YCSMS1011Result result = XMLUtils.tBean(xml, YCSMS1011Result.class);
    System.out.println(result);
  }

  @Test
  public void testToYCSMS1022() {
    FtpProperties ftp = new FtpProperties();
    ftp.setHost("10.252.216.4");
    ftp.setUserName("scmftp");
    ftp.setPassword("scmftp");
    ftp.setPath("/home/scmftp/YCSMS1022/PENDING");
    ftp.setFileName("SCM_YCSMS1022_PRW0A8190813000008_20190813182643666.xml");

    List<YCSMS1022Params.Item> items = new ArrayList<>();
    YCSMS1022Params.Item item0 = new YCSMS1022Params.Item();
    item0.setPoId("PO63211908120032");
    item0.setGoodsId("934785");
    item0.setDeliverNo("SH19081290456101A00");
    item0.setQuantityProcessed("2.0000");
    item0.setSapDeliveryNo("7905181827");
    item0.setSapRownum("70");
    item0.setActTime("7905181827");
    item0.setSapSellNo("0204992449");

    items.add(item0);

    YCSMS1022Params.Item item1 = new YCSMS1022Params.Item();
    item1.setPoId("PO63211908120032");
    item1.setGoodsId("907550");
    item1.setDeliverNo("SH19081290456101A00");
    item1.setQuantityProcessed("1.0000");
    item1.setSapDeliveryNo("7905181827");
    item1.setSapRownum("60");
    item1.setActTime("20190813");
    item1.setSapSellNo("0204992449");

    items.add(item1);

    YCSMS1022Params params = new YCSMS1022Params();
    params.setItems(items);

    boolean result = SapApiManager.init().setup(ftp).upload(params);
    System.out.println(result);
  }

  @Test
  public void testToCSCM1004() {
    FtpProperties ftp = new FtpProperties();
    ftp.setHost("10.252.216.4");
    ftp.setUserName("scmftp");
    ftp.setPassword("scmftp");
    ftp.setPath("/home/scmftp/CSCM1004/PENDING");
    ftp.setFileName("SCM_CSCM1004_PRW053190828000065_20190813182643666.xml");

    List<CSCM1004Params.Item> items = new ArrayList<>();
    CSCM1004Params.Item item0 = new CSCM1004Params.Item();
    item0.setRequestOrderCode("PRW053190828000065");
    item0.setProjectNumber("1");
    item0.setSendStatus("0");
    item0.setShippedOrderCode("OU190828000164");
    items.add(item0);

    CSCM1004Params.Item item1 = new CSCM1004Params.Item();
    item1.setRequestOrderCode("PRW053190828000065");
    item1.setProjectNumber("1");
    item1.setSendStatus("0");
    item1.setShippedOrderCode("OU190828000164");
    items.add(item1);

    CSCM1004Params params = new CSCM1004Params();
    params.setItems(items);

    boolean result = SapApiManager.init().setup(ftp).upload(params);
    System.out.println(result);
  }

//  FtpProperties ftp = new FtpProperties();
//    ftp.setHost("10.252.216.4");
//    ftp.setUserName("scmftp");
//    ftp.setPassword("scmftp");
//    ftp.setPath("/home/scmftp/YCSMS1001/PENDING");
//    ftp.setFileName("SCM_YCSMS1001_PR2279D881908133096_20190812165059.xml");
//
//  YCSMS1001Params.Header header = new Header();
//    header.setCatetoryCode("11");
//    header.setPoOrgCode("P300");
//    header.setDeliverAddressCode("P300");
//    header.setApplyTime("2019-08-13 10:34:50");
//    header.setCreatedBy("李建");
//    header.setApplyId("PR2279D881908133096");
//
//  List<YCSMS1001Params.Item> items = new ArrayList<>();
//  YCSMS1001Params.Item item0 = new YCSMS1001Params.Item();
//    item0.setRownum("1");
//    item0.setGoodsId("1009499");
//    item0.setApplyId("PR2279D881908133096");
//
//    items.add(item0);
//
//  YCSMS1001Params.Item item1 = new YCSMS1001Params.Item();
//    item1.setRownum("2");
//    item1.setGoodsId("1009500");
//    item1.setApplyId("PR2279D881908133096");
//
//    items.add(item1);
//
//  YCSMS1001Params params = new YCSMS1001Params();
//    params.setHeader(header);
//    params.setItems(items);
//
//  boolean result = SapApiManager.init().setup(ftp).upload(params);
//    System.out.println(result);


  @Test
  public void testCSXYC007() {
    FtpProperties ftp = new FtpProperties();
    ftp.setHost("10.252.216.4");
    ftp.setUserName("scmftp");
    ftp.setPassword("scmftp");
    ftp.setPath("/home/scmftp/CSXYCC007/PENDING");
//    ftp.setPath("D:\\home\\scmftp\\CSXYCC007\\PENDING");
    ftp.setFileName("SCM_CSXYCC007_PO12312312_20191022.xml");

//    FtpProperties ftp = new FtpProperties();
//    ftp.setHost("10.252.216.4");
//    ftp.setUserName("scmftp");
//    ftp.setPassword("scmftp");
//    ftp.setPath("/home/scmftp/YCSMS1001/PENDING");
//    ftp.setFileName("111231221.xml");

    CSXYCC007Params.Header header = new CSXYCC007Params.Header();
    header.setCatetoryCode("11");
    header.setPoOrgCode("123");
    header.setDeliverAddressCode("9905");
    header.setApplyTime("20191022");
    header.setCreatedBy("张三");
    header.setApplyId("PO121");
    header.setSettleAddressCode("W0A2");
    header.setAddressCode("123");
    header.setRemark("备注");
    header.setAddressType("1");
    header.setSellType("");
    header.setOrderType("");
    header.setOrderMode("");
    header.setAdditionType("");
    header.setRegion("");
    header.setFirstDc("");
    header.setSourceType("");
    header.setLastDc("");
    header.setLogistics("1");
    header.setChannel("");
    header.setDirectAccFlag("");

    List<CSXYCC007Params.Item> items = new ArrayList<>();
    for (Integer i = 0; i < 2; i++) {
      CSXYCC007Params.Item item = new Item();
      item.setRownum(i.toString());
      item.setSafetyInvertory("");
      item.setNormalDms("");
      item.setPromotionDms("");
      item.setGoodsId("390779");
      item.setRemark("备注");
      item.setQuantity("10");
//      item.setApplyId("PO123123123");
      item.setConditionType("");
      item.setAmount("");
      item.setInventoryAddressCode("");
      item.setUnit("KG");
      item.setDispatchType("");
      item.setMinPack("");
      item.setMaxPack("");
      item.setMinOrderQty("");
      item.setPrice("");
      item.setTotalAmount("");
      item.setSkuStatus("");
      item.setPoGroup("P300");
      item.setValidFlag("");
      item.setMinCategory("12111111");
      item.setFreeFlag("");
      item.setSupplierCode("2000173");
      item.setSupplierAmount("");
      item.setPlanTime("20191026");
      items.add(item);

    }
    CSXYCC007Params params = new CSXYCC007Params();
    params.setHeader(header);
    params.setItems(items);

    boolean result = SapApiManager.init().setup(ftp).upload(params);
    System.out.println(result);
  }

  @Test
  public void testCSXYC004(){

    FtpProperties ftp = new FtpProperties();
    ftp.setHost("10.252.216.4");
    ftp.setUserName("scmftp");
    ftp.setPassword("scmftp");
    ftp.setPath("/home/scmftp/CSXYCC004/PENDING");
//    ftp.setPath("D:\\home\\scmftp\\CSXYCC007\\PENDING");
    ftp.setFileName("SCM_CSXYCC004_PO12312312_20191022.xml");
    CSXYCC004Params params=new CSXYCC004Params();
    CSXYCC004Params.Header header=new CSXYCC004Params.Header();
    header.setSellOrderNo("");
    header.setDeliveryNo("");
    header.setVoucherNo("");
    header.setVoucheYear("");
    header.setApplyId("");
    header.setApproveNo("");
    header.setProviderCode("");
    header.setShipMan("");
    header.setCarCode("");
    header.setShippers("");
    header.setShipTime(0);
    header.setPhone("");
    header.setRemark("");
    header.setSaleOrderType("");

    List<CSXYCC004Params.Item > list=new ArrayList<>();
    CSXYCC004Params.Item item=new CSXYCC004Params.Item();
    item.setRownum("");
    item.setGoodsId("");
    item.setDeliveryQuantity(new BigDecimal("0"));
    item.setPrice(new BigDecimal("0"));
    item.setPurchasePriceNoTax("");
    item.setRate("");
    item.setUnit("");
    item.setAmount(new BigDecimal("0"));
    item.setPurchaseAmountNoTax("");
    item.setDeliveryNo("");
    item.setRemark("");
    list.add(item);
    params.setHeader(header);
    params.setItems(list);

    boolean result = SapApiManager.init().setup(ftp).upload(params);
    System.out.println(result);




  }

}
