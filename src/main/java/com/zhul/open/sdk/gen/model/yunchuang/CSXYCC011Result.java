package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIResult;
import lombok.Getter;
import lombok.Setter;

/**
 * @author liutl
 * @date 2019/10/15 17:09
 */
@Getter
@Setter
public class CSXYCC011Result implements APIResult {

  /**
   * 门店编码
   */
  @JacksonXmlProperty(localName = "shopCode")
  private String shopCode;
  /**
   * 商品编码
   */
  @JacksonXmlProperty(localName = "productCode")
  private String productCode;
  /**
   * 商品状态
   */
  @JacksonXmlProperty(localName = "productStatus")
  private String productStatus;
  /**
   * 商品有效标识
   */
  @JacksonXmlProperty(localName = "validFlag")
  private String validFlag;
  /**
   * 物流模式
   */
  @JacksonXmlProperty(localName = "logistics")
  private String logistics;
  /**
   * 供应商编码
   */
  @JacksonXmlProperty(localName = "supplierCode")
  private String supplierCode;

}
