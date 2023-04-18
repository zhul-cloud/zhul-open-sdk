package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.gen.model.sap.YCSMS1001Params;

import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.util.misc.XMLUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author liutl
 * @date 2019/10/15 15:33
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class CSXYCC007Params implements APIParams {


  @JacksonXmlProperty(localName = "HEADER")
  private Header header;

  @JacksonXmlProperty(localName = "ITEM")
  @JacksonXmlElementWrapper(useWrapping = false)
  private List<Item> items;

  @Data
  public static class Header {

    /**
     * 部类 是否必填：是
     */
    @JacksonXmlProperty(localName = "catetoryCode")
    private String catetoryCode;

    /**
     * 采购组织编码（收货地点对应采购组织编码） 是否必填：是
     */
    @JacksonXmlProperty(localName = "poOrgCode")
    private String poOrgCode;

    /**
     * 发货DC 是否必填：是
     */
    @JacksonXmlProperty(localName = "deliverAddressCode")
    private String deliverAddressCode;

    /**
     * 申请时间 是否必填：是
     */
    @JacksonXmlProperty(localName = "applyTime")
    private String applyTime;

    /**
     * 申请人 是否必填：是
     */
    @JacksonXmlProperty(localName = "createdBy")
    private String createdBy;

    /**
     * 采购申请单号 是否必填：是
     */
    @JacksonXmlProperty(localName = "applyId")
    private String applyId;

    /**
     * 结算地点 是否必填：否
     */
    @JacksonXmlProperty(localName = "settleAddressCode")
    private String settleAddressCode;


    /**
     * 收货地点 是否必填：
     */
    @JacksonXmlProperty(localName = "addressCode")
    private String addressCode;


    /**
     * 整单备注 是否必填：
     */
    @JacksonXmlProperty(localName = "remark")
    private String remark;


    /**
     * 地点类型（仓库、永辉生活店、超级物种店） 是否必填：
     */
    @JacksonXmlProperty(localName = "addressType")
    private String addressType;

    /**
     * 销售订单类型 是否必填：
     */
    @JacksonXmlProperty(localName = "sellType")
    private String sellType;


    /**
     * 申请单类型 是否必填：
     */
    @JacksonXmlProperty(localName = "orderType")
    private String orderType;


    /**
     * 订货方式 是否必填：
     */
    @JacksonXmlProperty(localName = "orderMode")
    private String orderMode;

    /**
     * 加配类型 是否必填：
     */
    @JacksonXmlProperty(localName = "additionType")
    private String additionType;

    /**
     * 销售大区 是否必填：
     */
    @JacksonXmlProperty(localName = "region")
    private String region;


    /**
     * 优先DC 是否必填：
     */
    @JacksonXmlProperty(localName = "firstDc")
    private String firstDc;


    /**
     * 货源模式 是否必填：
     */
    @JacksonXmlProperty(localName = "sourceType")
    private String sourceType;



    /**
     * 末级DC 是否必填：
     */
    @JacksonXmlProperty(localName = "lastDc")
    private String lastDc;

    /**
     * 物流模式 是否必填：
     */
    @JacksonXmlProperty(localName = "logistics")
    private String logistics;

    /**
     * 渠道标记 是否必填：
     */
    @JacksonXmlProperty(localName = "channel")
    private String channel;

    /**
     * 账面直通标记 是否必填：
     */
    @JacksonXmlProperty(localName = "directAccFlag")
    private String directAccFlag;

  }

 @Data
  public static class Item {

    /**
     * 行项目号 是否必填：
     */
    @JacksonXmlProperty(localName = "rownum")
    private String rownum;

    /**
     * 安全排面量 是否必填：
     */
    @JacksonXmlProperty(localName = "safetyInvertory")
    private String safetyInvertory;

    /**
     * 正常DMS 是否必填：
     */
    @JacksonXmlProperty(localName = "normalDms")
    private String normalDms;

    /**
     * 促销DMS 是否必填：
     */
    @JacksonXmlProperty(localName = "promotionDms")
    private String promotionDms;

    /**
     * 商品编码 是否必填：
     */
    @JacksonXmlProperty(localName = "goodsId")
    private String goodsId;

    /**
     * 申请行备注 是否必填：
     */
    @JacksonXmlProperty(localName = "remark")
    private String remark;


    /**
     * 申请数量 是否必填：
     */
    @JacksonXmlProperty(localName = "quantity")
    private String quantity;

    /**
     * 采购申请单号 是否必填：
     */
    //@JacksonXmlProperty(localName = "applyId")
    //private String applyId;

    /**
     * 条件类型 是否必填：
     */
    @JacksonXmlProperty(localName = "conditionType")
    private String conditionType;

    /**
     * 开票金额（行含税金额） 是否必填：
     */
    @JacksonXmlProperty(localName = "amount")
    private String amount;


    /**
     * 库存地点（小店） 是否必填：
     */
    @JacksonXmlProperty(localName = "inventoryAddressCode")
    private String inventoryAddressCode;

    /**
     * 单位 是否必填：
     */
    @JacksonXmlProperty(localName = "unit")
    private String unit;

    /**
     * 配送方式 是否必填：
     */
    @JacksonXmlProperty(localName = "dispatchType")
    private String dispatchType;

    /**
     * 小包装件装数 是否必填：
     */
    @JacksonXmlProperty(localName = "minPack")
    private String minPack;

    /**
     * 大包装件装数 是否必填：
     */
    @JacksonXmlProperty(localName = "maxPack")
    private String maxPack;


    /**
     * 最小订货量 是否必填：
     */
    @JacksonXmlProperty(localName = "minOrderQty")
    private String minOrderQty;

    /**
     * 进价（含税） 是否必填：
     */
    @JacksonXmlProperty(localName = "price")
    private String price;

    /**
     * 合计金额（含税） 是否必填：
     */
    @JacksonXmlProperty(localName = "totalAmount")
    private String totalAmount;

    /**
     * 商品状态 是否必填：
     */
    @JacksonXmlProperty(localName = "skuStatus")
    private String skuStatus;

    /**
     * 采购组 是否必填：
     */
    @JacksonXmlProperty(localName = "poGroup")
    private String poGroup;

    /**
     * 有效标识 是否必填：
     */
    @JacksonXmlProperty(localName = "validFlag")
    private String validFlag;

    /**
     * 小类 是否必填：
     */
    @JacksonXmlProperty(localName = "minCategory")
    private String minCategory;

    /**
     * 免费项目 是否必填：
     */
    @JacksonXmlProperty(localName = "freeFlag")
    private String freeFlag;

    /**
     * 供应商或债权人的帐号 是否必填：
     */
    @JacksonXmlProperty(localName = "supplierCode")
    private String supplierCode;

    /**
     * 供应商起订金额 是否必填：
     */
    @JacksonXmlProperty(localName = "supplierAmount")
    private String supplierAmount;

    /**
     * 交货日期 是否必填：
     */
    @JacksonXmlProperty(localName = "planTime")
    private String planTime;

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
    sb.append("<ns0:MT_CSXYCC007_CSCM xmlns:ns0=\"URN:CSXYCC007:PurchaseRequest\">");
    sb.append(System.lineSeparator());
    sb.append(XMLUtils.tXML(this));
    sb.append("</ns0:MT_CSXYCC007_CSCM>");
    String result = sb.toString();

    return result;
  }

}
