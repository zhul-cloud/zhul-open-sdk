package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class B2BPT1004Result implements APIResult {

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> item;

  @Data
  public static class Item {
    @JacksonXmlProperty(localName = "id")
    private String id;

    @JacksonXmlProperty(localName = "product_voucher")
    private String productVoucher;

    @JacksonXmlProperty(localName = "product_annual")
    private String productAnnual;

    @JacksonXmlProperty(localName = "product_line_no")
    private Integer productLineNo;

    @JacksonXmlProperty(localName = "location_code")
    private String locationCode;

    @JacksonXmlProperty(localName = "product_code")
    private String productCode;

    @JacksonXmlProperty(localName = "warehouse_code")
    private String warehouseCode;

    @JacksonXmlProperty(localName = "received_qty")
    private Double receivedQty;

    @JacksonXmlProperty(localName = "unit")
    private String unit;

    @JacksonXmlProperty(localName = "received_time")
    private String receivedTime;

    @JacksonXmlProperty(localName = "move_type")
    private String moveType;

    @JacksonXmlProperty(localName = "purchase_order_code")
    private String purchaseOrderCode;

    @JacksonXmlProperty(localName = "purchase_order_line_no")
    private String purchaseOrderLineNo;

    @JacksonXmlProperty(localName = "delivery_order_code")
    private String deliveryOrderCode;

    @JacksonXmlProperty(localName = "delivery_order_line_no")
    private String deliveryOrderLineNo;

    @JacksonXmlProperty(localName = "user_name")
    private String userName;

    @JacksonXmlProperty(localName = "voucher_code")
    private String voucherCode;

    @JacksonXmlProperty(localName = "amount")
    private String amount;
  }
}
