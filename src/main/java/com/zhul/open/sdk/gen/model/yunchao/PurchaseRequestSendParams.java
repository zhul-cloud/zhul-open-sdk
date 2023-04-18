package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author liutl
 * @date 2019/7/30 14:49
 * 对应接口编码：YCSMS1001
 * 名称：采购申请下传
 * 内容：彩食鲜供应链采购申请下传供零在线
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PurchaseRequestSendParams implements APIParams {


  private Head head;

  private List<Item> items;

  private String host;

  public PurchaseRequestSendParams(String host) {
    this.host = host;
  }

  @Override
  public Map<String, Object> toParams() {
    return null;
  }


  @Data
  public static class Head {

    /**
     * 部类 是否必填：是
     */
    private String catetoryCode;

    /**
     * 采购组织编码（收货地点对应采购组织编码） 是否必填：是
     */
    private String poOrgCode;
    /**
     * 发货DC 是否必填：是
     */
    private String deliverAddressCode;

    /**
     * 申请时间 是否必填：是
     */
    private String applyTime;

    /**
     * 申请人 是否必填：是
     */
    private String createdBy;

    /**
     * 采购申请单号 是否必填：是
     */
    private String applyId;

    /**
     * 结算地点 是否必填：是
     */
    private String settleAddressCode;
    /**
     * 收货地点 是否必填：是
     */
    private String addressCode;

    /**
     * 整单备注 是否必填：否
     */
    private String remark;
    /**
     * 地点类型（仓库、永辉生活店、超级物种店） 是否必填：是
     */
    private String addressType;

    /**
     * 销售订单类型 是否必填：是
     */
    private String sellType;
    /**
     * 申请单类型 是否必填：是
     */
    private String orderType;

    /**
     * 订货方式 是否必填：是
     */
    private String orderMode;

    /**
     * 加配类型 是否必填：是
     */
    private String additionType;

    /**
     * 销售大区 是否必填：配送模式，可以没有
     */
    private String region;

    /**
     * 优先DC 是否必填：否
     */
    private String firstDc;

    /**
     * 货源模式 是否必填：是
     */
    private String sourceType;

    /**
     * 末级DC 是否必填：是
     */
    private String lastDc;

    /**
     * 物流模式 是否必填：是
     */
    private String logistics;

    /**
     * 渠道标记 是否必填：是
     */
    private String channel;

    /**
     * 账面直通标记 是否必填：是
     */
    private String directAccFlag;

  }

  @Data
  public static class Item {

    /**
     * 行项目号
     * 是否必填：是
     */
    private String rownum;
    /**
     * 安全排面量
     * 是否必填：是
     */
    private String safetyInvertory;
    /**
     * 正常DMS
     * 是否必填：是
     */
    private String normalDms;
    /**
     * 促销DMS
     * 是否必填：是
     */
    private String promotionDms;
    /**
     * 商品编码
     * 是否必填：是
     */
    private String goodsId;
    /**
     * 申请行备注
     * 是否必填：是
     */
    private String remark;
    /**
     * 申请数量
     * 是否必填：是
     */
    private String quantity;
    /**
     * 采购申请单号
     * 是否必填：是
     */
    private String applyId;
    /**
     * 条件类型
     * 是否必填：是
     */
    private String conditionType;
    /**
     * 开票金额（行含税金额）
     * 是否必填：是
     */
    private String amount;
    /**
     *  库存地点（小店）
     * 是否必填：是
     */
    private String inventoryAddressCode;

    /**
     * 单位 是否必填：是
     */
    private String unit;


    /**
     * 配送方式 是否必填： 配送模式-可以没有
     */
    private String dispatchType;

    /**
     * 小包装件装数 是否必填： 配送模式-可以没有
     */
    private String minPack;

    /**
     * 大包装件装数 是否必填：配送模式-可以没有
     */
    private String maxPack;
    /**
     * 最小订货量 是否必填：配送模式-可以没有
     */
    private String minOrderQty;
    /**
     * 进价（含税） 是否必填：否
     */
    private String price;


    /**
     * 合计金额（含税） 是否必填：否
     */
    private String totalAmount;

    /**
     * 商品状态 是否必填：配送模式- 可以没有
     */
    private String skuStatus;


    /**
     * 采购组 是否必填:否
     */
    private String poGroup;


    /**
     * 有效标识 是否必填：配送模式- 可以没有
     */
    private String validFlag;


    /**
     * 小类 是否必填：是
     */
    private String minCategory;


    /**
     * 免费项目 是否必填：否
     */
    private String freeFlag;


    /**
     * 供应商或债权人的帐号 是否必填：否
     */
    private String supplierCode;


    /**
     * 供应商起订金额 是否必填：配送模式-可以没有
     */
    private String supplierAmount;


    /**
     * 交货日期 是否必填 ：是
     */
    private String planTime;





  }


}
