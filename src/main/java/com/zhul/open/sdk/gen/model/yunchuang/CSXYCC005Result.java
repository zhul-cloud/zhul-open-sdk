package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

import java.util.List;

/**
 * @author wanjj
 * @date 2019/10/18
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class CSXYCC005Result implements APIResult {

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<CSXYCC005Result.Item> item;

  @Data
  public static class Item {

    /**
     * 入库单号
     */
    @JacksonXmlProperty(localName = "invCode")
    private String invCode;
    /**
     * 商品年度
     */
    @JacksonXmlProperty(localName = "voucherYear")
    private String voucherYear;
    /**
     * 地点
     */
    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;
    /**
     * 商品
     */
    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;
    /**
     * 收货数量
     */
    @JacksonXmlProperty(localName = "recQty")
    private String recQty;
    /**
     * 单位
     */
    @JacksonXmlProperty(localName = "unitName")
    private String unitName;
    /**
     * 收货日期
     */
    @JacksonXmlProperty(localName = "recDate")
    private String recDate;
    /**
     * 收货时间
     */
    @JacksonXmlProperty(localName = "recTime")
    private String recTime;
    /**
     * 移动类型
     */
    @JacksonXmlProperty(localName = "moveType")
    private String moveType;
    /**
     * 采购订单
     */
    @JacksonXmlProperty(localName = "poId")
    private String poId;
    /**
     * 采购订单行项目
     */
    @JacksonXmlProperty(localName = "rownum")
    private String rownum;
    /**
     * 交货
     */
    @JacksonXmlProperty(localName = "delivery")
    private String delivery;
    /**
     * 交货项目
     */
    @JacksonXmlProperty(localName = "deliveryItem")
    private String deliveryItem;
    /**
     * 用户名
     */
    @JacksonXmlProperty(localName = "user")
    private String user;
    /**
     * 发运单号
     */
    @JacksonXmlProperty(localName = "deliveryNo")
    private String deliveryNo;
    /**
     * 销售单号
     */
    @JacksonXmlProperty(localName = "sellNo")
    private String sellNo;
    /**
     * 尚品凭证中的项目
     */
    @JacksonXmlProperty(localName = "ZEILE")
    private String ZEILE;
    /**
     * 库位
     */
    @JacksonXmlProperty(localName = "LGORT")
    private String LGORT;


  }

}
