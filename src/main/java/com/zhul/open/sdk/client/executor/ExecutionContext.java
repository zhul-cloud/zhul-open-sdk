package com.zhul.open.sdk.client.executor;

import com.google.common.collect.Multimap;
import com.zhul.open.sdk.api.API;
import com.zhul.open.sdk.model.ByteWrapper;
import java.util.Map;
import org.apache.http.entity.ContentType;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class ExecutionContext {
  private API api;
  private String url;
  private Map<String, Object> params;
  private Multimap<String, ByteWrapper> fileParams;
  private ContentType contentType;

  public ExecutionContext() {
  }

  public API getApi() {
    return api;
  }

  public void setApi(API api) {
    this.api = api;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }

  public Multimap<String, ByteWrapper> getFileParams() {
    return fileParams;
  }

  public void setFileParams(Multimap<String, ByteWrapper> fileParams) {
    this.fileParams = fileParams;
  }

  public ContentType getContentType() {
    return contentType;
  }

  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }
}
