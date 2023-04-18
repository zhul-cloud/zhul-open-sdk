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
 * Created by yanglikai on 2019/8/12.
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class YCSMS1005Params implements APIParams {

  @JacksonXmlProperty(localName = "HEADER")
  private YCSMS1005Params.Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<YCSMS1005Params.Item> items;

  @Data
  public static class Header {

    /**
     * 采购申请单号
     */
    @JacksonXmlProperty(localName = "applyId")
    private String applyId;

    /**
     * 发货地点编码
     */
    @JacksonXmlProperty(localName = "deliverAddressCode")
    private String deliverAddressCode;

    /**
     * 收货地点
     */
    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;

    /**
     * 销售订单类型
     */
    @JacksonXmlProperty(localName = "sellType")
    private String sellType;

    /**
     * 计划交货时间
     */
    @JacksonXmlProperty(localName = "planTime")
    private String planTime;

    /**
     * 申请单审批时间
     */
    @JacksonXmlProperty(localName = "approveAt")
    private String approveAt;

    /**
     * 采购订单类型
     */
    @JacksonXmlProperty(localName = "orderType")
    private String orderType;

    /**
     * 原采购订单号
     */
    @JacksonXmlProperty(localName = "origApplyId")
    private String origApplyId;

    /**
     * 出库单号
     */
    @JacksonXmlProperty(localName = "obdNo")
    private String obdNo;

    /**
     * 备注
     */
    @JacksonXmlProperty(localName = "remark")
    private String remark;

    /**
     * 备用字段
     */
    @JacksonXmlProperty(localName = "field1")
    private String field1;

    /**
     * 备用字段
     */
    @JacksonXmlProperty(localName = "field2")
    private String field2;
  }

  @Data
  public static class Item {

    /**
     * 行项目号
     */
    @JacksonXmlProperty(localName = "rownum")
    private String rownum;

    /**
     * 商品编码
     */
    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;

    /**
     * 单据数量
     */
    @JacksonXmlProperty(localName = "quantity")
    private String quantity;

    /**
     * 申请备注
     */
    @JacksonXmlProperty(localName = "remark")
    private String remark;

    /**
     * 单位
     */
    @JacksonXmlProperty(localName = "unitName")
    private String unitName;

    /**
     * 采购申请单号
     */
    @JacksonXmlProperty(localName = "applyId")
    private String applyId;

    /**
     * 条件类型
     */
    @JacksonXmlProperty(localName = "priceType")
    private String priceType;

    /**
     * 单价
     */
    @JacksonXmlProperty(localName = "price")
    private String price;

    /**
     * 库存地点
     */
    @JacksonXmlProperty(localName = "inventoryAddress")
    private String inventoryAddress;

    /**
     * 退货原因
     */
    @JacksonXmlProperty(localName = "returnReason")
    private String returnReason;

    /**
     * 备用字段
     */
    @JacksonXmlProperty(localName = "field1")
    private String field1;

    /**
     * 备用字段
     */
    @JacksonXmlProperty(localName = "field2")
    private String field2;
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
    sb.append("<ns0:MT_YCSMS1005_YCSMS xmlns:ns0=\"URN:YCSMS1005:PurchaseOrderInterface\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_YCSMS1005_YCSMS>");
    String result = sb.toString();

    return result;
  }
}
