package com.zhul.open.sdk.gen.model.huichuang;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zhul.open.sdk.model.APIParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class SMS1015Params implements APIParams {

  @JsonProperty(value = "item")
  private List<Item> items;

  @Data
  public static class Item {
    @JsonProperty(value = "shopcode")
    private String shopCode;             // 供应地点
    @JsonProperty(value = "skucode")
    private String skuCode;              // 商品
    @JsonProperty(value = "deliverylocationcode")
    private String deliveryLocationCode; // 客户地点
  }

  @Override
  public Map<String, Object> toParams() {
    Map<String, Object> maps = new HashMap<>();

    maps.put("item", items);

    return maps;
  }
}
