package com.zhul.open.sdk.api;


import com.zhul.open.sdk.model.APIParams;

/**
 * Created by yanglikai on 2019/5/23.
 */
public interface FtpAPI {

  void setAPIParams(APIParams params);

  boolean upload();
}
