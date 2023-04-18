package com.zhul.open.sdk.client.manager;


import com.zhul.open.sdk.client.auth.Json;
import com.zhul.open.sdk.client.core.CaisxClient;
import com.zhul.open.sdk.client.core.DefaultCaisxClient;
import com.zhul.open.sdk.client.processor.YunchuangProcessor;
import com.zhul.open.sdk.exception.ApiException;
import com.zhul.open.sdk.gen.api.yunchuang.SalesOrderAPI;
import com.zhul.open.sdk.gen.model.yunchuang.SalesOrderParams;
import com.zhul.open.sdk.gen.model.yunchuang.SalesOrderResult;
import com.zhul.open.sdk.properties.YunchuangProperties;
import java.util.Objects;

/**
 * 云创销售单据接口管理
 * Created by dinglj on 2019/10/23
 */
public final class YunchuangApiManager {

  private YunchuangProperties properties;

  private YunchuangApiManager() {
  }

  public static YunchuangApiManager init() {
    return new YunchuangApiManager();
  }

  public YunchuangApiManager setup(YunchuangProperties target) {
    this.properties = target;
    return this;
  }

  public SalesOrderResult request(SalesOrderParams params) {
    Objects.requireNonNull(properties, "yunchuang properties must be not null");

    SalesOrderAPI salesOrderAPI = new SalesOrderAPI(properties.getHost());
    salesOrderAPI.setAPIParams(params);

    try (CaisxClient client = new DefaultCaisxClient(new Json(), new YunchuangProcessor())) {
      return client.invoke(salesOrderAPI);
    } catch (Exception ex) {
      throw new ApiException(ex.getMessage());
    }
  }
}
