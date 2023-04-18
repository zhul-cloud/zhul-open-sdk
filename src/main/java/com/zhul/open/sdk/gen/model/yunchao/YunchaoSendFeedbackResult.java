package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * @author liutl
 * @date 2019/8/1 20:07 对应接口编码：YCSMS1003 名称：云超发货回传 描述：云超发货结果通过SAP回传彩食鲜供应链
 */
@Data
public class YunchaoSendFeedbackResult implements APIResult {

  private Header header;

  private List<Item> items;

  @Data
  public class Header {

    //销售订单号
    private String sellOrderNo;

    //发运单号 (DN单号 入库条形码）
    private String deliveryNo;

    //商品凭证
    private String voucherNo;

    //年份
    private String voucheYear;

    //采购申请号
    private String applyId;

    //审单单号
    private String approveNo;

    //供应商编码（发运地点对应的客商编码）
    private String providerCode;

    //送货人
    private String shipMan;

    //车牌号
    private String carCode;

    //承运商
    private String shippers;

    //发运时间（实际发货时间）
    private String shipTime;

    //联系电话
    private String phone;

    //备注
    private String remark;

    //销售订单类型
    //"ZA04 销售正向订单
    //ZB04 销售退货订单"
    private String saleOrderType;

    //备用字段
    private String flied1;

    //备用字段
    private String flied2;

  }

  @Data
  public class Item {

    //行号
    private String DN_rownum;


    //商品编码
    private String goodsId;

    //发运数量
    private String deliveryQuantity;

    //单价（含税）
    private String price;

    //单价（净值）
    private String purchasePriceNoTax;

    //税率
    private String rate;

    //税额（待定）
    private String taxQuota;

    //单位
    private String unit;

    //行项目金额（含税）
    private String amount;

    //行项目金额（净值）准确
    private String purchaseAmountNoTax;

    //发运单号 (DN单号 入库条形码）
    private String deliveryNo;

    //备注
    private String remark;


  }
}
