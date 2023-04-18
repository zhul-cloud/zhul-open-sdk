package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.zhul.open.sdk.model.APIParams;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 * @author liutl
 * @date 2019/10/16 10:58
 */
@Getter
@Setter
public class CSXYCC001Result implements APIParams {

  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> items;


  @Getter
  @Setter
  public static class Header {

    @JacksonXmlProperty(localName = "id")
    private String id;
    @JacksonXmlProperty(localName = "poId")
    private String poId;
    @JacksonXmlProperty(localName = "poType")
    private String poType;
    @JacksonXmlProperty(localName = "placeType")
    private String placeType;
    @JacksonXmlProperty(localName = "classGroup")
    private String classGroup;
    @JacksonXmlProperty(localName = "companyCode")
    private String companyCode;
    @JacksonXmlProperty(localName = "orderDate")
    private String orderDate;
    @JacksonXmlProperty(localName = "supplierCode")
    private String supplierCode;
    @JacksonXmlProperty(localName = "categoryCode")
    private String categoryCode;
    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;
    @JacksonXmlProperty(localName = "shopType")
    private String shopType;
    @JacksonXmlProperty(localName = "addressSettleCode")
    private String addressSettleCode;
    @JacksonXmlProperty(localName = "kPCustCode")
    private String kPCustCode;
    @JacksonXmlProperty(localName = "bussProcessType")
    private String bussProcessType;
    @JacksonXmlProperty(localName = "logistics")
    private String logistics;
    @JacksonXmlProperty(localName = "replenishType")
    private String replenishType;
    @JacksonXmlProperty(localName = "dispersionFlag")
    private String dispersionFlag;
    @JacksonXmlProperty(localName = "currency")
    private String currency;
    @JacksonXmlProperty(localName = "remark")
    private String remark;
    @JacksonXmlProperty(localName = "userid")
    private String userid;
    @JacksonXmlProperty(localName = "username")
    private String username;
//    @JacksonXmlProperty(localName = "origOrderId")
//    private String origOrderId;

  }

  @Getter
  @Setter
  public static class Item {
    @JacksonXmlProperty(localName = "poId")
    private String poId;

    @JacksonXmlProperty(localName = "rownum")
    private String rownum;

    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;

    @JacksonXmlProperty(localName = "quantity")
    private String quantity;

    @JacksonXmlProperty(localName = "price")
    private String price;

    @JacksonXmlProperty(localName = "purchasePriceNoTax")
    private String purchasePriceNoTax;

    @JacksonXmlProperty(localName = "unitName")
    private String unitName;

    @JacksonXmlProperty(localName = "rateCode")
    private String rateCode;

    @JacksonXmlProperty(localName = "deliveryDate")
    private String deliveryDate;

    @JacksonXmlProperty(localName = "customer")
    private String customer;

    @JacksonXmlProperty(localName = "origOrderId")
    private String origOrderId;
//
//    @JacksonXmlProperty(localName = "origRev")
//    private String origRev;

    @JacksonXmlProperty(localName = "origRecQty")
    private String origRecQty;

    @JacksonXmlProperty(localName = "origQty")
    private String origQty;
  }

  @Override
  public Map<java.lang.String, java.lang.Object> toParams() {
    return null;
  }
}
