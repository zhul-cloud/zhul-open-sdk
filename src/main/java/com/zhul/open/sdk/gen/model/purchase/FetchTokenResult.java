package com.zhul.open.sdk.gen.model.purchase;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * @author huangjinzhou
 * @date 2020/2/10
 */
@Data
public class FetchTokenResult {

  /**
   * tokenType : Bearer expiresIn : 43200 accessToken :
   * eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJISEs0VlRRc1NHRU9YT08yYWV0e
   * nhSWklLZXd2YU9INSIsImV4cCI6MTU2NzU0MzcxMX0.ExrnfwbjUOMwZ0ZefBqoYL5UgfaPoO2Q 5qItVTUyFIY
   */
  private String tokenType;

  private Integer expiresIn;

  private String accessToken;

  public static FetchTokenResult fromJson(String str) {
    return JSON.parseObject(str, FetchTokenResult.class);
  }
}
