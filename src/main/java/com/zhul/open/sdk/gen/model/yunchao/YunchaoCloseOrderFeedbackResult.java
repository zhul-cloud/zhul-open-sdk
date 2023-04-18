package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

/**
 * @author liutl
 * @date 2019/8/2 10:58
 * 对应接口编码：YCSMS1004
 * 名称：云超接口关单回传
 * 内容描述：SAP销售订单取消的结果回传彩食鲜供应链
 */
@Data
public class YunchaoCloseOrderFeedbackResult  implements APIResult {


  //销售订单号
  private String sellOrderNo;

  //关单时间
  private String closeDate;

  //超期关闭标志
  private String closeFlag;

  //销售订单类型
  private String sellType;

  //备用字段
  private String flied1;

  //备用字段
  private String flied2;

}
