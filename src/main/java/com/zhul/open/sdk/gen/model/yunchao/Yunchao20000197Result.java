package com.zhul.open.sdk.gen.model.yunchao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * 门店库存
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class Yunchao20000197Result implements APIResult {
  private String code;

  private List<Yunchao20000197Result.Item> data;

  @Data
  public static class Item {

    @JsonProperty(value = "shop_id")
    private String shopId;

    @JsonProperty(value = "goods_id")
    private String goodsId;

    @JsonProperty(value = "storage")
    private String storage;

    @JsonProperty(value = "repertory")
    private String repertory;
  }
}
