package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class B2BPT1002Result implements APIResult {

  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> item;

  @Data
  public static class Header {
    @JacksonXmlProperty(localName = "id")
    private String id;

    @JacksonXmlProperty(localName = "purchase_org")
    private String purchaseOrg;

    @JacksonXmlProperty(localName = "purchase_voucher")
    private String purchaseVoucher;

    @JacksonXmlProperty(localName = "voucher_type")
    private String voucherType;

    @JacksonXmlProperty(localName = "purchase_group")
    private String purchaseGroup;

    @JacksonXmlProperty(localName = "company_code")
    private String companyCode;

    @JacksonXmlProperty(localName = "voucher_date")
    private String voucherDate;

    @JacksonXmlProperty(localName = "vendor_id")
    private String vendorId;

    @JacksonXmlProperty(localName = "category")
    private String category;

    @JacksonXmlProperty(localName = "transfer_location")
    private String transferLocation;

    @JacksonXmlProperty(localName = "your_reference")
    private String yourReference;

    @JacksonXmlProperty(localName = "our_reference")
    private String ourReference;

    @JacksonXmlProperty(localName = "site_area")
    private String siteArea;

    @JacksonXmlProperty(localName = "extra_purchase_category")
    private String extraPurchaseCategory;

    @JacksonXmlProperty(localName = "source_of_good")
    private String sourceOfGood;

    @JacksonXmlProperty(localName = "order_type")
    private String orderType;

    @JacksonXmlProperty(localName = "piece_flag")
    private String pieceFlag;

    @JacksonXmlProperty(localName = "currency_code")
    private String currencyCode;

    @JacksonXmlProperty(localName = "note")
    private String note;

    @JacksonXmlProperty(localName = "delivery_area")
    private String deliveryArea;

    @JacksonXmlProperty(localName = "fresh_order_number")
    private String freshOrderNumber;

    @JacksonXmlProperty(localName = "reverse_flag")
    private String reverseFlag;

    @JacksonXmlProperty(localName = "national_flag")
    private String nationalFlag;

    @JacksonXmlProperty(localName = "source_system")
    private String sourceSystem;

    @JacksonXmlProperty(localName = "sheet_category")
    private String sheetCategory;

    @JacksonXmlProperty(localName = "customer_id")
    private String customerId;

    @JacksonXmlProperty(localName = "customer_name")
    private String customerName;
  }

  @Data
  public static class Item {
    @JacksonXmlProperty(localName = "id")
    private String id;

    @JacksonXmlProperty(localName = "order_numberItem")
    private String orderNumberItem;

    @JacksonXmlProperty(localName = "purchase_voucher")
    private String purchaseVoucher;

    @JacksonXmlProperty(localName = "location_code")
    private String locationCode;

    @JacksonXmlProperty(localName = "store_area")
    private String storeArea;

    @JacksonXmlProperty(localName = "product_code")
    private String productCode;

    @JacksonXmlProperty(localName = "qty")
    private BigDecimal qty;

    @JacksonXmlProperty(localName = "tax_free_price")
    private String taxFreePrice;

    @JacksonXmlProperty(localName = "unite")
    private String unit;

    @JacksonXmlProperty(localName = "tax_code")
    private String taxCode;

    @JacksonXmlProperty(localName = "delivery_date")
    private String deliveryDate;

    @JacksonXmlProperty(localName = "customer")
    private String customer;

    @JacksonXmlProperty(localName = "freeItem")
    private String freeItem;

    @JacksonXmlProperty(localName = "distribute_number")
    private String distributeNumber;

    @JacksonXmlProperty(localName = "distributeItem")
    private String distributeItem;

    @JacksonXmlProperty(localName = "delete_flag")
    private String deleteFlag;

    @JacksonXmlProperty(localName = "order_status")
    private String orderStatus;

    @JacksonXmlProperty(localName = "fresh_orderItem")
    private String freshOrderItem;

    @JacksonXmlProperty(localName = "min_fresh_qty")
    private String minFreshQty;

    @JacksonXmlProperty(localName = "original_sheet_id")
    private String originalSheetId;

    @JacksonXmlProperty(localName = "original_actual_qty")
    private String originalActualQty;

    @JacksonXmlProperty(localName = "original_order_qty")
    private String originalOrderQty;

    @JacksonXmlProperty(localName = "free_gift_qty")
    private String freeGiftQty;

    @JacksonXmlProperty(localName = "free_gift_ratio")
    private String freeGiftRatio;

    @JacksonXmlProperty(localName = "original_vendor")
    private String originalVendor;

    @JacksonXmlProperty(localName = "clear_tag")
    private String clearTag;

    @JacksonXmlProperty(localName = "reserve_flag")
    private String reserveFlag;

    @JacksonXmlProperty(localName = "reserve_order_number")
    private String reserveOrderNumber;

    @JacksonXmlProperty(localName = "receive_num")
    private BigDecimal receiveNum;

    @JacksonXmlProperty(localName = "send_num")
    private String sendNum;

    @JacksonXmlProperty(localName = "total_price")
    private String totalPrice;


  }
}
