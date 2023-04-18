package com.zhul.open.sdk.model;

import com.google.common.collect.Multimap;

/**
 * Created by yanglikai on 2019/5/23.
 */
public interface FileParams extends APIParams {
  Multimap<String, ByteWrapper> toFileParams();
}
