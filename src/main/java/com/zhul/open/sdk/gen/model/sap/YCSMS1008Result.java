package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class YCSMS1008Result implements APIResult {

  @JacksonXmlProperty(localName = "item")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> item;

  @Data
  public static class Item {

    @JacksonXmlProperty(localName = "order_id")
    private String orderId;

    @JacksonXmlProperty(localName = "received_time")
    private String receivedTime;

    @JacksonXmlProperty(localName = "error_msg")
    private String errorMsg;

    @JacksonXmlProperty(localName = "sap_orderid")
    private String sapOrderid;

    @JacksonXmlProperty(localName = "status")
    private String status;

    @JacksonXmlProperty(localName = "interface_no")
    private String interfaceNo;
  }
}
