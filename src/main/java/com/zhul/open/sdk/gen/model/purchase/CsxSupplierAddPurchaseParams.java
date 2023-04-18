package com.zhul.open.sdk.gen.model.purchase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhul.open.sdk.model.APIParams;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @Description 供应商扩大区入参
 * @Author caohuajin
 * @Date 2020/8/13 21:55 
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CsxSupplierAddPurchaseParams implements APIParams {

  /** 扩采购组织编码 */
  private String addPurchaseCode;

  /**  参考采购组织编码 */
  private String refPurchaseCode;

  /** 供应商编号 */
  private String supplierCode;



  @Override
  public Map<String, Object> toParams() {
    return JSONObject.parseObject(JSON.toJSONString(this));
  }
}
