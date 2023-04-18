package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.zhul.open.sdk.model.APIParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class B2B1001Params implements APIParams {
  @JsonProperty(value = "HEADER")
  private OrderHeader orderHeader;

  @JsonProperty(value = "ITEM")
  private List<OrderItem> items;

  @Data
  public static class OrderHeader {
    @JsonProperty(value = "CHECK_NO")
    private String checkNo;//支票号

    @JsonProperty(value = "CONS_ADDR")
    private String consAddr;//收货人地址

    @JsonProperty(value = "CONS_TEL")
    private String consTel;//收货人电话

    @JsonProperty(value = "CREATE_TIME")
    private String createTime;//订单提交时间

    @JsonProperty(value = "CUS_NAME")
    private String cusName;//客户名称

    @JsonProperty(value = "DCID")
    private String dcid;//门店

    @JsonProperty(value = "DIS_CHAN")
    private String disChan;//分销渠道

    @JsonProperty(value = "DN_CODE")
    private String dnCode;//原DN单号

    @JsonProperty(value = "END_TIME")
    private String endTime;//交货结束时间

    @JsonProperty(value = "NOTE")
    private String note;//备注

    @JsonProperty(value = "ORDER_CODE")
    private String orderCode;//B2B网站订单号

    @JsonProperty(value = "ORDER_TYPE")
    private String orderType;//订单类型

    @JsonProperty(value = "PRO_ORDER_TYPE")
    private String proOrderType;//采购订单类型

    @JsonProperty(value = "RETURN_REASON")
    private String returnReason;//退货原因

    @JsonProperty(value = "SALE_CUS_CODE")
    private String saleCusCode;//售达方客户编码

    @JsonProperty(value = "SALE_DATE")
    private String saleDate;//销售日期

    @JsonProperty(value = "SALE_OFFICE")
    private String saleOffice;//销售办公室

    @JsonProperty(value = "SALE_ORGANIZATION")
    private String saleOrganization;//销售组织

    @JsonProperty(value = "SEND_CUS_CODE")
    private String sendCusCode;//送达方客户编码

    @JsonProperty(value = "SEND_DATE")
    private String sendDate;//发货日期

    @JsonProperty(value = "SO_CODE")
    private String soCode;//原SO单号

    @JsonProperty(value = "STAR_TIME")
    private String starTime;//交货开始时间
  }

  @Data
  public static class OrderItem {
    @JsonProperty(value = "COMB_CODE")
    private String combCode;//组合码

    @JsonProperty(value = "COMB_CODE_DES")
    private String combCodeDes;//组合码描述

    @JsonProperty(value = "COMB_CODE_NUM")
    private BigDecimal combCodeNum;//组合码数量

    @JsonProperty(value = "GOOD_CODE")
    private String goodCode;//商品编码

    @JsonProperty(value = "CONDITION_TYPE")
    private String conditionType;//???

    @JsonProperty(value = "GOOD_NUMBER")
    private BigDecimal goodNumber;//数量

    @JsonProperty(value = "INVENTORY")
    private String inventory = "";//库存地

    @JsonProperty(value = "ORDER_LINE")
    private Integer orderLine;//行项目号

    @JsonProperty(value = "PROM_NO")
    private String promNo;//促销号码

    @JsonProperty(value = "PROM_PRICE")
    private BigDecimal promPrice;//促销价

    @JsonProperty(value = "TICKET_AMOUNT")
    private Double ticketAmount;//开票金额
  }

  @Override
  public Map<String, Object> toParams() {
    Map map = Maps.newHashMap();
    map.put("SHEET", this);
    return map;
  }
}
