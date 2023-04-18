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
public class B2BPT1003Result implements APIResult {

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> item;

  @Data
  public static class Item {
    @JacksonXmlProperty(localName = "id")
    private String id;

    @JacksonXmlProperty(localName = "source_type")
    private String sourceType;

    @JacksonXmlProperty(localName = "original_order_code")
    private String originalOrderCode;

    @JacksonXmlProperty(localName = "original_line_no")
    private String originalLineNo;

    @JacksonXmlProperty(localName = "piece_flag")
    private String pieceFlag;

    @JacksonXmlProperty(localName = "serial_no")
    private String serialNo;

    @JacksonXmlProperty(localName = "process_flag")
    private String processFlag;

    @JacksonXmlProperty(localName = "level")
    private String level;

    @JacksonXmlProperty(localName = "deal_qty")
    private String dealQty;

    @JacksonXmlProperty(localName = "original_location_code")
    private String originalLocationCode;

    @JacksonXmlProperty(localName = "product_code")
    private String productCode;

    @JacksonXmlProperty(localName = "shop_to_dc_purchase_order")
    private String shopToDcPurchaseOrder;

    @JacksonXmlProperty(localName = "mdc_to_dc_purchase_order")
    private String mdcToDcPurchaseOrder;

    @JacksonXmlProperty(localName = "shop_to_supplier_purchase_order")
    private String shopToSupplierPurchaseOrder;

    @JacksonXmlProperty(localName = "mdc_to_supplier_purchase_order")
    private String mdcToSupplierPurchaseOrder;

    @JacksonXmlProperty(localName = "dc_to_supplier_purchase_order")
    private String dcToSupplierPurchaseOrder;

    @JacksonXmlProperty(localName = "first_sub_class")
    private String firstSubClass;

    @JacksonXmlProperty(localName = "last_sub_class")
    private String lastSubClass;

    @JacksonXmlProperty(localName = "source_object")
    private String sourceObject;

    @JacksonXmlProperty(localName = "update_user")
    private String updateUser;

    @JacksonXmlProperty(localName = "update_date")
    private String updateDate;

    @JacksonXmlProperty(localName = "input_time")
    private String inputTime;
  }
}
