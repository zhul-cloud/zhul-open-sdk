package com.zhul.open.sdk.client.core;

import com.google.common.collect.Multimap;
import com.zhul.open.sdk.api.API;
import com.zhul.open.sdk.model.ByteWrapper;
import java.io.Closeable;
import java.util.Map;

/**
 * Created by yanglikai on 2019/5/23.
 */
public interface CaisxClient extends Closeable {
  <T> T invoke(API api);

  String execute(API api);

  String execute(String apiName, String apiVersion, String httpMethod, Map<String, Object> params, Multimap<String, ByteWrapper> fileParams);

  String getVersion();
}
