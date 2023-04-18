package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * @author liutl
 * @date 2019/8/1 15:38 对应接口编码：YCSMS1009 名称：采购审批结果回传 描述：SAP生成销售订单后回传彩食鲜供应链
 */
@Data
public class PurchaseApprovalFeedBackResult implements APIResult {

  private List<Item> items;

  @Data
  public static class Item {


    /**
     * 行项目号（采购申请单行项目） 是
     */
    private String rownum;

    /**
     * 审批单号（B2B）			是
     */
    private String approveNo;

    /**
     * 收货地点			是
     */
    private String addressCode;
    /**
     * 发货地点			是
     */
    private String deliveryAddressCode;
    /**
     * 部类			是
     */
    private String categoryCode;
    /**
     * 商品编码			是
     */
    private String goodsId;
    /**
     * 审批数量	审0（审批不通过）		是
     */
    private String approveQuantity;
    /**
     * 审批备注			否
     */
    private String approveMsg;
    /**
     * 采购申请单号			是
     */
    private String applyId;
    /**
     * 库存地点（小店）			是
     */
    private String inventoryAddressCode;
    /**
     * 开票金额（行金额）			否
     */
    private String amount;
    /**
     * 条件类型			否
     */
    private String conditionType;
    /**
     * 审批人（名称）			是
     */
    private String approvedBy;
    /**
     * 审批时间			是
     */
    private String approvedAt;
    /**
     * 预计到货日期
     */
    private String planDate;
    /**
     * 合并单号
     */
    private String mergePrId;

    /**
     * 拆分单号（供应商）
     */
    private String supplierSplitNo;
    /**
     * 拆分单号（门店）			是
     */
    private String shopSplitNo;

    /**
     * 拆分数量
     */
    private String splitQty;

    /**
     * 整散标记
     */
    private String dispersionFlag;
  }

}
