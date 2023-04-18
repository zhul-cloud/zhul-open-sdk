package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIParams;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author liutl
 * @date 2019/8/8 17:12
 * 对应接口编码：CSCM1004
 * 名称：彩食鲜关单下传
 * 内容描述：彩食鲜采购订单取消的结果下传SAP
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RefundOrderStatusSendParams implements APIParams {

  //采购申请单号
  private String YBANFN;

  //行项目号
  private String BNFPO;

  //装车状态
  private String ZCSTAU;

  //发货单号
  private String sendOrder;


  @Override
  public Map<String, Object> toParams() {
    return null;
  }
}
