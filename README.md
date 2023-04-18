## 介绍
+ 烛龙第三方开放平台集成SDK

## 版本历史
+ 1.0.0.RELEASE 初始版本，支持集团内部系统开放接口
    + 支持星创接口
    + 支持星云接口
    + 支持SAP接口
    + 支持快递鸟接口

+ 1.1.0.RELEASE
    + 更改SimpleExecutor的参数处理，增加对非String参数支持
    + API增加ContentType定制

## 设计思想
+ 所有的开放平台接口均实现了模型化
+ 所有的接口遵循API、Params和Result模式，即API、入参和出参，API上绑定params后交由client执行后返回result，例如：辉创SMS1015这个API，API模型为SMS1015，入参为SMS1015Params，出参为SMS1015Result

## 环境

```
jre(Java运行时环境) >= 6（强烈建议使用jre 8+）
三方库依赖: guava 20.0、apache http client 4.5.6、jackson 2.9.7、lombok 1.16.22等
```

## 常见问题
+ 

## 使用
### 1. pom依赖引用
```
<dependency>
    <groupId>com.zhul.open.sdk</groupId>
    <artifactId>zhul-open-sdk</artifactId>
    <version>1.2.0-SNAPSHOT</version>
</dependency>
```

## 如何使用？（参考HuichuangApiTest.java、SapApiTest.java、YunchaoApiTest.java、HuichuangApiTest.java）
### 调用星创接口

```
HuichuangProperties properties = new HuichuangProperties();
properties.setHost("http://mms-thirdparty-t1.xxxxxx.com");

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

```

### 调用SAP HTTP接口

```
SapProperties sap = new SapProperties();
sap.setHost("xxxxx");
sap.setUserName("xxxx");
sap.setPassword("xxxx");

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

```

### 调用SAP FTP接口

```
FtpProperties ftp = new FtpProperties();
ftp.setHost("xxxxx");
ftp.setUserName("xxxxx");
ftp.setPassword("xxxx");
ftp.setPath("/home/scmftp/B2BPT1009/PENDING");
ftp.setFileName("20190523-103847-427_SCM_B2BPT1009_POW05320190419100009_20190523103759.xml");

List<B2BPT1009Params.Item> items = new ArrayList<>();
B2BPT1009Params.Item item0 = new B2BPT1009Params.Item();
item0.setReviewOrderCode("POW05320190419100009");

items.add(item0);

B2BPT1009Params params = new B2BPT1009Params();
params.setItems(items);

boolean result = SapApiManager.init().setup(ftp).upload(params);
System.out.println(result);

```

### 调用星云接口
```
YunchaoProperties properties = new YunchaoProperties();
properties.setHost("http://xxxx");

Yunchao20000196Params params = new Yunchao20000196Params();
params.setShopId("9906");
params.setProductCode("934564");

Yunchao20000196Result result = YunchaoApiManager.init().setup(properties).request(params);
System.out.println(result);

```

### 调用快递鸟接口
```
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
commodity.setGoodsName("下单商品");
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

```