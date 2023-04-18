package com.zhul.open.sdk.gen.api.purchase;

import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.gen.model.purchase.CsxSupplierRecordParams;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.entity.ContentType;

/**
 * 供应商创建
 *
 * @author huangjinzhoun
 * @date 2020/2/10
 */
public class CsxSupplierRecord extends AbstractAPI {

  private final String host;

  public CsxSupplierRecord(String host) {
    if (StringUtils.isBlank(host)) {
      throw new IllegalArgumentException("host must be not null");
    }

    this.host = StringUtils.removeEnd(host, "/");
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
  public Class<CsxSupplierRecordParams> getParamModelClass() {
    return CsxSupplierRecordParams.class;
  }

  @Override
  public String getHttpUrl() {
    return host.concat("/openapi/csxSupplier/record");
  }
}
