package com.zhul.open.sdk.properties;

import java.io.Serializable;
import lombok.Data;

/**
 * Created by yanglikai on 2019/5/23.
 */
@Data
public class SapProperties implements Serializable {

  private String host;

  private String userName;

  private String password;
}
