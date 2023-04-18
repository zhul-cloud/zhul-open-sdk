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
 * @date 2020/4/23 16:07
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CsxSupplierUpdateParams implements APIParams {

  /** 银行账户号码 */
  private String bankAccountCode;

  /** 银行账户名 */
  private String bankAccountName;

  /** 联行号 */
  private String bankCode;

  /** 发票地址 */
  private String invoiceAddr;

  /** 发票抬头 */
  private String invoiceTitle;

  /** 主税码 */
  private String mainRate;

  /** 采购组织编码 */
  private String purchaseOrgCode;

  /** 供应商编码 */
  private String supplierCode;

  /** 供应商名称 */
  private String venderName;

  @Override
  public Map<String, Object> toParams() {
    return JSONObject.parseObject(JSON.toJSONString(this));
  }
}
