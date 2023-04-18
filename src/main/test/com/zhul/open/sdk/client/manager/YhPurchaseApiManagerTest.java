package com.zhul.open.sdk.client.manager;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.zhul.open.sdk.gen.model.purchase.*;
import com.zhul.open.sdk.gen.model.purchase.BrandManageParams.BrandInfo;
import com.zhul.open.sdk.gen.model.purchase.ProductApplyParams.Header;
import com.zhul.open.sdk.gen.model.purchase.ProductApplyParams.Item;
import com.zhul.open.sdk.gen.model.purchase.ProductApplyParams.Items;
import com.zhul.open.sdk.gen.model.purchase.ProductShopApplyParams.DetailShopRelation;
import com.zhul.open.sdk.gen.model.purchase.ProductShopApplyParams.ShopApplyOrder;
import com.zhul.open.sdk.gen.model.purchase.ProductShopApplyParams.ShopApplyOrderDetail;
import com.zhul.open.sdk.gen.model.purchase.ProductUpdateParams.ProductDetailApplyOrder;
import com.zhul.open.sdk.gen.model.purchase.ProductUpdateParams.ProductDetailCountryLevel;
import com.zhul.open.sdk.properties.YhPurchasingProperties;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author huangjinzhou
 * @date 2020/2/10
 */
public class YhPurchaseApiManagerTest {

  private YhPurchaseApiManager yhPurchaseApiManager;

  @Before
  public void setup() {
    YhPurchasingProperties properties = new YhPurchasingProperties();
    properties.setProductCenterHost("http://sit.productcenterview.sitgw.yonghui.cn");
    properties.setSupplierCenterHost("http://sit.suppliercenter-view.sitgw.yonghui.cn");
    properties.setAuthUrl("http://auth.sitgw.yonghui.cn/jwt/token");
    properties.setSecretId("csx");
    properties.setSecretKey("uY7soXUcc1pFEXuM6ujD66eNov6SiabK");
    yhPurchaseApiManager = new YhPurchaseApiManager(properties);
  }

  @Test
  public void getValidToken() {
    FetchTokenResult validToken = yhPurchaseApiManager.getValidToken();
    Assert.assertNotNull(validToken);
    Assert.assertTrue(StringUtils.isNotBlank(validToken.getAccessToken()));
    System.out.println(JSON.toJSONString(validToken, true));
  }

  @Test
  public void createSupplier() {
    CsxSupplierRecordParams params = getCreateSupplierParams();
    yhPurchaseApiManager.request(params);
  }

  @Test
  public void createBrand() {
    BrandManageParams params = getBrandManageParams();

    List<BrandManageResult> results = yhPurchaseApiManager.request(params);
    System.out.println(JSON.toJSONString(results));
  }

  @Test
  public void testCreateProduct() {
    ProductApplyParams params = getProductApplyParams();

    ProductApplyResult result = yhPurchaseApiManager.request(params);

    System.out.println(JSON.toJSONString(result));
  }

  @Test
  public void testUpdateProduct() {
    ProductUpdateParams params = getProductUpdateParams();

    yhPurchaseApiManager.request(params);
  }

  @Test
  public void testProductShopApply() {
    ProductShopApplyParams params = getProductShopApplyParams();

    yhPurchaseApiManager.request(params);
  }

  @Test
  public void testSupplierUpdate() {
    ArrayList<CsxSupplierUpdateParams> params =
        Lists.newArrayList(
            CsxSupplierUpdateParams.builder()
                .supplierCode("75011789")
                .venderName("临时测试3供应商1")
                .build());
    yhPurchaseApiManager.request(params);
  }

  @Test
  public void testSupplierAddPurchase() {
    ArrayList<CsxSupplierAddPurchaseParams> params =
            Lists.newArrayList(
                    CsxSupplierAddPurchaseParams.builder()
                            .supplierCode("20032868")
                            .addPurchaseCode("P615")
                            .refPurchaseCode("P600")
                            .build());
    yhPurchaseApiManager.requestSupplierAddPurchase(params);
  }

  private ProductShopApplyParams getProductShopApplyParams() {
    ProductShopApplyParams params = new ProductShopApplyParams();
    ShopApplyOrder header =
        ShopApplyOrder.builder()
            .applyById("80917170")
            .applyByName("黄金周")
            .applyOrderNo("CSX1110000019")
            .applyTime(new Date())
            .auditById("80917170")
            .auditByName("黄金周")
            .auditTime(new Date())
            .categoryCode("10")
            .inputById("80917170")
            .inputByName("黄金周")
            .purchaseGroupCode("U03")
            .purchaseOrgCode("P600")
            .title("CX")
            .build();
    params.setShopApplyOrder(header);

    ShopApplyOrderDetail detail =
        ShopApplyOrderDetail.builder()
            .applyById("80917170")
            .applyByName("黄金周")
            .applyOrderNo("CSX1110000019")
            .applyTime(new Date())
            .inputById("80917170")
            .inputByName("黄金周")
            .categoryCode("10")
            .categoryName("加工部")
            .productCode("todo")
            .purchaseOrgCode("P600")
            .shopCode("W079")
            .supplierCode("200079")
            .inputTaxCode("J0")
            .taxPurchasePrice(BigDecimal.valueOf(20))
            .taxSalePrice(BigDecimal.valueOf(50))
            .detailShopRelations(
                Collections.singletonList(
                    DetailShopRelation.builder()
                        .bizType(0)
                        .logisticsModeCode("1")
                        .productCode("todo")
                        .shopCode("W079")
                        .build()))
            .build();
    params.setShopApplyOrderDetails(Collections.singletonList(detail));

    return params;
  }

  private ProductUpdateParams getProductUpdateParams() {
    ProductUpdateParams params = new ProductUpdateParams();

    ProductDetailApplyOrder header =
        ProductDetailApplyOrder.builder()
            .applyByName("黄金周")
            .applyLevel("1")
            .applyOrderNo("CSX111000021")
            .applyTime(new Date())
            .auditByName("黄金周")
            .auditTime(new Date())
            .purchaseGroupCode("U03")
            .purchaseOrgCode("P600")
            .rootCategoryCode("10")
            .remark("彩食鲜测试商品修改")
            .title("CX")
            .build();
    params.setProductDetailApplyOrder(header);

    ProductDetailCountryLevel detail =
        ProductDetailCountryLevel.builder()
            .applyOrderNo("CSX1110000021")
            .productCode("6033673")
            .brandCode("0108509")
            .productCountryName("彩食鲜测试商品修改商品")
            .qualityDays(120)
            .spec("2米/包")
            .smallClassifyCode("10010101")
            .unitCode("60")
            .build();
    params.setProductDetailCountryLevels(Collections.singletonList(detail));

    return params;
  }

  private ProductApplyParams getProductApplyParams() {
    ProductApplyParams productApplyParams = new ProductApplyParams();
    Header header =
        Header.builder()
            // 单据编号：CSX+申请编号
            .sheetid("CSX1110000006")
            // 来源标识：CX
            .sourceSystem("CX")
            // 上传方式： C-创建，M-修改
            .uploadWay("C")
            .build();
    productApplyParams.setHeader(header);

    Item item =
        Item.builder()
            .productName("彩食鲜测试商品新增接口6")
            .productDesc("彩食鲜测试商品新增接口6")
            // 传名称非code
            .unit("10")
            // 映射永辉品类表的商品类目
            .category("10010101")
            // 根据永辉部类取商品类型
            .productType("Z001")
            // 默认“00-单一商品”
            .productClass("00")
            // 根据商品基本表的brand_id获取brandCode
            .brand("2000026")
            // 0-0%销项税;4-6%销项税;A-13%销项税;B-9%销项税.传主销项税对应的税收分类编号，主销项税无值则取副销项税的
            .outputTax("4")
            // 根据永辉部类取评估类
            .evaluationClass("3040")
            // 产地
            .place("福建福州")
            // 存储条件: 当用户选择为04-干燥时，转01-正常传给集团
            .temperature("01")
            // 根据永辉品类与采购组对应关系自动获取采购组，然后传给中台
            .purchaseGroup("U03")
            // 默认0001非季节性商品
            .season("0001")
            // 保质期
            .shelfLife(365)
            // 规格
            //            .specs("12个/包")
            // 商品采购级别:根据永辉部类集团采购级别
            .purchaseLevel("14")
            // 条码类型
            .barcodeType("01")
            // 国际商品编码的类别 (GTIN)，国际码时，必填，其他情况空；
            // 创建商品时非国际码的商品条码由集团返回
            // 国际条码时控制在途单据，一个国际码只对一个编码
            .ean13(null)
            // 传第一条供应商的含税进价
            .purchasePrice(BigDecimal.valueOf(1))
            // 传第一条供应商的最高售价
            .salesPrice(BigDecimal.valueOf(2))
            // 传彩食鲜中台商品深度
            .length(BigDecimal.valueOf(1))
            .width(BigDecimal.valueOf(1))
            .height(BigDecimal.valueOf(1))
            // 长/宽/高单位名称
            .sizeUnit("131")
            // 原产地国家
            //            .originalPlace("CN")
            // 商品税务编码
            .taxCode("1030201020000000000")
            // 文档号码(无文档管理系统)，传申请编码
            .documentNum("1110000006")
            .serialNum(1)
            .build();
    List<ProductApplyParams.Item> items = new ArrayList<>();
    items.add(item);
    header.setItems(new Items(items));

    return productApplyParams;
  }

  private BrandManageParams getBrandManageParams() {
    List<BrandInfo> brandInfos = new ArrayList<>();
    brandInfos.add(
        BrandInfo.builder()
            .applyById("80917170")
            .applyByName("黄金周")
            .applyOrderNo("CSXPP000000000")
            .applyTime(new Date())
            .applyType(1)
            .auditById("80917170")
            .auditByName("黄金周")
            .auditTime(new Date())
            .inputById("1000000156810")
            .inputByNumber("80917170")
            .inputByName("黄金周")
            .brandLevel(1)
            .firstBrandName("彩食鲜测试品牌x")
            .remarks("CX")
            .build());
    return new BrandManageParams(brandInfos);
  }

  private CsxSupplierRecordParams getCreateSupplierParams() {
    CsxSupplierRecordParams params = new CsxSupplierRecordParams();
    params.setIsContract(0);
    params.setB2bSheetId("CSX190000000002");
    params.setAccountGroupCode("Z001");
    params.setVenderName("彩食鲜接口测试供应商名称1");
    params.setIdTypeCode(0);
    params.setVenderTypeCode(1);
    params.setInvoiceTitle("彩食鲜接口测试供应商发票抬头");
    params.setInvoiceAddr("福州市鼓楼区东街贤南路凤鸣公寓1号楼二层");
    params.setPostCode("361000");
    params.setVenderCityCode("350100");
    params.setEmail("80917170@yonghui.cn");
    params.setCtsName("黄金周");
    params.setParentVenderCode(null);
    // 街道？
    params.setVenderProvinceCode("350000");
    params.setFax(null);
    params.setCtsTel("18250102001");
    params.setTaxTypeCode(10);
    params.setTaxTypeName("一般纳税人");
    params.setTaxId("91350000727900106G");
    params.setOrderMode(0);
    params.setIndustryCode("0003");
    params.setIndustryName("加工");
    params.setBuyLevelCode("01");
    params.setBuyLevelName("全国供应商");
    params.setCorporateRep("黄金周");
    params.setBankCode("103651080009");
    params.setBankAccountCode("6214869212340782");
    params.setBankAccountName("黄金周");
    params.setPayMethodCode("0");
    params.setPayMethodName("");
    params.setFixCreditQuota("123452.11");
    params.setSaleCatgCodes("001");
    params.setSaleCatgNames("通用采购组");
    params.setIsAssociate(3);
    params.setSettlSignCode("0");
    params.setSettlSignName("大区结算");
    params.setPayTermCode("Z001");
    params.setPayTermName("双方另议");
    params.setPriceGroupCode("Z1");
    params.setPriceGroupName("例外供应商");
    params.setRstCapital(2000);
    params.setBrandRange("计算机软件");
    params.setReconAccountCode("1123010000");
    params.setMainRate("XI");
    params.setIsPromotionDeduct(0);
    params.setIsDeficiency(0);
    params.setIsDirectSupply(0);
    params.setEffectiveDay(0);
    params.setReconSignCode("1");
    params.setReconSignName("6/7/21/22");
    params.setIsTaxFree(1);
    params.setFreshSupplierLabelCode("04");
    params.setFreshSupplierLabelName("全球贸（进口）");
    params.setCompanyCode("2115");
    params.setCompanyName("福建彩食鲜供应链管理有限公司");
    params.setPurchaseOrgCode("P600");
    params.setPurchaseOrgName("彩食鲜福建大区");
    return params;
  }
}
