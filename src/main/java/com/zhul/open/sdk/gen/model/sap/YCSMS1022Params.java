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
 * Created by yanglikai on 2019/8/12.
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class YCSMS1022Params implements APIParams {

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<YCSMS1022Params.Item> items;

  @Data
  public static class Item {

    /**
     * 采购单编号
     */
    @JacksonXmlProperty(localName = "poId")
    private String poId;

    /**
     * 商品编码
     */
    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;

    /**
     * 出入库单号
     */
    @JacksonXmlProperty(localName = "deliverNo")
    private String deliverNo;

    /**
     * 收货数量
     */
    @JacksonXmlProperty(localName = "quantityProcessed")
    private String quantityProcessed;

    /**
     * SAP发运单号
     */
    @JacksonXmlProperty(localName = "sapDeliveryNo")
    private String sapDeliveryNo;

    /**
     * SAP行项目号
     */
    @JacksonXmlProperty(localName = "sapRownum")
    private String sapRownum;

    /**
     * 收货时间
     */
    @JacksonXmlProperty(localName = "actTime")
    private String actTime;

    /**
     * SAP销售单号
     */
    @JacksonXmlProperty(localName = "sapSellNo")
    private String sapSellNo;
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
    sb.append("<ns0:MT_YCSMS1022_YCSMS xmlns:ns0=\"URN:YCSMS1022:GoodsRecipient\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_YCSMS1022_YCSMS>");
    String result = sb.toString();

    return
        result.replace("<SHEET>", "")
            .replace("</SHEET>", "");
  }
}
