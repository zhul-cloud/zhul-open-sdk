package com.zhul.open.sdk.gen.model.yunchao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.Data;

/**
 * 物流库存
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class Yunchao20000198Result implements APIResult {
  private String code;

  private List<Item> data;

  @Data
  public static class Item {

    @JsonProperty(value = "dc_id")
    private String dcId;

    //库存数量
    @JsonProperty(value = "repertory ")
    private String repertory;

    //商品id
    @JsonProperty(value = "goods_id")
    private String goodsId;
  }
}
