package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIParams;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhul.open.sdk.util.misc.XMLUtils;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author liutl
 * @date 2019/10/15 16:29
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class CSXYCC004Params implements APIParams {


  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> items;

  @Data
  public static class Header {


    /**
     * 销售订单号
     */
    @JacksonXmlProperty(localName = "sellOrderNo")
    private String sellOrderNo;

    /**
     * 发运单号 (DN单号 入库条形码）
     */
    @JacksonXmlProperty(localName = "deliveryNo")
    private String deliveryNo;

    /**
     * 商品凭证
     */
    @JacksonXmlProperty(localName = "voucherNo")
    private String voucherNo;

    /**
     * 年份
     */
    @JacksonXmlProperty(localName = "voucheYear")
    private String voucheYear;

    /**
     * 采购订单号
     */
    @JacksonXmlProperty(localName = "applyId")
    private String applyId;

    /**
     * 审单单号
     */
    @JacksonXmlProperty(localName = "approveNo")
    private String approveNo;

    /**
     * 供应商编码
     */
    @JacksonXmlProperty(localName = "providerCode")
    private String providerCode;

    /**
     * 送货人
     */
    @JacksonXmlProperty(localName = "shipMan")
    private String shipMan;

    /**
     * 车牌号
     */
    @JacksonXmlProperty(localName = "carCode")
    private String carCode;

    /**
     * 承运商
     */
    @JacksonXmlProperty(localName = "shippers")
    private String shippers;

    /**
     * 发运时间（实际发货时间）
     */
    @JacksonXmlProperty(localName = "shipTime")
    private Integer shipTime;

    /**
     * 联系电话
     */
    @JacksonXmlProperty(localName = "phone")
    private String phone;

    /**
     * 备注
     */
    @JacksonXmlProperty(localName = "remark")
    private String remark;


    /**
     * 销售订单类型
     */
    @JacksonXmlProperty(localName = "saleOrderType")
    private String saleOrderType;


  }

  @Data
  public static class Item {

    /**
     * 行号
     */
    @JacksonXmlProperty(localName = "rownum")
    private String rownum;

    /**
     * 商品编码
     */
    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;


    /**
     * 发运数量
     */
    @JacksonXmlProperty(localName = "deliveryQuantity")
    private BigDecimal deliveryQuantity;

    /**
     * 单价（含税）
     */
    @JacksonXmlProperty(localName = "price")
    private BigDecimal price;


    /**
     * 税率
     */
    @JacksonXmlProperty(localName = "purchasePriceNoTax")
    private String purchasePriceNoTax;

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
    @JacksonXmlProperty(localName = "amount")
    private BigDecimal amount;

    /**
     * 行项目金额（净值）准确
     */
    @JacksonXmlProperty(localName = "purchaseAmountNoTax")
    private String purchaseAmountNoTax;

    /**
     * 发运单号 (DN单号 入库条形码）
     */
    @JacksonXmlProperty(localName = "deliveryNo")
    private String deliveryNo;

    /**
     * 备注
     */
    @JacksonXmlProperty(localName = "remark")
    private String remark;


  }

  @Override
  public Map<String, Object> toParams() {
    return new HashMap<>();
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    sb.append(System.lineSeparator());
    sb.append("<ns0:MT_CSXYCC004_CSCM xmlns:ns0=\"URN:CSXYCC004:PurchaseRequest\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_CSXYCC004_CSCM>");
    String result = sb.toString();

    return result;
  }
}
