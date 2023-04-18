package com.zhul.open.sdk.client.executor;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.zhul.open.sdk.api.API;
import com.zhul.open.sdk.client.auth.Sign;
import com.zhul.open.sdk.util.hash.MD5Utils;
import com.zhul.open.sdk.util.http.HttpClient;
import com.zhul.open.sdk.util.misc.TimeUtil;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class SignExecutor extends AbstractExecutor implements Executor {
  private Sign sign;

  public SignExecutor(HttpClient httpClient, Sign sign) {
    this.sign = sign;
    this.httpClient = httpClient;
  }

  @Override
  protected void prepare(ExecutionContext context) {
    String appId = this.sign.getAppId();
    API api = context.getApi();
    Map<String, Object> params = api.getAPIParams().toParams();
    Map<String, Object> newParams = Maps.newHashMap();

    String key;
    String newValue;
    for (Iterator var6 = params.keySet().iterator(); var6.hasNext(); newParams.put(key, newValue)) {
      key = (String) var6.next();
      Object value = params.get(key);
      newValue = value.toString();
      if (value instanceof Date) {
        Date tmp = (Date) value;
        newValue = TimeUtil.formatTime(tmp);
      }
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    key = sdf.format(new Date());
    newParams.put("method", api.getName());
    newParams.put("timestamp", key);
    newParams.put("format", "json");
    newParams.put("app_id", appId);
    newParams.put("v", "1.0");
    newParams.put("sign_method", "md5");
    String paramSign = this.getSign(newParams);
    newParams.put("sign", paramSign);
    context.setUrl(api.getHttpUrl() + "/entry");
    context.setParams(newParams);
  }

  private String getSign(Map<String, Object> params) {
    String appSecret = this.sign.getAppSecret();
    List<String> keys = Lists.newArrayList(params.keySet());
    Collections.sort(keys, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });
    StringBuilder sb = new StringBuilder();
    sb.append(appSecret);
    Iterator var5 = keys.iterator();

    while (var5.hasNext()) {
      String k = (String) var5.next();
      sb.append(String.format("%s%s", k, params.get(k)));
    }

    sb.append(appSecret);
    String text = sb.toString();
    return MD5Utils.MD5(text);
  }
}
