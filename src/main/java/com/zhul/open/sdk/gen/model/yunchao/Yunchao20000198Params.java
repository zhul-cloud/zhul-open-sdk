package com.zhul.open.sdk.gen.model.yunchao;

import com.google.common.collect.Maps;
import com.zhul.open.sdk.model.APIParams;
import java.util.Map;
import lombok.Data;

/**
 * 物流库存
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class Yunchao20000198Params implements APIParams {

  private String queryMerchants;

  private String queryCode;

  private String queryVersion;

  private String dcId;

  private String productCode;

  public Yunchao20000198Params() {
    this("", "");
  }

  public Yunchao20000198Params(String dcId, String productCode) {
    this.queryMerchants = "200011";
    this.queryCode = "20000198";
    this.queryVersion = "1";
    this.dcId = dcId;
    this.productCode = productCode;
  }

  @Override
  public Map<String, Object> toParams() {
    Map<String, Object> maps = Maps.newHashMap();

    if (queryMerchants != null) {
      maps.put("queryMerchants", queryMerchants);
    }
    if (queryVersion != null) {
      maps.put("queryVersion", queryVersion);
    }
    if (dcId != null) {
      maps.put("dcId", dcId);
    }
    if (productCode != null) {
      maps.put("goodsId", productCode);
    }
    if (queryCode != null) {
      maps.put("queryCode", queryCode);
    }
    return maps;
  }
}
