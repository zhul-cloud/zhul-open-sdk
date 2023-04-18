package com.zhul.open.sdk.gen.api.purchase;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.purchase.ProductApplyParams;
import com.zhul.open.sdk.gen.model.purchase.ProductApplyResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.ContentType;

/**
 * 商品新品申请
 *
 * @author huangjinzhou
 * @date 2020/2/12
 */
public class ProductApply extends AbstractAPI {

  private final String productCenterHost;

  public ProductApply(String productCenterHost) {
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
  public Class<ProductApplyResult> getResultModelClass() {
    return ProductApplyResult.class;
  }

  @Override
  public Class<ProductApplyParams> getParamModelClass() {
    return ProductApplyParams.class;
  }

  @Override
  public String getHttpUrl() {
    return productCenterHost.concat("/openapi/csx/doProductApplyOrderDocking");
  }
}
