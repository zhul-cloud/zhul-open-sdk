package com.zhul.open.sdk.gen.api.purchase;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.purchase.ProductUpdateParams;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.ContentType;

/**
 * 商品更新
 *
 * @author huangjinzhou
 * @date 2020/2/12
 */
public class ProductUpdate extends AbstractAPI {

  private final String productCenterHost;

  public ProductUpdate(String productCenterHost) {
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
  public Class<ProductUpdateParams> getParamModelClass() {
    return ProductUpdateParams.class;
  }

  @Override
  public String getHttpUrl() {
    return productCenterHost.concat("/openapi/csx/doProductUpdateDocking");
  }
}
