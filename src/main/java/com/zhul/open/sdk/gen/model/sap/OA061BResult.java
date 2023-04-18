package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
@JacksonXmlRootElement(localName = "SHEET")
public class OA061BResult implements APIResult {

  @JacksonXmlProperty(localName = "client_code")
  private String clientCode;

  @JacksonXmlProperty(localName = "product_code")
  private String productCode;

  @JacksonXmlProperty(localName = "supplier_account")
  private String supplierAccount;

  @JacksonXmlProperty(localName = "purchase_org_code")
  private String purchaseOrgCode;

  @JacksonXmlProperty(localName = "purchase_group_code")
  private String purchaseGroupCode;

  @JacksonXmlProperty(localName = "tax_code")
  private String taxCode;

  @JacksonXmlProperty(localName = "purchase_price")
  private String purchasePrice;

  @JacksonXmlProperty(localName = "currency_code")
  private String currencyCode;

  @JacksonXmlProperty(localName = "price_unit")
  private String priceUnit;

  @JacksonXmlProperty(localName = "order_price_unit")
  private String orderPriceUnit;

  @JacksonXmlProperty(localName = "effective_price")
  private String effectivePrice;

  @JacksonXmlProperty(localName = "price_effect_date_control")
  private String priceEffectDateControl;

  @JacksonXmlProperty(localName = "one_time_product")
  private String oneTimeProduct;

  @JacksonXmlProperty(localName = "producter_code")
  private String producterCode;

  @JacksonXmlProperty(localName = "create_time")
  private String createTime;
}
