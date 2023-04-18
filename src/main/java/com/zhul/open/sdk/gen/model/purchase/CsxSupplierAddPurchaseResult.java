package com.zhul.open.sdk.gen.model.purchase;

import lombok.Data;

/**
 * @Description 供应商扩大区返回结果
 * @Author caohuajin
 * @Date 2020/8/13 22:06
 */
@Data
public class CsxSupplierAddPurchaseResult {

  /** 更新信息 */
  private String msg;

  /** 供应商编码 */
  private String supplierCode;

  /** 更新状态 0失败 1成功 */
  private int updateStatus;
}
