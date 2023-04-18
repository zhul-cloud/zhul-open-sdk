package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.util.misc.XMLUtils;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;


@Data
@JacksonXmlRootElement(localName = "SHEET")
public class ECCBMS132Params implements APIParams {

  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @Data
  public static class Header{
    /**
     * 采购订单单号 (云超、云创 一次订单申请 携带的唯一单号)
     */
    @JacksonXmlProperty(localName = "SAP_EBELN")
    private String outNo;

    @JacksonXmlProperty(localName = "SHEETID")
    private String sheetId;

    /**
     * 交货标识  'X':表示不能交货
     */
    @JacksonXmlProperty(localName = "FLAG")
    private String deliverStatus;
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
    sb.append("<ns1:MT_ECC_BMS132_EXT xmlns:ns1=\"urn:bms:ecc:deal:out\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns1:MT_ECC_BMS132_EXT>");
    String result = sb.toString();

    return result;
  }
}
