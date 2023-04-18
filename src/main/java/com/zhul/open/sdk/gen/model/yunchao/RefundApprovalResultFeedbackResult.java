package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

/**
 * @author liutl
 * @date 2019/8/2 11:34
 * 对应接口编码：YCSMS1011
 * 名称：彩食鲜退货订单下传
 * 描述：SAP审单后将退货申请结果回传彩食鲜供应链
 */
@Data
public class RefundApprovalResultFeedbackResult implements APIResult {

  //采购申请单号(YHSMS)
  private String applyId;

  //项目编号（YHSMS)
  private String rownum;

  //审批日期
  private String approveDate;

  //审批时间
  private String approveTime;

  //审批人
  private String approveBy;

  //退货地点
  private String addressCode;

  //供应地点
  private String deliverAddressCode;

  //库存地点
  private String inventoryAddress;

  //商品编码
  private String goodsId;

  //审批数量
  private String approveQuantity;

  //审批备注
  private String approveMsg;

  //供应商编码
  private String providerCode;

  //供应商描述
  private String providerName;

  //驳回原因（SAP提供描述）
  private String refuseReason;

//审批状态

  private String approveStatus;


}
