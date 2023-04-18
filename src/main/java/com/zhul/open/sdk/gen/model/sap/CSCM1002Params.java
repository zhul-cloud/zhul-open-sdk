package com.zhul.open.sdk.gen.model.sap;

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


@Data
@JacksonXmlRootElement(localName = "sheet")
public class CSCM1002Params implements APIParams {

  @JacksonXmlProperty(localName = "header")
  private Header header;

  @JacksonXmlProperty(localName = "item")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> itemList;

  @Data
  public class Header{
    @JacksonXmlProperty(localName = "out_no")
    private String outNo;
    @JacksonXmlProperty(localName = "supplier_code")
    private String supplierCode;
    @JacksonXmlProperty(localName = "shop_code")
    private String shopCode;
    @JacksonXmlProperty(localName = "approve_by")
    private String approveBy;
    @JacksonXmlProperty(localName = "approve_date")
    private String approveDate;
    @JacksonXmlProperty(localName = "approve_time")
    private String approveTime;
  }

  @Data
  public class Item{
    @JacksonXmlProperty(localName = "item_no")
    private String itemNo;
    @JacksonXmlProperty(localName = "product_code")
    private String productCode;
    @JacksonXmlProperty(localName = "approve_qty")
    private BigDecimal approveQty;
    @JacksonXmlProperty(localName = "status")
    private String status;
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
    sb.append("<ns0:MT_CSCM1002_CSCM xmlns:ns0=\"URN:CSCM1002\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_CSCM1002_CSCM>");
    String result = sb.toString();

    return result;
  }
}
