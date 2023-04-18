package com.zhul.open.sdk.gen.api.purchase;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.purchase.ProductShopApplyParams;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.ContentType;

/**
 * 商品分档
 *
 * @author huangjinzhou
 * @date 2020/2/12
 */
public class ProductShopApply extends AbstractAPI {

  private final String productCenterHost;

  public ProductShopApply(String productCenterHost) {
    if (StringUtils.isBlank(productCenterHost)) {
      throw new IllegalArgumentException("product center host must be not blank");
    }

    this.productCenterHost = StringUtils.removeEnd(productCenterHost, "/");
  }

  @Override
  public String getHttpMethod() {
    return "POST";
  }

  @Override
  public ContentType getContentType() {
    return ContentType.APPLICATION_JSON;
  }

  @Override
  public Class<Void> getResultModelClass() {
    return Void.class;
  }

  @Override
  public Class<ProductShopApplyParams> getParamModelClass() {
    return ProductShopApplyParams.class;
  }

  @Override
  public String getHttpUrl() {
    return productCenterHost.concat("/openapi/csx/doShopApplyOrderDocking");
  }
}
