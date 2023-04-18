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
public class YCSMS1010Params implements APIParams {

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<YCSMS1010Params.Item> items;

  @Data
  public static class Item {

    /**
     * 采购申请单号
     */
    @JacksonXmlProperty(localName = "applyId")
    private String applyId;

    /**
     * 行项目编号
     */
    @JacksonXmlProperty(localName = "rownum")
    private String rownum;

    /**
     * 销售类型
     */
    @JacksonXmlProperty(localName = "sellType")
    private String sellType;

    /**
     * 退货地点
     */
    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;

    /**
     * 部类编码
     */
    @JacksonXmlProperty(localName = "categoryCode")
    private String categoryCode;

    /**
     * 申请日期(YYYYMMDD)
     */
    @JacksonXmlProperty(localName = "createdDate")
    private String createdDate;

    /**
     * 申请时间(HHMMSS)
     */
    @JacksonXmlProperty(localName = "createdTime")
    private String createdTime;

    /**
     * 申请人
     */
    @JacksonXmlProperty(localName = "createdBy")
    private String createdBy;

    /**
     * 备注
     */
    @JacksonXmlProperty(localName = "remark")
    private String remark;

    /**
     * 供应地点
     */
    @JacksonXmlProperty(localName = "deliverAddressCode")
    private String deliverAddressCode;

    /**
     * 商品编码
     */
    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;

    /**
     * 申请数量
     */
    @JacksonXmlProperty(localName = "quantity")
    private String quantity;

    /**
     * 价格单位
     */
    @JacksonXmlProperty(localName = "unit")
    private String unit;

    /**
     * 条件类型
     */
    @JacksonXmlProperty(localName = "condtionType")
    private String condtionType;

    /**
     * 含税进价
     */
    @JacksonXmlProperty(localName = "price")
    private String price;

    /**
     * 采购组
     */
    @JacksonXmlProperty(localName = "poGroup")
    private String poGroup;

    /**
     * 商品类目
     */
    @JacksonXmlProperty(localName = "minCategoryCode")
    private String minCategoryCode;

    /**
     * 退货原因
     */
    @JacksonXmlProperty(localName = "returnReason")
    private String returnReason;

    /**
     * 原DN单号
     */
    @JacksonXmlProperty(localName = "deliveryNo")
    private String deliveryNo;


    /**
     * DN行项目号
     */
    @JacksonXmlProperty(localName = "dnRownum")
    private String dnRownum;
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
    sb.append("<ns0:MT_YCSMS1010_YCSMS xmlns:ns0=\"URN:YCSMS1010:ReturnApplicationUpload\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_YCSMS1010_YCSMS>");
    String result = sb.toString();

    return
        result.replace("<SHEET>", "")
            .replace("</SHEET>", "");
  }
}
