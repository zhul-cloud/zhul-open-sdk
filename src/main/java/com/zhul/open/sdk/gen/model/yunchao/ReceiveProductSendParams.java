package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIParams;
import java.util.Map;
import lombok.Data;

/**
 * @author liutl
 * @date 2019/8/2 13:33
 * 对应接口编码：YCSMS1022
 * 名称：彩食鲜收货下传
 * 内容：彩食鲜供应链收货结果下传SAP
 */
@Data
public class ReceiveProductSendParams implements APIParams {


  /**
   * 采购单编号
   */
  private String poId;


  /**
   * 商品编码
   */
  private String goodsId;


  /**
   * 出入库单号
   */
  private String deliverNo;

  /**
   * 收货数量
   */
  private String quantityProcessed;


  /**
   * SAP发运单号
   */
  private String sapDeliveryNo;


  /**
   * sap行项目号
   */
  private String sapRownum;


  /**
   * 收货时间
   */
  private String actTime;


  /**
   * SAP销售单号
   */
  private String sapSellNo;


  @Override
  public Map<String, Object> toParams() {
    return null;
  }
}
