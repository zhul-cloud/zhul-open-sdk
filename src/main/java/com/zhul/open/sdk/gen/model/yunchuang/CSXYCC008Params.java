package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.util.misc.XMLUtils;
import lombok.Data;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liulong
 * @date 2019/10/17
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class CSXYCC008Params implements APIParams {

  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> itemList;

  @Data
  public static class Header{
    @JacksonXmlProperty(localName = "poId")
    private String poId;
    @JacksonXmlProperty(localName = "approvedDate")
    private String approvedDate;
    @JacksonXmlProperty(localName = "approvedTime")
    private String approvedTime;
    @JacksonXmlProperty(localName = "approvedBy")
    private String approveBy;
    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;
    @JacksonXmlProperty(localName = "settleAddressCode")
    private String settleAddressCode;
  }

  @Data
  public static class Item{
    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;
    @JacksonXmlProperty(localName = "quantity")
    private BigDecimal quantity;
    @JacksonXmlProperty(localName = "remark")
    private String remark;
    @JacksonXmlProperty(localName = "supplierCode")
    private String supplierCode;
    @JacksonXmlProperty(localName = "returnReason")
    private String returnReason;
    @JacksonXmlProperty(localName = "approvedStatus")
    private String approvedStatus;
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
    sb.append("<ns0:MT_CSX_YC_C008_YCSMS xmlns:ns0=\"URN:CSX_YC_C008:PurchaseRequest\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_CSX_YC_C008_YCSMS>");
    String result = sb.toString();

    return result;
  }
}
