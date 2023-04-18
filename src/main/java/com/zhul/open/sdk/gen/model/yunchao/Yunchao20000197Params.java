package com.zhul.open.sdk.gen.model.yunchao;

import com.google.common.collect.Maps;
import com.zhul.open.sdk.model.APIParams;
import lombok.Data;

import java.util.Map;

/**
 * 门店库存
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class Yunchao20000197Params implements APIParams {
  private String queryMerchants;

  private String queryCode;

  private String queryVersion;

  private String shopId;

  private String productCode;

  public Yunchao20000197Params() {
    this("", "");
  }

  public Yunchao20000197Params(String shopId, String productCode) {
    this.queryMerchants = "200011";
    this.queryCode = "20000197";
    this.queryVersion = "1";
    this.shopId = shopId;
    this.productCode = productCode;
  }

  @Override
  public Map<String, Object> toParams() {
    Map<String, Object> maps = Maps.newHashMap();
    if (queryCode != null) {
      maps.put("queryCode", queryCode);
    }
    if (queryMerchants != null) {
      maps.put("queryMerchants", queryMerchants);
    }
    if (queryVersion != null) {
      maps.put("queryVersion", queryVersion);
    }
    if (productCode != null) {
      maps.put("goodsId", productCode);
    }
    if (shopId != null) {
      maps.put("shopId", shopId);
    }

    return maps;
  }
}
