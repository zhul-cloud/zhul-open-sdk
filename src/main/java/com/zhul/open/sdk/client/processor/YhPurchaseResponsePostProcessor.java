package com.zhul.open.sdk.client.processor;

import com.alibaba.fastjson.JSONObject;
import com.zhul.open.sdk.exception.ApiException;
import java.util.Objects;
import java.util.Optional;

/**
 * @author huangjinzhou
 * @date 2020/2/10
 */
public class YhPurchaseResponsePostProcessor implements ResponsePostProcessor {

  @Override
  public String execute(String response) {
    JSONObject resJsonObject;
    try {
      resJsonObject = JSONObject.parseObject(response);
    } catch (Exception e) {
      throw new ApiException(String.format("解析API返回为json失败，返回值：%s", response), e);
    }

    if (isSuccess(resJsonObject)) {
      return success(resJsonObject);
    }

    return error(resJsonObject);
  }

  public boolean isSuccess(JSONObject response) {
    return Optional.ofNullable(response)
        .map(rs -> rs.getInteger("code"))
        .map(code -> Objects.equals(ResponseCode.SUCCESS.getCode(), code))
        .orElse(false);
  }

  private String success(JSONObject response) {
    JSONObject res = new JSONObject();

    res.put("code", response.get("code"));
    res.put("response", response.get("result"));
    return res.toString();
  }

  private String error(JSONObject response) {
    JSONObject error = new JSONObject();
    error.put("code", Optional.ofNullable(response.get("code")).orElse(""));
    error.put("msg", Optional.ofNullable(response.get("message")).orElse(""));

    JSONObject result = new JSONObject();
    result.put("error_response", error);
    return result.toJSONString();
  }

  public enum ResponseCode {
    /** */
    SUCCESS(200000, "请求成功"),
    BUSINESS_ERROR(400001, "业务逻辑错误"),
    ILLEGAL_ARGUMENT(400002, "参数校验错误"),
    HYSTRIX_EXCEPTION(400003, "Hystrix异常"),
    ENTITY_NOT_FOUND(400004, "查询无记录"),
    EXISTED_ALREADY(400005, "数据已存在"),
    SERVER_INTERNAL_ERROR(500000, "服务内部错误"),
    ;
    private final int code;

    private final String message;

    ResponseCode(int code, String message) {
      this.code = code;
      this.message = message;
    }

    public int getCode() {
      return code;
    }

    public String getMessage() {
      return message;
    }
  }
}
