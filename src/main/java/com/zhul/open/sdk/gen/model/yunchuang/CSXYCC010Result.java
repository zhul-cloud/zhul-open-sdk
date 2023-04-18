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
public class CSXYCC010Result implements APIParams {

  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> items;


  @Getter
  @Setter
  public static class Header {

    @JacksonXmlProperty(localName = "compensateId")
    private String compensateId;
    @JacksonXmlProperty(localName = "compensateType")
    private String compensateType;
    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;
    @JacksonXmlProperty(localName = "createdDate")
    private String createdDate;
    @JacksonXmlProperty(localName = "createdBy")
    private String createdBy;
    @JacksonXmlProperty(localName = "createdTime")
    private String createdTime;
    @JacksonXmlProperty(localName = "deliveryCode")
    private String deliveryCode;
  }

  @Getter
  @Setter
  public static class Item {
    @JacksonXmlProperty(localName = "rowNum")
    private String rowNum;

    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;

    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;

    @JacksonXmlProperty(localName = "quantity")
    private BigDecimal quantity;

    @JacksonXmlProperty(localName = "remark")
    private String remark;

    @JacksonXmlProperty(localName = "receivedQuantity")
    private BigDecimal receivedQuantity;

    @JacksonXmlProperty(localName = "shippedQuantity")
    private BigDecimal shippedQuantity;

  }

  @Override
  public Map<String, Object> toParams() {
    return null;
  }
}
