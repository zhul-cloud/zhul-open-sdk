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
 * Created by yanglikai on 2019/5/23.
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class YCSMS1004Params implements APIParams {

  @JacksonXmlProperty(localName = "SHEET")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Sheet> sheets;

  @Data
  public static class Sheet {

    /**
     * 销售订单号
     */
    @JacksonXmlProperty(localName = "sellOrderNo")
    private String sellOrderNo;

    /**
     * 关单时间
     */
    @JacksonXmlProperty(localName = "closeDate")
    private String closeDate;

    /**
     * 超期关闭标志
     */
    @JacksonXmlProperty(localName = "closeFlag")
    private String closeFlag;

    /**
     * 销售订单类型
     */
    @JacksonXmlProperty(localName = "sellType")
    private String sellType;

    /**
     * 备用字段
     */
    @JacksonXmlProperty(localName = "flied1")
    private String flied1;

    /**
     * 备用字段
     */
    @JacksonXmlProperty(localName = "flied2")
    private String flied2;
  }

  @Override
  public Map<String, Object> toParams() {
    Map<String, Object> maps = new HashMap<>();
    return maps;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    sb.append(System.lineSeparator());
    sb.append("<ns0:MT_YCSMS1004_YCSMS xmlns:ns0=\"URN:YCSMS1004:ClosePurchaseOrder\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_YCSMS1004_YCSMS>");
    String result = sb.toString();

    return
        result.replace("<SHEET>", "")
            .replace("</SHEET>", "");
  }
}
