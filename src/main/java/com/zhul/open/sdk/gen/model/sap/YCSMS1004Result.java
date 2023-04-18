package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class YCSMS1004Result implements APIResult {

  @JacksonXmlProperty(localName = "sale_order_code")
  private String sellOrderNo;

  @JacksonXmlProperty(localName = "finish_time")
  private String closeDate;

  @JacksonXmlProperty(localName = "expire_finish_flag")
  private String closeFlag;

  @JacksonXmlProperty(localName = "sale_order_type")
  private String sellType;

  @JacksonXmlProperty(localName = "flied1")
  private String flied1;

  @JacksonXmlProperty(localName = "flied2")
  private String flied2;
}
