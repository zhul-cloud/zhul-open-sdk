package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.util.misc.XMLUtils;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanjj
 * @date 2019/10/31
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class CSXYCC014Params implements APIParams {

  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @Data
  public static class Header{
    @JacksonXmlProperty(localName = "poId")
    private String poId;
    @JacksonXmlProperty(localName = "appoveRes")
    private String appoveRes;
    @JacksonXmlProperty(localName = "failureReason")
    private String failureReason;
    @JacksonXmlProperty(localName = "approvedBy")
    private String approvedBy;
    @JacksonXmlProperty(localName = "approvedAt")
    private String approvedAt;
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
    sb.append("<ns0:MT_CSXYCC014_CSCM xmlns:ns0=\"URN:CSXYCC014:PurchaseRequest\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_CSXYCC014_CSCM>");
    String result = sb.toString();

    return result;
  }
}
