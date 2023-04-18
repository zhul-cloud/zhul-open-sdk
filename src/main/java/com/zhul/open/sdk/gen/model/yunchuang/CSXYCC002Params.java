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
 * @author wanjj
 * @date 2019/10/17
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class CSXYCC002Params implements APIParams {

  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> itemList;

  @Data
  public static class Header{
    @JacksonXmlProperty(localName = "applyId")
    private String applyId;
    @JacksonXmlProperty(localName = "sellOrderNo")
    private String sellOrderNo;
    @JacksonXmlProperty(localName = "sellType")
    private String sellType;
    @JacksonXmlProperty(localName = "providerCode")
    private String providerCode;
    @JacksonXmlProperty(localName = "providerName")
    private String providerName;
    @JacksonXmlProperty(localName = "companySettleCode")
    private String companySettleCode;
    @JacksonXmlProperty(localName = "deliverAddressCode")
    private String deliverAddressCode;
    @JacksonXmlProperty(localName = "planTime")
    private String planTime;
    @JacksonXmlProperty(localName = "source")
    private String source;
  }

  @Data
  public static class Item{
    @JacksonXmlProperty(localName = "rownum")
    private String rownum;
    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;
    @JacksonXmlProperty(localName = "quantity")
    private BigDecimal quantity;
    @JacksonXmlProperty(localName = "price")
    private String price;
    @JacksonXmlProperty(localName = "purchasePriceNoTax")
    private String purchasePriceNoTax;
    @JacksonXmlProperty(localName = "rate")
    private String rate;
    @JacksonXmlProperty(localName = "unitName")
    private String unitName;
    @JacksonXmlProperty(localName = "unit")
    private BigDecimal unit;
    @JacksonXmlProperty(localName = "amount")
    private String amount;
    @JacksonXmlProperty(localName = "purchaseAmountNoTax")
    private String purchaseAmountNoTax;
    @JacksonXmlProperty(localName = "tax")
    private String tax;
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
    sb.append("<ns0:MT_CSXYCC002_CSCM xmlns:ns0=\"URN:CSXYCC002:PurchaseRequest\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_CSXYCC002_CSCM>");
    String result = sb.toString();

    return result;
  }
}
