package com.zhul.open.sdk.gen.model.huichuang;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zhul.open.sdk.model.APIResult;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * Created by yanglikai on 2019/4/30.
 */
@Data
public class SMS1015Result implements APIResult {

  @JsonProperty(value = "item")
  private List<Item> items;

  @Data
  public static class Item implements Serializable {

    @JsonProperty(value = "shopcode")
    private String shopcode;

    @JsonProperty(value = "skucode")
    private String skuCode;

    @JsonProperty(value = "deliverylocationcode")
    private String deliveryLocationCode;

    /**
     * 1.商品可订
     * 2.商品不可订
     * 3.供货关系不存在
     * 4.商品不可订&供货关系不存在
     * 5.地点商品不存在
     * 6.商品不存在
     * 7.没有获取到商品部类
     * 8.部类为12，13时供货DC不能为空
     * 9.地点为空
     * 10.商品为空
     * 11.参数为空
     * 12.供货关系存在但是商品不可订
     */
    @JsonProperty(value = "status")
    private String status;

    @JsonProperty(value = "description")
    private String desc;
  }
}
