package com.zhul.open.sdk.gen.model.purchase;

import com.alibaba.fastjson.JSON;
import com.zhul.open.sdk.model.APIParams;
import java.util.Date;
import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Data;

/**
 * @author huangjinzhou
 * @date 2020/2/11
 */
@Data
public class BrandManageParams implements APIParams {

  private List<BrandInfo> brandInfos;

  public BrandManageParams(List<BrandInfo> brandInfos) {
    this.brandInfos = brandInfos;
  }

  @Override
  public Map<String, Object> toParams() {
    return JSON.parseObject(JSON.toJSONString(this));
  }

  @Data
  @Builder
  public static class BrandInfo {

    /** 申请人工号 */
    private String applyById;

    /** 申请人姓名 */
    private String applyByName;

    /** 申请单号 */
    private String applyOrderNo;

    /** 申请时间 */
    private Date applyTime;

    /** 申请类型 */
    private Integer applyType;

    /** 审核人工号 */
    private String auditById;

    /** 审核人姓名 */
    private String auditByName;

    /** 审核时间 */
    private Date auditTime;

    /** 品牌层级 */
    private Integer brandLevel;

    /** 一级品牌编码 */
    private String firstBrandCode;

    /** 一级品牌名称 */
    private String firstBrandName;

    /** 录入人id */
    private String inputById;

    /** 录入人姓名 */
    private String inputByName;

    /** 录入人工号 */
    private String inputByNumber;

    /** 备注 */
    private String remarks;

    /** 二级品牌编码 */
    private String secondBrandCode;

    /** 二级品牌名称 */
    private String secondBrandName;
  }
}
