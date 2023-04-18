package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIParams;

import java.util.HashMap;
import java.util.Map;

import com.zhul.open.sdk.util.misc.XMLUtils;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author liutl
 * @date 2019/10/15 17:07
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class CSXYCC011Params implements APIParams {

  /**
   * 门店编码
   */
  @JacksonXmlProperty(localName = "shopCode")
  private String shopCode;

  /**
   * 商品编码
   */
  @JacksonXmlProperty(localName = "productCode")
  private String productCode;



  @Override
  public Map<String, Object> toParams() {
    return new HashMap<>();
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    sb.append(System.lineSeparator());
    sb.append("<ns0:MT_CSXYCC011_CSCM xmlns:ns0=\"URN:CSXYCC011:PurchaseRequest\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_CSXYCC011_CSCM>");
    String result = sb.toString();

    return result;
  }
}
