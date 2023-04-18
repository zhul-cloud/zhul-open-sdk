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
@JacksonXmlRootElement(localName = "SHEET")
public class CSCM1003Params implements APIParams {

  @JacksonXmlProperty(localName = "item")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> item;

  @Data
  public static class Item {

  /**
   * 采购凭证号 (云超、云创 一次订单申请 携带的唯一单号)
   */
  @JacksonXmlProperty(localName = "out_no")
  private String outNo;

  /**
   * 采购凭证的项目编号
   */
  @JacksonXmlProperty(localName = "item_no")
  private String itemNo;

  /**
   * 处理状态 (默认为空)
   */
  @JacksonXmlProperty(localName = "status")
  private String status;

  /**
   * 商品编码
   */
  @JacksonXmlProperty(localName = "product_code")
  private String productCode;

  /**
   * 地点编码
   */
  @JacksonXmlProperty(localName = "shop_code")
  private String shopCode;

  /**
   * 库存地点编码
   */
  @JacksonXmlProperty(localName = "dc_code")
  private String dcCode;

  /**
   * 关联单号 (采购凭证号为UB单时必填，填入关联的NB单号)
   * (云超、云创 多个门店 直通类型销售单的总单号)
   */
  @JacksonXmlProperty(localName = "out_no2")
  private String parentsOutNo ;

  /**
   * 发货数量
   */
  @JacksonXmlProperty(localName = "send_qty")
  private BigDecimal sendQty;

  /**
   * 最大签收数量
   */
  @JacksonXmlProperty(localName = "limit_sign_qty")
  private BigDecimal limitSignQty;

  /**
   * 外部销售单号 (彩食鲜代表一次发货 唯一发货单号)
   */
  @JacksonXmlProperty(localName = "deliver_no")
  private String deliverNo;

  @JacksonXmlProperty(localName = "item_no2")
  private String itemNo2;

  /**
   * 发货日期
   */
  @JacksonXmlProperty(localName = "send_date")
  private String sendDate;

  /**
   * 发货人
   */
  @JacksonXmlProperty(localName = "create_user")
  private String createUser;

  /**
   * 来源系统 (默认 - CX)
   */
  @JacksonXmlProperty(localName = "source_sys")
  private String sourceSystem;

  /**
   * 发货备注 (暂无)
   */
  @JacksonXmlProperty(localName = "remarks")
  private String remarks;

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
    sb.append("<ns0:MT_CSCM1003_CSCM xmlns:ns0=\"URN:CSCM1003\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_CSCM1003_CSCM>");
    String result = sb.toString();

    return
            result.replace("<SHEET>", "")
                    .replace("</SHEET>", "");
  }
}
