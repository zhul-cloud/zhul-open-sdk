package com.zhul.open.sdk.client.manager;

import com.zhul.open.sdk.client.auth.Simple;
import com.zhul.open.sdk.client.core.CaisxClient;
import com.zhul.open.sdk.client.core.DefaultCaisxClient;
import com.zhul.open.sdk.client.processor.KdniaoNormalPostProcessor;
import com.zhul.open.sdk.gen.api.kdn.Kdniao1002;
import com.zhul.open.sdk.gen.api.kdn.Kdniao1007;
import com.zhul.open.sdk.gen.api.kdn.Kdniao1008;
import com.zhul.open.sdk.gen.api.kdn.Kdniao8001;
import com.zhul.open.sdk.gen.api.kdn.Kdniao8008;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1002Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1002Result;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1007Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1007Result;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1008Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao1008Result;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8001Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8001Result;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8008Params;
import com.zhul.open.sdk.gen.model.kdn.Kdniao8008Result;

/**
 * 快递鸟接口
 * Created by yanglikai on 2019/3/20.
 */
public final class KdniaoAPIManager {
  private KdniaoAPIManager() {
  }

  /**
   * 即时查询
   *
   * @param params
   * @return
   */
  public static Kdniao1002Result kdn1002(Kdniao1002Params params) {
    Kdniao1002 api = new Kdniao1002();
    api.setAPIParams(params);

    CaisxClient client =
        new DefaultCaisxClient(
            new Simple(),
            new KdniaoNormalPostProcessor());

    return client.invoke(api);
  }

  /***
   * 电子面单
   *
   * @param params
   * @return
   */
  public static Kdniao1007Result kdn1007(Kdniao1007Params params) {
    Kdniao1007 api = new Kdniao1007();
    api.setAPIParams(params);

    CaisxClient client =
        new DefaultCaisxClient(
            new Simple(),
            new KdniaoNormalPostProcessor());

    return client.invoke(api);
  }

  /**
   * 轨迹订阅
   *
   * @param params
   * @return
   */
  public static Kdniao1008Result kdn1008(Kdniao1008Params params) {
    Kdniao1008 api = new Kdniao1008();
    api.setAPIParams(params);

    CaisxClient client =
        new DefaultCaisxClient(
            new Simple(),
            new KdniaoNormalPostProcessor());

    return client.invoke(api);
  }

  /**
   * 即时查询(增值版)
   *
   * @param params
   * @return
   */
  public static Kdniao8001Result kdn8001(Kdniao8001Params params) {
    Kdniao8001 api = new Kdniao8001();
    api.setAPIParams(params);

    CaisxClient client =
        new DefaultCaisxClient(
            new Simple(),
            new KdniaoNormalPostProcessor());

    return client.invoke(api);
  }

  /**
   * 轨迹订阅(增值版)
   *
   * @param params
   * @return
   */
  public static Kdniao8008Result kdn8008(Kdniao8008Params params) {
    Kdniao8008 api = new Kdniao8008();
    api.setAPIParams(params);

    CaisxClient client =
        new DefaultCaisxClient(
            new Simple(),
            new KdniaoNormalPostProcessor());

    return client.invoke(api);
  }
}
