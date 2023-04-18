package com.zhul.open.sdk.gen.model.purchase;

import lombok.Data;

/**
 * @author huangjinzhou
 * @date 2020/4/23 16:04
 */
@Data
public class CsxSupplierUpdateResult {

  /** 更新信息 */
  private String msg;

  /** 供应商编码 */
  private String supplierCode;

  /** 更新状态 0失败 1成功 */
  private int updateStatus;
}
