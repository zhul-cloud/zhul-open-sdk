package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author liulong
 * @className CSCM1001Result
 * @description
 * @date 2019/8/20 17:14
 **/
@Data
@JacksonXmlRootElement(localName = "sheet")
public class CSCM1001Result implements APIResult {

    @JacksonXmlProperty(localName = "header")
    private Header header;

    @JacksonXmlProperty(localName = "item")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Item> item;

    public CSCM1001Result() {
    }

    @Data
    public static class Header{
        public Header() {
        }

        @JacksonXmlProperty(localName = "refund_out_no")
        private String refundOutNo;
        @JacksonXmlProperty(localName = "out_no")
        private String outNo;
        @JacksonXmlProperty(localName = "refund_no")
        private String refundNo;
        @JacksonXmlProperty(localName = "supplier_code")
        private String supplierCode;
        @JacksonXmlProperty(localName = "shop_code")
        private String shopCode;
        @JacksonXmlProperty(localName = "refund_date")
        private String refundDate;
        @JacksonXmlProperty(localName = "remarks")
        private String remarks;
    }

    @Data
    public static class Item{
        public Item() {
        }

        @JacksonXmlProperty(localName = "item_no")
        private String itemNo;
        @JacksonXmlProperty(localName = "product_code")
        private String productCode;
        @JacksonXmlProperty(localName = "retund_qty")
        private BigDecimal retundQty;
        @JacksonXmlProperty(localName = "refund_reason")
        private String refundReason;
        @JacksonXmlProperty(localName = "message")
        private String message;
        @JacksonXmlProperty(localName = "remark")
        private String remark;
    }
}
