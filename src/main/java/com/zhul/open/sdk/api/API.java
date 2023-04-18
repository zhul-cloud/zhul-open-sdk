package com.zhul.open.sdk.api;

import com.zhul.open.sdk.model.APIParams;
import java.util.Map;
import org.apache.http.entity.ContentType;

/**
 * Created by yanglikai on 2019/5/23.
 */
public interface API {
  String getHttpMethod();

  String getHttpUrl();

  String getVersion();

  String getName();

  APIParams getAPIParams();

  ContentType getContentType();

  Map<String, String> getHeaders();

  void setAPIParams(APIParams params);

  Class getResultModelClass();

  Class getParamModelClass();

  boolean hasFiles();
}
