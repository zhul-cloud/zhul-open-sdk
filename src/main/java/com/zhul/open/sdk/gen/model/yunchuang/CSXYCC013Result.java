package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.zhul.open.sdk.model.APIParams;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author liulong
 * @date 2019/10/16 10:58
 */
@Getter
@Setter
public class CSXYCC013Result implements APIParams {

  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> items;


  @Getter
  @Setter
  public static class Header {

    @JacksonXmlProperty(localName = "poId")
    private String poId;
    @JacksonXmlProperty(localName = "deliveryNo")
    private String deliveryNo;
    @JacksonXmlProperty(localName = "returnType")
    private Integer returnType;
    @JacksonXmlProperty(localName = "placeType")
    private String placeType;
    @JacksonXmlProperty(localName = "supplierCode")
    private String supplierCode;
    @JacksonXmlProperty(localName = "categoryCode")
    private String categoryCode;
    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;
    @JacksonXmlProperty(localName = "addressSettleCode")
    private String addressSettleCode;
    @JacksonXmlProperty(localName = "classGroup")
    private String classGroup;
    @JacksonXmlProperty(localName = "remark")
    private String remark;
    @JacksonXmlProperty(localName = "createdDate")
    private String createdDate;
    @JacksonXmlProperty(localName = "createdBy")
    private String createdBy;
    @JacksonXmlProperty(localName = "createdTime")
    private String createdTime;

  }

  @Getter
  @Setter
  public static class Item {
    @JacksonXmlProperty(localName = "rownum")
    private String rownum;

    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;

    @JacksonXmlProperty(localName = "quantity")
    private BigDecimal quantity;

    @JacksonXmlProperty(localName = "price")
    private BigDecimal price;

    @JacksonXmlProperty(localName = "totalPrice")
    private BigDecimal totalPrice;

    @JacksonXmlProperty(localName = "rate")
    private String rate;

    @JacksonXmlProperty(localName = "unit")
    private String unit;

    @JacksonXmlProperty(localName = "returnReason")
    private String returnReason;

  }

  @Override
  public Map<String, Object> toParams() {
    return null;
  }
}
