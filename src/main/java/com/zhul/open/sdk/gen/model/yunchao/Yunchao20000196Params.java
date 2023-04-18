package com.zhul.open.sdk.gen.model.yunchao;

import com.google.common.collect.Maps;
import com.zhul.open.sdk.model.APIParams;
import java.util.Map;
import lombok.Data;

/**
 * 多门店商品移动平均价
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class Yunchao20000196Params implements APIParams {

  private String queryMerchants;

  private String queryCode;

  private String queryVersion;

  private String shopId;

  private String productCode;

  public Yunchao20000196Params() {
    this("", "");
  }

  public Yunchao20000196Params(String shopId, String productCode) {
    this.queryMerchants = "200011";
    this.queryCode = "20000196";
    this.queryVersion = "1";
    this.shopId = shopId;
    this.productCode = productCode;
  }

  @Override
  public Map<String, Object> toParams() {
    Map<String, Object> maps = Maps.newHashMap();
    if (queryMerchants != null) {
      maps.put("queryMerchants", queryMerchants);
    }
    if (queryCode != null) {
      maps.put("queryCode", queryCode);
    }
    if (queryVersion != null) {
      maps.put("queryVersion", queryVersion);
    }
    if (shopId != null) {
      maps.put("shopId", shopId);
    }
    if (productCode != null) {
      maps.put("goodsId", productCode);
    }

    return maps;
  }
}
