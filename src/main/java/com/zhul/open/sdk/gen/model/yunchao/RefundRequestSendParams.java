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
 * @date 2019/8/2 11:18 对应接口编码：YCSMS1010 名称：退货申请下传 描述：彩食鲜供应链退货申请下传SAP
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefundRequestSendParams implements APIParams {

  //采购申请单号(YHSMS)
  private String applyId;

  //行项目编号(YHSMS)
  private String rownum;

  //类型（JTRR）
  private String sellType;

  //退货地点
  private String addressCode;

  //部类编码
  private String categoryCode;

  //申请日期 YYYYMMDD
  private String createdDate;

  //申请时间 HHMMSS
  private String createdTime;

  //申请人
  private String createdBy;

  //备注（行）
  private String remark;

  //供应地点
  private String deliverAddressCode;

  //商品编码
  private String goodsId;

  //申请数量
  private String quantity;

  //含税进价（原单进价）
  private String price;

  //价格单位
  private String unit;

  //条件类型
  private String condtionType;

  //采购组
  private String poGroup;

  //采购组织
  private String poOrgCode;

  //商品类目
  private String minCategoryCode;

  //退货原因
  private String returnReason;

  //原DN单号
  private String deliveryNo;
  //DN行项目号
  private String dnRownum;




  @Override
  public Map<String, Object> toParams() {
    return null;
  }
}
