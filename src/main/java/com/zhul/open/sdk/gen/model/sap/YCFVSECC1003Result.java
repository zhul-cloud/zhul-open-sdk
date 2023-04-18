package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * Created by mishun on 2019/10/15.
 */
@Data
@JacksonXmlRootElement(localName = "sheet")
public class YCFVSECC1003Result implements APIResult {

  @JacksonXmlProperty(localName = "header")
  private Header header;

  @JacksonXmlProperty(localName = "item")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> item;

  @Data
  public static class Header {

    @JacksonXmlProperty(localName = "outerInvoiceNo")
    private String outerInvoiceNo;

    @JacksonXmlProperty(localName = "orderBillType")
    private String orderBillType;

    @JacksonXmlProperty(localName = "accountLocationNo")
    private String accountLocationNo;

    @JacksonXmlProperty(localName = "inAddressCode")
    private String inAddressCode;

    @JacksonXmlProperty(localName = "inAddressCompanyCode")
    private String inAddressCompanyCode;

    @JacksonXmlProperty(localName = "outAddressCompanyCode")
    private String outAddressCompanyCode;

    @JacksonXmlProperty(localName = "saleNo")
    private String saleNo;

    @JacksonXmlProperty(localName = "financeDate")
    private String financeDate;

    @JacksonXmlProperty(localName = "supplierNo")
    private String supplierNo;

    @JacksonXmlProperty(localName = "currencyType")
    private String currencyType;

    @JacksonXmlProperty(localName = "accountDate")
    private String accountDate;

    @JacksonXmlProperty(localName = "accountYear")
    private String accountYear;

    @JacksonXmlProperty(localName = "deliveryBillNo")
    private String deliveryBillNo;

    @JacksonXmlProperty(localName = "cancelOriginNo")
    private String cancelOriginNo;

    @JacksonXmlProperty(localName = "cancelFlag")
    private String cancelFlag;

  }

  @Data
  public static class Item {

    @JacksonXmlProperty(localName = "id")
    private String id;

    @JacksonXmlProperty(localName = "skuCode")
    private String skuCode;

    @JacksonXmlProperty(localName = "skuName")
    private String skuName;

    @JacksonXmlProperty(localName = "skuUnit")
    private String skuUnit;

    @JacksonXmlProperty(localName = "skuQuanity")
    private String skuQuanity;

    @JacksonXmlProperty(localName = "entryTaxCode")
    private String entryTaxCode;

    @JacksonXmlProperty(localName = "totalNetPrice")
    private String totalNetPrice;

    @JacksonXmlProperty(localName = "totalTax")
    private String totalTax;

    @JacksonXmlProperty(localName = "totalPrice")
    private String totalPrice;

    @JacksonXmlProperty(localName = "outerSupplierNo")
    private String outerSupplierNo;

    @JacksonXmlProperty(localName = "saleOrderNo")
    private String saleOrderNo;

    @JacksonXmlProperty(localName = "chargeOrderNo")
    private String chargeOrderNo;

    @JacksonXmlProperty(localName = "deliveryLocationNo")
    private String deliveryLocationNo;
  }
}
