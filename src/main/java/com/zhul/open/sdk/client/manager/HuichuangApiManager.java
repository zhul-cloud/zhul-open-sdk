package com.zhul.open.sdk.client.manager;


import com.zhul.open.sdk.client.auth.Json;
import com.zhul.open.sdk.client.core.CaisxClient;
import com.zhul.open.sdk.client.core.DefaultCaisxClient;
import com.zhul.open.sdk.client.processor.HuichuangProcessor;
import com.zhul.open.sdk.exception.ApiException;
import com.zhul.open.sdk.gen.api.huichuang.SMS1015;
import com.zhul.open.sdk.gen.model.huichuang.SMS1015Params;
import com.zhul.open.sdk.gen.model.huichuang.SMS1015Result;
import com.zhul.open.sdk.properties.HuichuangProperties;
import java.util.Objects;

/**
 * 辉创接口管理
 * Created by yanglikai on 2019/5/23.
 */
public final class HuichuangApiManager {

  private HuichuangProperties properties;

  private HuichuangApiManager() {
  }

  public static HuichuangApiManager init() {
    return new HuichuangApiManager();
  }

  public HuichuangApiManager setup(HuichuangProperties target) {
    this.properties = target;
    return this;
  }

  public SMS1015Result request(SMS1015Params params) {
    Objects.requireNonNull(properties, "huichuang properties must be not null");

    SMS1015 sms1015 = new SMS1015(properties.getHost());
    sms1015.setAPIParams(params);

    try (CaisxClient client = new DefaultCaisxClient(new Json(), new HuichuangProcessor())) {
      return client.invoke(sms1015);
    } catch (Exception ex) {
      throw new ApiException(ex.getMessage());
    }
  }
}
