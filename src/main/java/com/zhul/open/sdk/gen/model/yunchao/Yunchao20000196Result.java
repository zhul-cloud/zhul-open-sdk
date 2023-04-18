package com.zhul.open.sdk.gen.model.yunchao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * 多门店商品移动平均价
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class Yunchao20000196Result implements APIResult {

  private String code;

  private List<Yunchao20000196Result.Item> data;

  @Data
  public static class Item {

    @JsonProperty(value = "shop_id")
    private String shopId;

    @JsonProperty(value = "moving_average_price")
    private String movingAveragePrice;

    @JsonProperty(value = "goods_id")
    private String goodsId;
  }
}
