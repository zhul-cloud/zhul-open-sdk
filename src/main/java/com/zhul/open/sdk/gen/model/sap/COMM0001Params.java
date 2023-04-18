package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.zhul.open.sdk.model.APIParams;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class COMM0001Params implements APIParams {

    List<Header> headers;

    @Data
    public static class Header {
        @JsonProperty(value = "BUSS_SYS")
        private String bussSys;
        @JsonProperty(value = "BUSS_DOC_TYPE")
        private String bussDocType;
        @JsonProperty(value = "BUSS_DOC_NO")
        private String bussDocNo;
        @JsonProperty(value = "UPDATE_MOD")
        private String updateMod;
        @JsonProperty(value = "PACK_DOC_NO")
        private String packDocNo;
        @JsonProperty(value = "CREATED_AT")
        private java.util.Date createdAt;
        @JsonProperty(value = "DOC_TYPE")
        private String docType;
        @JsonProperty(value = "COMP_CODE")
        private String compCode;
        @JsonProperty(value = "AC_DOC_NO")
        private String acDocNo;
        @JsonProperty(value = "FISC_YEAR")
        private String fiscYear;
        @JsonProperty(value = "DOC_DATE")
        private String docDate;
        @JsonProperty(value = "PSTNG_DATE")
        private String pstngDate;
        @JsonProperty(value = "TRANS_DATE")
        private String transDate;
        @JsonProperty(value = "HEADER_TXT")
        private String headerTxt;
        @JsonProperty(value = "REF_DOC_NO")
        private String refDocNo;
        @JsonProperty(value = "CURRENCY")
        private String currency;
        @JsonProperty(value = "EXCH_RATE")
        private java.math.BigDecimal exchRate;
        @JsonProperty(value = "CAN_DOC_NO")
        private String canDocNo;
        @JsonProperty(value = "REASON_REV")
        private String reasonRev;
        @JsonProperty(value = "CC_DOC_NO")
        private String ccDocNo;

        @JsonProperty(value = "ITEM")
        private List<Item> items;
    }

    @Data
    public static class Item {

        @JsonProperty(value = "PACK_DOC_NO")
        private String packDocNo;
        @JsonProperty(value = "PACK_DOC_ITEM")
        private String packDocItem;
        @JsonProperty(value = "POSTING_KEY")
        private String postingKey;
        @JsonProperty(value = "ACCOUNT_TYPE")
        private String accountType;
        @JsonProperty(value = "DR_CR_IND")
        private String drCrInd;
        @JsonProperty(value = "GL_ACCOUNT")
        private String glAccount;
        @JsonProperty(value = "CUSTOMER")
        private String customer;
        @JsonProperty(value = "VENDOR_NO")
        private String vendorNo;
        @JsonProperty(value = "SP_GL_IND")
        private String spGlInd;
        @JsonProperty(value = "COSTCENTER")
        private String costcenter;
        @JsonProperty(value = "PROFIT_CTR")
        private String profitCtr;
        @JsonProperty(value = "ALLOC_NMBR")
        private String allocNmbr;
        @JsonProperty(value = "REF_KEY_1")
        private String refKey1;
        @JsonProperty(value = "REF_KEY_2")
        private String refKey2;
        @JsonProperty(value = "REF_KEY_3")
        private String refKey3;
        @JsonProperty(value = "BUSS_TYPE")
        private String bussType;
        @JsonProperty(value = "CS_TRANS_T")
        private String csTransT;
        @JsonProperty(value = "COMP_CODE")
        private String compCode;
        @JsonProperty(value = "ORDERID")
        private String orderId;
        @JsonProperty(value = "LOC_CURR_AMT")
        private java.math.BigDecimal locCurrAmt;
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        @JsonProperty(value = "DOC_CURR_AMT")
        private java.math.BigDecimal docCurrAmt;
        @JsonProperty(value = "DISC_BASE")
        private java.math.BigDecimal discBase;
        @JsonProperty(value = "AMT_BASE")
        private java.math.BigDecimal amtBase;
        @JsonProperty(value = "DISC_AMT")
        private java.math.BigDecimal discAmt;
        @JsonProperty(value = "ITEM_TEXT")
        private String itemText;
        @JsonProperty(value = "ASSET_NO")
        private String assetNo;
        @JsonProperty(value = "SUB_NUMBER")
        private String subNumber;
        @JsonProperty(value = "TAX_CODE")
        private String taxCode;
        @JsonProperty(value = "SEGMENT")
        private String segment;
        @JsonProperty(value = "FUND")
        private String fund;
        @JsonProperty(value = "FUNDS_CTR")
        private String fundsCtr;
        @JsonProperty(value = "CMMT_ITEM")
        private String cmmtItem;
        @JsonProperty(value = "TRADE_ID")
        private String tradeId;
        @JsonProperty(value = "SETTLE_WAY")
        private String settleWay;
        @JsonProperty(value = "SUPPLIER_CODE")
        private String supplierCode;
        @JsonProperty(value = "CUSTOMER_CODE")
        private String customerCode;
        @JsonProperty(value = "BRANCH")
        private String branch;
        @JsonProperty(value = "ASSET_BUSS_TYPE")
        private String assetBussType;
        @JsonProperty(value = "NEG_POSTNG")
        private String negPostng;
        @JsonProperty(value = "ASVAL_DATE")
        private java.util.Date asvalDate;
        @JsonProperty(value = "VALUE_DATE")
        private java.util.Date valueDate;
        @JsonProperty(value = "PLANT")
        private String plant;
        @JsonProperty(value = "PYMT_METH")
        private String pymtMeth;
        @JsonProperty(value = "BLINE_DATE")
        private java.util.Date blineDate;
        @JsonProperty(value = "PMNTTRMS")
        private String pmnttrms;
        @JsonProperty(value = "PMNT_BLOCK")
        private String pmntBlock;
        @JsonProperty(value = "MATERIAL")
        private String material;
        @JsonProperty(value = "ORDER_ITNO")
        private String orderItno;
        @JsonProperty(value = "BUS_AREA")
        private String busArea;
        @JsonProperty(value = "FUNC_AREA")
        private String funcArea;
        @JsonProperty(value = "NETWORK")
        private String network;
        @JsonProperty(value = "WBS_ELEMENT")
        private String wbsElement;
        @JsonProperty(value = "CSHDIS_IND")
        private String cshdisInd;
        @JsonProperty(value = "COSTOBJECT")
        private String costobject;
        @JsonProperty(value = "ACTTYPE")
        private String acttype;
        @JsonProperty(value = "C_CTR_AREA")
        private String cctrArea;
        @JsonProperty(value = "PAYMT_REF")
        private String paymtRef;
        @JsonProperty(value = "VAT_REG_NO")
        private String vatRegNo;
        @JsonProperty(value = "RES_DOC")
        private String resDoc;
        @JsonProperty(value = "RES_ITEM")
        private String resItem;
        @JsonProperty(value = "PO_NUMBER")
        private String poNumber;
        @JsonProperty(value = "PO_ITEM")
        private String poItem;
        @JsonProperty(value = "MAT_DOC")
        private String matDoc;
        @JsonProperty(value = "MAT_DOC_YEAR")
        private String matDocYear;
        @JsonProperty(value = "MAT_DOC_ITEM")
        private String matDocItem;
        @JsonProperty(value = "INV_DOC_NO")
        private String invDocNo;
        @JsonProperty(value = "INV_DOC_YEAR")
        private String invDocYear;
        @JsonProperty(value = "INV_DOC_ITEM")
        private String invDocItem;
        @JsonProperty(value = "SO_NUMBER")
        private String soNumber;
        @JsonProperty(value = "SO_ITEM")
        private String soItem;
        @JsonProperty(value = "BILL_NUMBER")
        private String billNumber;
        @JsonProperty(value = "BILL_ITEM")
        private String billItem;
        @JsonProperty(value = "VB_DOC")
        private String vbDoc;
        @JsonProperty(value = "VB_DOC_ITEM")
        private String vbDocItem;


    }

    @Override
    public Map<String, Object> toParams() {
        Map map = Maps.newHashMap();
        map.put("ACCT", this.headers);
        return map;
    }
}
