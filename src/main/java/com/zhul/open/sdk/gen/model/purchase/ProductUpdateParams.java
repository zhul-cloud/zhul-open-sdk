package com.zhul.open.sdk.gen.model.purchase;

import com.alibaba.fastjson.JSON;
import com.zhul.open.sdk.model.APIParams;
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
public class ProductUpdateParams implements APIParams {

  /** 商品修改申请信息 */
  private ProductDetailApplyOrder productDetailApplyOrder;

  /** 商品修改明细信息 */
  private List<ProductDetailCountryLevel> productDetailCountryLevels;

  @Override
  public Map<String, Object> toParams() {
    return JSON.parseObject(JSON.toJSONString(this));
  }

  @Data
  @Builder(toBuilder = true)
  @NoArgsConstructor
  @AllArgsConstructor
  public static class ProductDetailApplyOrder {

    /** 申请人姓名 */
    private String applyByName;

    /** 审批级别:1全国层级 2大区层级 3财务层级 */
    private String applyLevel;

    /** 申请单号 */
    private String applyOrderNo;

    /** 申请时间 */
    private Date applyTime;

    /** 审核人姓名 */
    private String auditByName;

    /** 审核时间 */
    private Date auditTime;

    /** 采购组编码集合（逗号分割） */
    private String purchaseGroupCode;

    /** 采购组织编码集合（逗号分割） */
    private String purchaseOrgCode;

    /** 备注 */
    private String remark;

    /** 部类编码 */
    private String rootCategoryCode;

    /** 标题 */
    private String title;


  }

  @Data
  @Builder(toBuilder = true)
  @NoArgsConstructor
  @AllArgsConstructor
  public static class ProductDetailCountryLevel {

    /** 申请单号 */
    private String applyOrderNo;

    /** 品牌编码 */
    private String brandCode;

    /** 商品编码 */
    private String productCode;

    /** 全国化商品名称 */
    private String productCountryName;

    /** 保质期 */
    private int qualityDays;

    /** 规格 */
    private String spec;

    /** 小类编码 */
    private String smallClassifyCode;

    /** 单位编码 */
    private String unitCode;
  }
}
