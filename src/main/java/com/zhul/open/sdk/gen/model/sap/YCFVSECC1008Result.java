package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class YCFVSECC1008Result implements APIResult {

  @JacksonXmlProperty(localName = "item")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> item;

  @Data
  public static class Item {
//    @JacksonXmlProperty(localName = "id")
//    private String id;

    /** VB单编号 **/
    @JacksonXmlProperty(localName = "sourceBillNo")
    private String sourceBillNo;

    /** VB单类型 **/
    @JacksonXmlProperty(localName = "billType")
    private String billType;

    /** VB单制单日期 **/
    @JacksonXmlProperty(localName = "createdAt")
    private String createdAt;

    /** 过账日期 **/
    @JacksonXmlProperty(localName = "accountDate")
    private String accountDate;

    /** 归属日期 **/
    @JacksonXmlProperty(localName = "accountPostDate")
    private String accountPostDate;

    /** 付款方式 **/
    @JacksonXmlProperty(localName = "payManner")
    private String payManner;

    /** 采购组织 **/
    @JacksonXmlProperty(localName = "purchaseOrg")
    private String purchaseOrg;

    /** 结算公司 **/
    @JacksonXmlProperty(localName = "companyCode")
    private String companyCode;

    /** 外部供应商 **/
    @JacksonXmlProperty(localName = "outerSupplierCode")
    private String outerSupplierCode;

    /** 采购组 **/
    @JacksonXmlProperty(localName = "purchaseDept")
    private String purchaseDept;

    /** 服务标识 **/
    @JacksonXmlProperty(localName = "serviceFlag")
    private String serviceFlag;

    /** 冲销的凭证 **/
    @JacksonXmlProperty(localName = "WriteoffBillNo")
    private String WriteoffBillNo;

    /** 项目号 **/
    @JacksonXmlProperty(localName = "lineNo")
    private Integer lineNo;

    /** 商品编码 **/
    @JacksonXmlProperty(localName = "goodsCode")
    private String goodsCode;

    /** 门店编码(真实门店) **/
    @JacksonXmlProperty(localName = "location")
    private String location;

    /** 数量 **/
    @JacksonXmlProperty(localName = "goodsQuantity")
    private BigDecimal goodsQuantity;

    /** 净额 **/
    @JacksonXmlProperty(localName = "netMoney")
    private BigDecimal netMoney;

    /** 货币 **/
    @JacksonXmlProperty(localName = "currency")
    private String currency;

    /** 商品单位 **/
    @JacksonXmlProperty(localName = "goodsUnit")
    private String goodsUnit;

    /** 结算标记 **/
    @JacksonXmlProperty(localName = "settleFlag")
    private String settleFlag;

    /** 结算地点(DC) **/
    @JacksonXmlProperty(localName = "settleDeliveryCenter")
    private String settleDeliveryCenter;

    /** 末级DC **/
    @JacksonXmlProperty(localName = "subSettlementWarehouse")
    private String subSettlementWarehouse;

    /** 外部地点 **/
    @JacksonXmlProperty(localName = "outerSupplyWarehouse")
    private String outerSupplyWarehouse;

    /** 物流模式 **/
    @JacksonXmlProperty(localName = "logisticsMode")
    private String logisticsMode;

    /** 大区 **/
    @JacksonXmlProperty(localName = "regionCode")
    private String regionCode;

    /** 税码 **/
    @JacksonXmlProperty(localName = "taxCode")
    private String taxCode;

    /** 税额 **/
    @JacksonXmlProperty(localName = "taxMoney")
    private BigDecimal taxMoney;

    /** 售卖金额？？ **/
    @JacksonXmlProperty(localName = "salesMoney")
    private BigDecimal salesMoney;

    /** ？？？ **/
    @JacksonXmlProperty(localName = "billMoney")
    private BigDecimal billMoney;

    /** 税率 **/
    @JacksonXmlProperty(localName = "taxRate")
    private BigDecimal taxRate;

    @JacksonXmlProperty(localName = "sourceBillType")
    private String sourceBillType;

    @JacksonXmlProperty(localName = "billingDocuments")
    private String billingDocuments;

    @JacksonXmlProperty(localName = "invoiceItem")
    private String invoiceItem;

    @JacksonXmlProperty(localName = "salesDocument")
    private String salesDocument;

    @JacksonXmlProperty(localName = "salesVoucherItem")
    private String salesVoucherItem;

    @JacksonXmlProperty(localName = "purchaseOrderNo")
    private String purchaseOrderNo;
  }
}
