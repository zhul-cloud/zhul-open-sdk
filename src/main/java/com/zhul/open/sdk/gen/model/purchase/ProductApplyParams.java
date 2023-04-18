package com.zhul.open.sdk.gen.model.purchase;

import com.alibaba.fastjson.JSON;
import com.zhul.open.sdk.model.APIParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huangjinzhou
 * @date 2020/2/12
 */
@Data
public class ProductApplyParams implements APIParams {

  /** 头信息 */
  private Header header;

  @Override
  public Map<String, Object> toParams() {
    return JSON.parseObject(JSON.toJSONString(this));
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Header {

    /** 所有条目信息 */
    private Items items;

    /** 单据编号 */
    private String sheetid;

    /** 来源标识 */
    private String sourceSystem;

    /** 上传方式: C-创建，M-修改 */
    private String uploadWay;
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Items {

    /** 条目信息 */
    private List<Item> item;
  }

  @Data
  @Builder(toBuilder = true)
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Item {

    /** 国际商品编码的类别 (GTIN) */
    private String barcodeCategory;

    /** 条码类型 */
    private String barcodeType;

    /** 品牌 */
    private String brand;

    /** 商品类目 */
    private String category;

    /** 特性参数文件 */
    private String charaterFile;

    /** 色码 */
    private String colorCode;

    /** 针对商品的折扣类型 */
    private String discount;

    /** 文档号码(无文档管理系统) */
    private String documentNum;

    /** 国际文件号(GTIN) */
    private String ean13;

    /** 开始生效日期, 格式yyyy-MM-dd HH:mm:ss */
    private String effectDate;

    /** 评估类 */
    private String evaluationClass;

    /** 面料 */
    private String fabric;

    /** 处理标识 */
    private String flag;

    /** 高度 */
    private BigDecimal height;

    /** 行业领域 */
    private String industry;

    /** 长度 */
    private BigDecimal length;

    /** 货架寿命到期日的期间标识 */
    private String lifeFlag;

    /** 普通项目类别组 */
    private String normalGroup;

    /** 商品原产地国家 */
    private String originalPlace;

    /** 商品从税收分类 */
    private String outputTax;

    /** 板型 */
    private String pattern;

    /** 产地 */
    private String place;

    /** 价格带规格 */
    private String priceSpecs;

    /** 价格带类型 */
    private String pricelevelType;

    /** 商品类别 */
    private String productClass;

    /** 商品编码 */
    private String productCode;

    /** 商品描述 */
    private String productDesc;

    /** 产品组 */
    private String productGroup;

    /** 商品长名称 */
    private String productName;

    /** 商品描述（短文本） */
    private String productShortdesc;

    /** 商品类型 */
    private String productType;

    /** 采购组 */
    private String purchaseGroup;

    /** 商品采购级别 */
    private String purchaseLevel;

    /** 建议含税进价 */
    private BigDecimal purchasePrice;

    /** 必售商品 */
    private String saleProduct;

    /** 建议含税售价 */
    private BigDecimal salesPrice;

    /** 季节类别 */
    private String season;

    /** 序号 */
    private Integer serialNum;

    /** 保质期 */
    private Integer shelfLife;

    /** 装载组 */
    private String shippingGroup;

    /** 尺码 */
    private String size;

    /** 长度/宽度/高度的尺寸单位 */
    private String sizeUnit;

    /** 来源标识 */
    private String sourceSystem;

    /** 规格 */
    private String specs;

    /** 风格 */
    private String style;

    /** 商品税务编码 */
    private String taxCode;

    /** 温度条件标识 */
    private String temperature;

    /** 消息文本 */
    private String text;

    /** 运输组 */
    private String transportGroup;

    /** 基本计量单位 */
    private String unit;

    /** 宽度 */
    private BigDecimal width;

    /** 商品年份 */
    private Integer year;
  }
}
