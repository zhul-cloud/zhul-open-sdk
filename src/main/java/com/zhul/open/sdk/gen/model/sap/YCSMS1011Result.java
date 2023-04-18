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
public class YCSMS1011Result implements APIResult {

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<YCSMS1011Result.Item> item;

  @Data
  public static class Item {

    /**
     * 采购申请单号
     */
    @JacksonXmlProperty(localName = "applyId")
    private String applyId;

    /**
     * 项目编号
     */
    @JacksonXmlProperty(localName = "rownum")
    private String rownum;

    /**
     * 审批日期
     */
    @JacksonXmlProperty(localName = "approveDate")
    private String approveDate;

    /**
     * 审批时间
     */
    @JacksonXmlProperty(localName = "approveTime")
    private String approveTime;

    /**
     * 审批人
     */
    @JacksonXmlProperty(localName = "approveBy")
    private String approveBy;

    /**
     * 退货地点
     */
    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;

    /**
     * 供应地点
     */
    @JacksonXmlProperty(localName = "deliverAddressCode")
    private String deliverAddressCode;

    /**
     * 库存地点
     */
    @JacksonXmlProperty(localName = "inventoryAddress")
    private String inventoryAddress;

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
     * 供应商编码
     */
    @JacksonXmlProperty(localName = "providerCode")
    private String providerCode;

    /**
     * 供应商名称
     */
    @JacksonXmlProperty(localName = "providerName")
    private String providerName;

    /**
     * 驳回原因
     */
    @JacksonXmlProperty(localName = "refuseReason")
    private String refuseReason;

    /**
     * 审批状态
     */
    @JacksonXmlProperty(localName = "approveStatus")
    private String approveStatus;
  }
}
