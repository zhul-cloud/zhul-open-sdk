package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.util.misc.XMLUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class B2BPT1009Params implements APIParams {

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> items;

  @Data
  public static class Item {
    @JacksonXmlProperty(localName = "review_order_code")
    private String reviewOrderCode;

    @JacksonXmlProperty(localName = "line_no")
    private String lineNo;

    @JacksonXmlProperty(localName = "review_order_by")
    private String reviewOrderBy;

    @JacksonXmlProperty(localName = "review_order_date")
    private String reviewOrderDate;

    @JacksonXmlProperty(localName = "review_order_time")
    private String reviewOrderTime;

    @JacksonXmlProperty(localName = "b2b_review_order_code")
    private String b2bReviewOrderCode;

    @JacksonXmlProperty(localName = "b2b_line_no")
    private String b2bLineNo;

    @JacksonXmlProperty(localName = "location_code")
    private String locationCode;

    @JacksonXmlProperty(localName = "warehouse_code")
    private String warehouseCode;

    @JacksonXmlProperty(localName = "product_code")
    private String productCode;

    @JacksonXmlProperty(localName = "unit")
    private String unit;

    @JacksonXmlProperty(localName = "delivery_model")
    private String deliveryModel;

    @JacksonXmlProperty(localName = "small_pack_qty")
    private String smallPackQty;

    @JacksonXmlProperty(localName = "big_pack_qty")
    private String bigPackQty;

    @JacksonXmlProperty(localName = "min_order_qty")
    private String minOrderQty;

    @JacksonXmlProperty(localName = "review_qty")
    private String reviewQty;

    @JacksonXmlProperty(localName = "plan_date")
    private String planDate;

    @JacksonXmlProperty(localName = "logistics_model")
    private String logisticsModel;

    @JacksonXmlProperty(localName = "system_price")
    private String systemPrice;

    @JacksonXmlProperty(localName = "condition_type")
    private String conditionType;

    @JacksonXmlProperty(localName = "protocol_price")
    private String protocolPrice;

    @JacksonXmlProperty(localName = "currency")
    private String currency;

    @JacksonXmlProperty(localName = "amount")
    private String amount;

    @JacksonXmlProperty(localName = "product_status")
    private String productStatus;

    @JacksonXmlProperty(localName = "header_remark")
    private String headerRemark;

    @JacksonXmlProperty(localName = "remark")
    private String remark;

    @JacksonXmlProperty(localName = "order_type")
    private String orderType;

    @JacksonXmlProperty(localName = "purchase_org_code")
    private String purchaseOrgCode;

    @JacksonXmlProperty(localName = "purchase_group_code")
    private String purchaseGroupCode;

    @JacksonXmlProperty(localName = "delivery_dc_code")
    private String deliveryDcCode;

    @JacksonXmlProperty(localName = "priority_dc_code")
    private String priorityDcCode;

    @JacksonXmlProperty(localName = "send_warehouse_code")
    private String sendWarehouseCode;

    @JacksonXmlProperty(localName = "supplier_code")
    private String supplierCode;

    @JacksonXmlProperty(localName = "valid_flag")
    private String validFlag;

    @JacksonXmlProperty(localName = "categroy_code")
    private String categroyCode;

    @JacksonXmlProperty(localName = "small_class")
    private String smallClass;

    @JacksonXmlProperty(localName = "order_model")
    private String orderModel;

    @JacksonXmlProperty(localName = "append_model")
    private String appendModel;

    @JacksonXmlProperty(localName = "site_area_code")
    private String siteAreaCode;

    @JacksonXmlProperty(localName = "putaway_group")
    private String putawayGroup;

    @JacksonXmlProperty(localName = "location_id")
    private String locationId;

    @JacksonXmlProperty(localName = "config_id")
    private String configId;

    @JacksonXmlProperty(localName = "ylszj")
    private String ylszj;

    @JacksonXmlProperty(localName = "sale_area_code")
    private String saleAreaCode;

    @JacksonXmlProperty(localName = "review_flag")
    private String reviewFlag;

    @JacksonXmlProperty(localName = "review_line_count")
    private String reviewLineCount;

    @JacksonXmlProperty(localName = "logistics_delivery_area")
    private String logisticsDeliveryArea;

    @JacksonXmlProperty(localName = "transfer_order_flag")
    private String transferOrderFlag;

    @JacksonXmlProperty(localName = "auto_proc_flag")
    private String autoProcFlag;

    @JacksonXmlProperty(localName = "supply_model")
    private String supplyModel;

    @JacksonXmlProperty(localName = "free_flag")
    private String freeFlag;

    @JacksonXmlProperty(localName = "logistics_config_model")
    private String logisticsConfigModel;

    @JacksonXmlProperty(localName = "biz_department")
    private String bizDepartment;

    @JacksonXmlProperty(localName = "extra_purchase_type")
    private String extraPurchaseType;

    @JacksonXmlProperty(localName = "hc_apply_order_code")
    private String hcApplyOrderCode;

    @JacksonXmlProperty(localName = "hc_line_no")
    private String hcLineNo;

    @JacksonXmlProperty(localName = "fresh_pack_qty")
    private String freshPackQty;

    @JacksonXmlProperty(localName = "purchase_voucher_date")
    private String purchaseVoucherDate;
  }

  @Override
  public Map<String, Object> toParams() {
    Map<String, Object> maps = new HashMap<>();

    return maps;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    sb.append(System.lineSeparator());
    sb.append("<ns0:MT_CSCM_B2BPT1009 xmlns:ns0=\"URN:B2BPT1009\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_CSCM_B2BPT1009>");
    String result = sb.toString();

    return
        result.replace("<SHEET>", "")
            .replace("</SHEET>", "");
  }
}
