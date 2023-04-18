package com.zhul.open.sdk.gen.api.purchase;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.purchase.BrandManageParams;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.ContentType;

/**
 * 品牌新增、修改
 *
 * @author huangjinzhou
 * @date 2020/2/12
 */
public class BrandManage extends AbstractAPI {

  private String productCenterHost;

  public BrandManage(String productCenterHost) {
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
  public Class<ArrayList> getResultModelClass() {
    return ArrayList.class;
  }

  @Override
  public Class<BrandManageParams> getParamModelClass() {
    return BrandManageParams.class;
  }

  @Override
  public String getHttpUrl() {
    return productCenterHost.concat("/openapi/csx/doBrandDocking");
  }
}
