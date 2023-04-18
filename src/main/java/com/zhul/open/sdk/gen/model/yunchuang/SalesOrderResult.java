package com.zhul.open.sdk.gen.model.yunchuang;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zhul.open.sdk.model.APIResult;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * Created by dinglj on 2019/10/23.
 */
@Data
public class SalesOrderResult implements APIResult {

    @JsonProperty(value = "code")
    private String code;

    @JsonProperty(value = "message")
    private String message;

}
