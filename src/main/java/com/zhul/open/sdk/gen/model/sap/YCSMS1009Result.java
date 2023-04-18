package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * Created by yanglikai on 2019/8/12.
 */
@Data
public class YCSMS1009Result implements APIResult {

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<YCSMS1009Result.Item> item;

  @Data
  public static class Item {

    /**
     * 行号
     */
    @JacksonXmlProperty(localName = "rownum")
    private String rowNum;

    /**
     * 审批单号
     */
    @JacksonXmlProperty(localName = "approveNo")
    private String approveNo;

    /**
     * 收货地点
     */
    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;

    /**
     * 发货地点
     */
    @JacksonXmlProperty(localName = "deliveryAddressCode")
    private String deliveryAddressCode;

    /**
     * 部类
     */
    @JacksonXmlProperty(localName = "categoryCode")
    private String categoryCode;

    /**
     * 商品编码
     */
    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;

    /**
     * 审批数量
     */
    @JacksonXmlProperty(localName = "approveQuantity")
    private String approveQuantity;

    /**
     * 审批备注
     */
    @JacksonXmlProperty(localName = "approveMsg")
    private String approveMsg;

    /**
     * 采购申请单号
     */
    @JacksonXmlProperty(localName = "applyId")
    private String applyId;

    /**
     * 库存地点
     */
    @JacksonXmlProperty(localName = "inventoryAddressCode")
    private String inventoryAddressCode;

    /**
     * 开票金额
     */
    @JacksonXmlProperty(localName = "amount")
    private String amount;

    /**
     * 条件类型
     */
    @JacksonXmlProperty(localName = "conditionType")
    private String conditionType;

    /**
     * 审批人
     */
    @JacksonXmlProperty(localName = "approvedBy")
    private String approvedBy;

    /**
     * 审批时间
     */
    @JacksonXmlProperty(localName = "approvedAt")
    private String approvedAt;

    /**
     * 预计到货日期
     */
    @JacksonXmlProperty(localName = "planDate")
    private String planDate;

    /**
     * 合并单号
     */
    @JacksonXmlProperty(localName = "mergePrId")
    private String mergePrId;

    /**
     * 拆分单号(供应商)
     */
    @JacksonXmlProperty(localName = "supplierSplitNo")
    private String supplierSplitNo;

    /**
     * 拆分单号(门店)
     */
    @JacksonXmlProperty(localName = "shopSplitNo")
    private String shopSplitNo;

    /**
     * 拆分数量
     */
    @JacksonXmlProperty(localName = "splitQty")
    private String splitQty;

    /**
     * 整散标记
     */
    @JacksonXmlProperty(localName = "dispersionFlag")
    private String dispersionFlag;
  }
}
