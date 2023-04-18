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
 * Created by yanglikai on 2019/8/28.
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class CSCM1004Params implements APIParams {

  @JacksonXmlProperty(localName = "item")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> items;

  @Data
  public static class Item {

    @JacksonXmlProperty(localName = "req_order_code")
    private String requestOrderCode;

    @JacksonXmlProperty(localName = "project_number")
    private String projectNumber;

    @JacksonXmlProperty(localName = "send_status")
    private String sendStatus;

    @JacksonXmlProperty(localName = "out_storage_order_code")
    private String shippedOrderCode;
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
    sb.append("<ns0:MT_CSCM1004_CSCM xmlns:ns0=\"URN:CSCM1004\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_CSCM1004_CSCM>");
    String result = sb.toString();

    return
        result.replace("<SHEET>", "")
            .replace("</SHEET>", "");
  }
}
