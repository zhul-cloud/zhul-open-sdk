package com.zhul.open.sdk.gen.model.purchase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhul.open.sdk.model.APIParams;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huangjinzhou
 * @date 2020/2/10
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CsxSupplierRecordParams implements APIParams {
  /** 供应商账户组编码 */
  private String accountGroupCode;

  /** 虚拟编码规则定义：CSX+年份后2位+ 10位顺序号，例如：CSX200000000001 */
  private String b2bSheetId;

  /** 银行账户号码 */
  private String bankAccountCode;

  /** 银行账户名 */
  private String bankAccountName;

  /** 联行号 */
  private String bankCode;

  /** 经营范围 */
  private String brandRange;

  /** 采购级别编码 */
  private String buyLevelCode;

  /** 采购级别名称 */
  private String buyLevelName;

  /** 公司编码 */
  private String companyCode;

  /** 公司名称 */
  private String companyName;

  /** 法人代表 */
  private String corporateRep;

  /** 公司地址 */
  private String cpyAddr;

  /** 公司电话 */
  private String cpyTel;

  /** 企业类型编码 */
  private String cpyTypeCode;

  /** 企业类型名称 */
  private String cpyTypeName;

  /** 信控率 */
  private String creditControlRate;

  /** 联系人 */
  private String ctsName;

  /** 联系人电话 */
  private String ctsTel;

  /** 有效天数 */
  private int effectiveDay;

  /** 联系人邮箱 */
  private String email;

  /** 传真 */
  private String fax;

  /** 固定信控额度 */
  private String fixCreditQuota;

  /** 生鲜供应商标签编码 */
  private String freshSupplierLabelCode;

  /** 生鲜供应商标签名称 */
  private String freshSupplierLabelName;

  /** 父子标志 有父供应商2 无父供应商0 */
  private Integer idTypeCode;

  /** 订货周期 */
  private Integer indate;

  /** 行业编码 */
  private String industryCode;

  /** 行业名称 */
  private String industryName;

  /** 发票地址 */
  private String invoiceAddr;

  /** 发票抬头 */
  private String invoiceTitle;

  /** 是否联营 是=3联营 否=0不联营 */
  private Integer isAssociate;

  /** 是否签订合同 0没有 1有 */
  private Integer isContract;

  /** 是否补差 */
  private Integer isDeficiency;

  /** 是否直供 */
  private Integer isDirectSupply;

  /** 是否促销扣款 */
  private Integer isPromotionDeduct;

  /** 是否供应商自产自销免税备案 */
  private Integer isTaxFree;

  /** 结算地点编码 */
  private String locationCode;

  /** 结算地点名称 */
  private String locationName;

  /** 主税码 */
  private String mainRate;

  /** 管理者 */
  private String manager;

  /** 起订金额 */
  private String minimumAmount;

  /** 出单方式 */
  private Integer orderMode;

  /** 机构代码证 */
  private String orgCodeCret;

  /** 父供应商编号 */
  private String parentVenderCode;

  /** 支付方式编码 */
  private String payMethodCode;

  /** 支付方式名称 */
  private String payMethodName;

  /** 付款条件编码 */
  private String payTermCode;

  /** 付款条件名称 */
  private String payTermName;

  /** 邮政编码 */
  private String postCode;

  /** 供应商定价组编码 */
  private String priceGroupCode;

  /** 供应商定价组名称 */
  private String priceGroupName;

  /** 大区编码 */
  private String purchaseOrgCode;

  /** 大区名称 */
  private String purchaseOrgName;

  /** 统驭科目 */
  private String reconAccountCode;

  /** 对账日编码 */
  private String reconSignCode;

  /** 对账日名称 */
  private String reconSignName;

  /** 注册资本（万元） */
  private Integer rstCapital;

  /** 经营类别采购组编码 */
  private String saleCatgCodes;

  /** 经营类别采购组名称 */
  private String saleCatgNames;

  /** 结算DC编码 */
  private String settlDcCode;

  /** 结算标识编码 */
  private String settlSignCode;

  /** 结算标识名称 */
  private String settlSignName;

  /** 签约采购 */
  private String signedPurchase;

  /** 供应商编码 */
  private String supplierCode;

  /** 统一社会信用代码 */
  private String taxId;

  /** 纳税级别编码 */
  private Integer taxTypeCode;

  /** 纳税级别名称 */
  private String taxTypeName;

  /** 临时供应商ID */
  private String tempVenderId;

  /** 供应商市编码 */
  private String venderCityCode;

  /** 供应商市名称 */
  private String venderCityName;

  /** 供应商名称 */
  private String venderName;

  /** 供应商省编码 */
  private String venderProvinceCode;

  /** 供应商省名称 */
  private String venderProvinceName;

  /** 供应商类别 */
  private Integer venderTypeCode;

  @Override
  public Map<String, Object> toParams() {
    return JSONObject.parseObject(JSON.toJSONString(this));
  }
}
