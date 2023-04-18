package com.zhul.open.sdk.gen.model.purchase;

import com.alibaba.fastjson.JSON;
import com.zhul.open.sdk.model.APIParams;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huangjinzhou
 * @date 2020/2/12
 */
@Data
public class ProductShopApplyParams implements APIParams {

  /*
   * shopApplyOrder :
   * {"applyById":"string","applyByName":"string","applyOrderNo":"string","applyTime":"2020-03-05T03:16:56.198Z","auditById":"string","auditByName":"string","auditTime":"2020-03-05T03:16:56.198Z","categoryCode":"string","inputById":"string","inputByName":"string","purchaseGroupCode":"string","purchaseOrgCode":"string","title":"string"}
   * shopApplyOrderDetails :
   * [{"applyById":"string","applyByName":"string","applyOrderNo":"string","applyTime":"2020-03-05T03:16:56.198Z","categoryCode":"string","categoryName":"string","detailShopRelations":[{"bizType":0,"logisticsModeCode":"1-直送,2-直通,3-配送","normalDeduction":"string","productCode":"string","projectBlockCode":"string","promotionalDeduction":"string","shopCode":"string"}],"inputById":"string","inputByName":"string","inputTaxCode":"string","productAttributeCode":"string","productCode":"string","purchaseOrgCode":"string","shopCode":"string","shopGroupCode":"string","supplierCode":"string","taxPurchasePrice":0,"taxSalePrice":0}]
   */

  /** 抬头信息 */
  private ShopApplyOrder shopApplyOrder;

  /** 明细信息 */
  private List<ShopApplyOrderDetail> shopApplyOrderDetails;

  @Override
  public Map<String, Object> toParams() {
    return JSON.parseObject(JSON.toJSONString(this));
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class ShopApplyOrder {
    /*
     * applyById : string applyByName : string applyOrderNo : string applyTime :
     * 2020-03-05T03:16:56.198Z auditById : string auditByName : string auditTime :
     * 2020-03-05T03:16:56.198Z categoryCode : string inputById : string inputByName : string
     * purchaseGroupCode : string purchaseOrgCode : string title : string
     */
    /** 申请人工号 */
    private String applyById;

    /** 申请人姓名 */
    private String applyByName;

    /** 申请单号 */
    private String applyOrderNo;

    /** 申请时间 */
    private Date applyTime;

    /** 审核人工号 */
    private String auditById;

    /** 审核人姓名 */
    private String auditByName;

    /** 审核时间 */
    private Date auditTime;

    /** 部类编码 */
    private String categoryCode;

    /** 录入人工号 */
    private String inputById;

    /** 录入人姓名 */
    private String inputByName;

    /** 采购组编码 */
    private String purchaseGroupCode;

    /** 采购组织编码 */
    private String purchaseOrgCode;

    /** 标题（用于存单据来源CX） */
    private String title;
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class ShopApplyOrderDetail {

    /*
     * applyById : string applyByName : string applyOrderNo : string applyTime :
     * 2020-03-05T03:16:56.198Z categoryCode : string categoryName : string detailShopRelations :
     * [{"bizType":0,"logisticsModeCode":"1-直送,2-直通,3-配送","normalDeduction":"string","productCode":"string","projectBlockCode":"string","promotionalDeduction":"string","shopCode":"string"}]
     * inputById : string inputByName : string inputTaxCode : string productAttributeCode : string
     * productCode : string purchaseOrgCode : string shopCode : string shopGroupCode : string
     * supplierCode : string taxPurchasePrice : 0 taxSalePrice : 0
     */

    /** 申请人工号 */
    private String applyById;

    /** 申请人姓名 */
    private String applyByName;

    /** 申请单号 */
    private String applyOrderNo;

    /** 申请时间 */
    private Date applyTime;

    /** 部类编码 */
    private String categoryCode;

    /** 部类名称 */
    private String categoryName;

    /** 录入人工号 */
    private String inputById;

    /** 录入人姓名 */
    private String inputByName;

    /** 进项税编码 */
    private String inputTaxCode;

    /** 商品编码 */
    private String productCode;

    /** 采购组织编码 */
    private String purchaseOrgCode;

    /** 商品属性编码 */
    private String productAttributeCode;

    /** 分档门店编码（多个，逗号分隔） */
    private String shopCode;

    /** 供应商编码 */
    private String supplierCode;

    /** 含税进价 */
    private BigDecimal taxPurchasePrice;

    /** 含税售价 */
    private BigDecimal taxSalePrice;

    /** 单店配置信息 */
    private List<DetailShopRelation> detailShopRelations;
  }

  @Data
  @Builder(toBuilder = true)
  @NoArgsConstructor
  @AllArgsConstructor
  public static class DetailShopRelation {
    /*
     * bizType : 0 logisticsModeCode : 1-直送,2-直通,3-配送 normalDeduction : string productCode : string
     * projectBlockCode : string promotionalDeduction : string shopCode : string
     */

    /** 经营方式 */
    private Integer bizType;

    /** 物流模式编码 */
    private String logisticsModeCode;

    /** 正常扣点 */
    private String normalDeduction;

    /** 商品编码 */
    private String productCode;

    /** 项目区块编码 */
    private String projectBlockCode;

    /** 促销扣点 */
    private String promotionalDeduction;

    /** 门店编码 */
    private String shopCode;
  }
}
