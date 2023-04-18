package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIParams;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * @author liutl
 * @date 2019/8/2 11:02
 * 对应接口编码：YCSMS1005
 * 名称：彩食鲜退货订单下传
 * 描述：食鲜供应链采购退货/申偿订单下传SAP
 */
@Data
public class RefundOrderSendParams  implements APIParams {

  private Header header;

  private List<Item> items;

  @Override
  public Map<String, Object> toParams() {
    return null;
  }

  @Data
  public static class Header {

    //采购申请单号
    private String applyId;

    //发货地点编码（地点供应商对应的发货地点）
    private String deliverAddressCode;

    //收货地点（9D43）
    private String addressCode;

    //库存地点
    private String inventoryAddress;

    //销售订单类型
    private String sellType;

    //计划交货时间
    private String planTime;

    //申请单审批时间
    private String approveAt;

    //采购订单类型
    private String orderType;

    //原单号（原采购订单号）
    private String origApplyId;

    //YHWMS出库单号
    private String obdNo;

    //备注
    private String remark;

    //备用字段
    private String field1;

    //备用字段
    private String field2;

  }

  @Data
  public static class Item {

    //行项目号
    private String rownum;



    //商品编码
    private String goodsId;


    //单据数量
    private String quantity;



    //申请备注
    private String remark;


    //单位
    private String unitName;

    //采购申请单号
    private String applyId;

    //条件类型
    private String priceType;

    //单价（含税）
    private String price;

    //库存地点
    private String inventoryAddress;

    //退货原因
    private String returnReason;

    //备用字段
    private String field1;

    //备用字段
    private String field2;


  }
}
