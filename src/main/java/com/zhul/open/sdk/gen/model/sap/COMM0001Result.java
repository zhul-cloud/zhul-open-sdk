package com.zhul.open.sdk.gen.model.sap;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.zhul.open.sdk.model.APIResult;
import lombok.Data;

import java.util.List;

@Data
public class COMM0001Result implements APIResult {

    @JsonProperty(value = "ITEM")
    private List<Item> items;
    @Data
    public static class Item {

        @JsonProperty(value = "TYPE")
        private String type;
        @JsonProperty(value = "ID")
        private String id;
        @JsonProperty(value = "NUMBER")
        private String number;
        @JsonProperty(value = "MESSAGE")
        private String message;
        @JsonProperty(value = "FIELD")
        private String field;

    }


}
