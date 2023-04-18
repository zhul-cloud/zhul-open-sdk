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
public class YCSMS1003Result implements APIResult {

  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> item;

  @Data
  public static class Header {

    /**
     * 销售订单号
     */
    @JacksonXmlProperty(localName = "sale_order_code")
    private String saleOrderCode;

    /**
     * 发运单号 (DN单号 入库条形码）
     */
    @JacksonXmlProperty(localName = "logistic_code")
    private String logisticCode;

    /**
     * 商品凭证
     */
    @JacksonXmlProperty(localName = "product_voucher_code")
    private String productVoucherCode;

    /**
     * 年份
     */
    @JacksonXmlProperty(localName = "year")
    private String year;

    /**
     * 采购申请号
     */
    @JacksonXmlProperty(localName = "apply_order_code")
    private String applyOrderCode;

    /**
     * 审单单号
     */
    @JacksonXmlProperty(localName = "review_order_code")
    private String reviewOrderCode;

    /**
     * 供应商编码（发运地点对应的客商编码）
     */
    @JacksonXmlProperty(localName = "supplier_code")
    private String supplierCode;

    /**
     * 送货人
     */
    @JacksonXmlProperty(localName = "sender_user")
    private String senderUser;

    /**
     * 车牌号
     */
    @JacksonXmlProperty(localName = "car_number")
    private String carNumber;

    /**
     * 承运商
     */
    @JacksonXmlProperty(localName = "shipper_code")
    private String shipperCode;

    /**
     * 发运时间（实际发货时间）
     */
    @JacksonXmlProperty(localName = "shipped_time")
    private String shippedTime;

    /**
     * 联系电话
     */
    @JacksonXmlProperty(localName = "tel")
    private String tel;

    /**
     * 备注
     */
    @JacksonXmlProperty(localName = "remark")
    private String remark;

    /**
     * 销售类型
     */
    @JacksonXmlProperty(localName = "sale_order_type")
    private String saleOrderType;

    /**
     * 备用字段
     */
    @JacksonXmlProperty(localName = "flied1")
    private String flied1;

    /**
     * 备用字段
     */
    @JacksonXmlProperty(localName = "flied2")
    private String flied2;
  }

  @Data
  public static class Item {

    /**
     * 行号
     */
    @JacksonXmlProperty(localName = "line_no")
    private String lineNo;

    /**
     * 商品编码
     */
    @JacksonXmlProperty(localName = "product_code")
    private String productCode;

    /**
     * 发运数量
     */
    @JacksonXmlProperty(localName = "shipped_qty")
    private String shippedQty;

    /**
     * 单价（含税）
     */
    @JacksonXmlProperty(localName = "price_include_tax")
    private String priceIncludeTax;

    /**
     * 单价（净值）
     */
    @JacksonXmlProperty(localName = "price_free_tax")
    private String priceFreeTax;

    /**
     * 税率
     */
    @JacksonXmlProperty(localName = "rate")
    private String rate;

    /**
     * 单位
     */
    @JacksonXmlProperty(localName = "unit")
    private String unit;

    /**
     * 行项目金额（含税）
     */
    @JacksonXmlProperty(localName = "amount_include_tax")
    private String amountIncludeTax;

    /**
     * 行项目金额（净值）准确
     */
    @JacksonXmlProperty(localName = "amount_free_tax")
    private String amountFreeTax;

    /**
     * 发运单号 (DN单号 入库条形码）
     */
    @JacksonXmlProperty(localName = "logistic_code")
    private String logisticCode;

    /**
     * 备注
     */
    @JacksonXmlProperty(localName = "remark")
    private String remark;

    /**
     * 生产日期
     */
    @JacksonXmlProperty(localName = "produced_date")
    private String producedDate;
  }
}
