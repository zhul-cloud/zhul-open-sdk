package com.zhul.open.sdk.properties;

import lombok.Data;

/**
 * @author huangjinzhou
 * @date 2020/2/6
 */
@Data
public class YhPurchasingProperties {

  /** 供应商管理地址 */
  private String supplierCenterHost;

  /** 商品管理地址 */
  private String productCenterHost;

  /** token 获取路径 */
  private String authUrl;

  private String secretId;

  private String secretKey;
}
