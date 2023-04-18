package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * @author liutl
 * @date 2019/8/1 19:46 对应接口编码：YCSMS1002 名称：销售订单回传 描述：SAP审单后将采购申请结果回传彩食鲜供应链
 */
@Data
public class SaleOrderFeedbackResult implements APIResult {

  private Header header;

  private List<Item> items;

  @Data
  public class Header {

    //采购申请单号
    private String applyId;

    //审单单号
    private String sellOrderNo;

    //销售订单号
    private String saleOrderCode;

    //销售订单号
    private String sellType;

    //销售订单类型
    private String providerCode;

    //供货商编号（注意：是发货地点客商编号）
    private String providerName;

    //供货商名称（注意：是发货地点客商名称）
    private String companySettleCode;

    //结算公司（付款方对应的公司：2300）
    private String deliverAddressCode;

    //收货地点（送达方去掉S）
    private String planTime;

    //交货日期（SO计划交货日期，同SO发运一次）
    private String source;

    //订单来源
    private String flied1;

    //备用字段
    private String flied2;

  }

  @Data
  public class Item {

    //行号
    private String rownum;

    //商品编码
    private String goodsId;

    //单据数量
    private String quantity;

    //单价（含税）
    private String price;

    //单价（净值）
    private String purchasePriceNoTax;

    //税率
    private String rate;

    //单位
    private String unitName;

    //单位编码
    private String unit;

    //行项目总金额（含税）
    private String amount;

    //行项目总金额（净值）
    private String purchaseAmountNoTax;

    //税额
    private String tax;

    //备用字段
    private String flied1;

    //备用字段
    private String flied2;

  }
}
