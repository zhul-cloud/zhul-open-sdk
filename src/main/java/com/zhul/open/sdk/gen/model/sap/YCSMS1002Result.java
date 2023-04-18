package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class YCSMS1002Result implements APIResult {

  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> item;

  @Data
  public static class Header {

    @JacksonXmlProperty(localName = "apply_order_code")
    private String applyOrderCode;

    @JacksonXmlProperty(localName = "sale_order_code")
    private String saleOrderCode;

    @JacksonXmlProperty(localName = "sale_order_type")
    private String saleOrderType;

    @JacksonXmlProperty(localName = "supplier_code")
    private String supplierCode;

    @JacksonXmlProperty(localName = "supplier_name")
    private String supplierName;

    @JacksonXmlProperty(localName = "company_settle_code")
    private String companySettleCode;

    @JacksonXmlProperty(localName = "received_location_code")
    private String receivedLocationCode;

    @JacksonXmlProperty(localName = "delivery_date")
    private String deliveryDate;

    @JacksonXmlProperty(localName = "order_source")
    private String orderSource;

    @JacksonXmlProperty(localName = "filed1")
    private String flied1;

    @JacksonXmlProperty(localName = "flied2")
    private String flied2;
  }

  @Data
  public static class Item {

    @JacksonXmlProperty(localName = "line_no")
    private String lineNo;

    @JacksonXmlProperty(localName = "product_code")
    private String productCode;

    @JacksonXmlProperty(localName = "qty")
    private String qty;

    @JacksonXmlProperty(localName = "price_include_tax")
    private String priceIncludeTax;

    @JacksonXmlProperty(localName = "price_free_tax")
    private String priceFreeTax;

    @JacksonXmlProperty(localName = "rate")
    private String rate;

    @JacksonXmlProperty(localName = "unit")
    private String unit;

    @JacksonXmlProperty(localName = "unit_code")
    private String unitCode;

    @JacksonXmlProperty(localName = "amount_include_tax")
    private String amountIncludeTax;

    @JacksonXmlProperty(localName = "amount_free_tax")
    private String amountFreeTax;

    @JacksonXmlProperty(localName = "tax")
    private String tax;

    @JacksonXmlProperty(localName = "flied1")
    private String flied1;

    @JacksonXmlProperty(localName = "flied2")
    private String flied2;
  }
}
