package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zhul.open.sdk.model.APIParams;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * Created by dinglj on 2019/10/23.
 */
@Data
public class SalesOrderParams implements APIParams {

  @JsonProperty(value = "sheet")
  private List<Sheet> sheet;

  @Data
  public static class Sheet{
    @JsonProperty(value = "header")
    Header header;
    @JsonProperty(value = "item")
    List<Item> item;
  }

  @Data
  public static class Header implements Serializable {

    /**
     * 销售发票号
     */
    @JsonProperty(value = "outerInvoiceNo")
    private String invoiceNo;
    /**
     * 销售开票类型
     */
    @JsonProperty(value = "orderBillType")
    private String orderBillType;
    /**
     * 结算地点
     */
    @JsonProperty(value = "accountLocationNo")
    private String settleDcCode;
    /**
     * 收货地点
     */
    @JsonProperty(value = "inAddressCode")
    private String receiveDcCode;
    /**
     * 收货公司
     */
    @JsonProperty(value = "inAddressCompanyCode")
    private String receiveCompanyCode;
    /**
     * 发货公司
     */
    @JsonProperty(value = "outAddressCompanyCode")
    private String sendCompanyCode;

    /**
     * 结算公司
     */
    @JsonProperty(value = "supplierNo")
    private String settleCompanyCode;
    /**
     * 销售组织
     */
    @JsonProperty(value = "saleNo")
    private String saleOrg;
    /**
     * 销售日期
     */
    @JsonProperty(value = "financeDate")
    private String saleDate;
    /**
     * 货币
     */
    @JsonProperty(value = "currencyType")
    private String currencyType;
    /**
     * 签收日期
     */
    @JsonProperty(value = "accountDate")
    private String signDate;
    /**
     * 会计年度
     */
    @JsonProperty(value = "accountYear")
    private String accountYear;
    /**
     * 发货单号
     */
    @JsonProperty(value = "deliveryBillNo")
    private String shippedBatchCode;
    /**
     * 冲销原单号
     */
    @JsonProperty(value = "cancelOriginNo")
    private String cancelOriginOrderCode;
    /**
     * 是否冲销
     */
    @JsonProperty(value = "cancelFlag")
    private String cancelFlag;



  }

  @Data
  public static class Item implements Serializable{

    /**
     * 行号
     */
    @JsonProperty(value = "id")
    private String lineNo;
    /**
     * 商品编号
     */
    @JsonProperty(value = "skuCode")
    private String productCode;
    /**
     * 商品名称
     */
    @JsonProperty(value = "skuName")
    private String productName;
    /**
     * 商品单位
     */
    @JsonProperty(value = "skuUnit")
    private String productUnitCode;
    /**
     * 开票数量
     */
    @JsonProperty(value = "skuQuanity")
    private String invoiceQuanity;
    /**
     * 进项税码
     */
    @JsonProperty(value = "entryTaxCode")
    private String taxCode;
    /**
     * 未税金额
     */
    @JsonProperty(value = "totalNetPrice")
    private java.math.BigDecimal netPrice;
    /**
     * 税额
     */
    @JsonProperty(value = "totalTax")
    private java.math.BigDecimal tax;
    /**
     * 价税合计
     */
    @JsonProperty(value = "totalPrice")
    private java.math.BigDecimal totalPrice;
    /**
     * 销售订单号
     */
    @JsonProperty(value = "saleOrderNo")
    private String saleOrderNo;
    /**
     * 发货地点
     */
    @JsonProperty(value = "deliveryLocationNo")
    private String sendDcCode;

    @JsonProperty(value = "outerSupplierNo")
    private String outerSupplierNo;

    @JsonProperty(value = "chargeOrderNo")
    private String chargeOrderNo;

  }

  @Override
  public Map<String, Object> toParams() {
    Map<String, Object> maps = new HashMap<>();

    maps.put("sheet", sheet);

    return maps;
  }
}
