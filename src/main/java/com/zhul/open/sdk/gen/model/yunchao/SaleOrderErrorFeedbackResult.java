package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

/**
 * @author liutl
 * @date 2019/8/2 11:11
 * 对应接口编码：YCSMS1008
 * 名称：销售订单错误回传 描述：
 * SAP销售单生成错误回传彩食鲜供应链
 */
@Data
public class SaleOrderErrorFeedbackResult implements APIResult {

  //采购申请单号
  private String applyId;

  //审批时间（创建时间）
  private String updatedAt;

  //审批失败错误信息
  private String approveMsg;

  //B2B拆单号
  private String sellOrderNo;

  //类型（S 成功,E 失败）
  private String approveStatus;


}
