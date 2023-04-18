package com.zhul.open.sdk.api;

import com.google.common.collect.Maps;
import com.zhul.open.sdk.model.APIParams;
import java.util.Map;
import org.apache.http.entity.ContentType;

/** Created by yanglikai on 2019/5/23. */
public abstract class AbstractAPI implements API {
  protected APIParams params;
  protected Map<String, String> headers;

  public AbstractAPI() {
    headers = Maps.newHashMap();
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public APIParams getAPIParams() {
    return params;
  }

  @Override
  public void setAPIParams(APIParams params) {
    this.params = params;
  }

  @Override
  public String getHttpUrl() {
    return null;
  }

  @Override
  public String getVersion() {
    return "1.0.0";
  }

  @Override
  public ContentType getContentType() {
    return null;
  }

  @Override
  public Map<String, String> getHeaders() {
    return headers;
  }

  @Override
  public boolean hasFiles() {
    return false;
  }
}
