package com.zhul.open.sdk.client.manager;


import com.zhul.open.sdk.client.auth.Simple;
import com.zhul.open.sdk.client.core.CaisxClient;
import com.zhul.open.sdk.client.core.DefaultCaisxClient;
import com.zhul.open.sdk.client.processor.YunchaoProcessor;
import com.zhul.open.sdk.exception.ApiException;
import com.zhul.open.sdk.gen.api.yunchao.Yunchao20000196;
import com.zhul.open.sdk.gen.api.yunchao.Yunchao20000197;
import com.zhul.open.sdk.gen.api.yunchao.Yunchao20000198;
import com.zhul.open.sdk.gen.model.yunchao.PurchaseRequestSendParams;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000196Params;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000196Result;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000197Params;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000197Result;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000198Params;
import com.zhul.open.sdk.gen.model.yunchao.Yunchao20000198Result;
import com.zhul.open.sdk.properties.YunchaoProperties;
import java.util.Objects;

/**
 * 云超接口管理 Created by yanglikai on 2019/5/23.
 */
public final class YunchaoApiManager {

  private YunchaoProperties properties;

  private YunchaoApiManager() {
  }

  public static YunchaoApiManager init() {
    return new YunchaoApiManager();
  }

  public YunchaoApiManager setup(YunchaoProperties target) {
    this.properties = target;
    return this;
  }

  /**
   * 移动平均价
   */
  public Yunchao20000196Result request(Yunchao20000196Params params) {
    Objects.requireNonNull(properties, "yunchao properties must be not null");

    Yunchao20000196 api = new Yunchao20000196(properties.getHost());
    api.setAPIParams(params);

    try (CaisxClient client = new DefaultCaisxClient(new Simple(), new YunchaoProcessor())) {
      return client.invoke(api);
    } catch (Exception ex) {
      throw new ApiException(ex.getMessage());
    }
  }

  /**
   * 门店库存
   */
  public Yunchao20000197Result request(Yunchao20000197Params params) {
    Objects.requireNonNull(properties, "yunchao properties must be not null");

    Yunchao20000197 api = new Yunchao20000197(properties.getHost());
    api.setAPIParams(params);

    try (CaisxClient client = new DefaultCaisxClient(new Simple(), new YunchaoProcessor())) {
      return client.invoke(api);
    } catch (Exception ex) {
      throw new ApiException(ex.getMessage());
    }
  }

  /**
   * 物流库存
   */
  public Yunchao20000198Result request(Yunchao20000198Params params) {
    Objects.requireNonNull(properties, "yunchao properties must be not null");

    Yunchao20000198 api = new Yunchao20000198(properties.getHost());
    api.setAPIParams(params);

    try (CaisxClient client = new DefaultCaisxClient(new Simple(), new YunchaoProcessor())) {
      return client.invoke(api);
    } catch (Exception ex) {
      throw new ApiException(ex.getMessage());
    }
  }

  /**
   * 采购申请单推送
   */
  public Yunchao20000198Result request(PurchaseRequestSendParams params) {
    Objects.requireNonNull(properties, "yunchao properties must be not null");

    PurchaseRequestSendParams api = new PurchaseRequestSendParams(properties.getHost());
    api.setHead(params.getHead());
    api.setItems(params.getItems());

    try (CaisxClient client = new DefaultCaisxClient(new Simple(), new YunchaoProcessor())) {
//      return client.invoke(api);
      return null;
    } catch (Exception ex) {
      throw new ApiException(ex.getMessage());
    }
  }
}
