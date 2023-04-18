package com.zhul.open.sdk.util.misc;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yanglikai on 2019/5/23.
 */
public final class TimeUtil {
  private static final String FORMAT_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

  private TimeUtil() {
  }

  public static String formatTime(Date date) {
    SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_YYYYMMDDHHMMSS);
    return sdf.format(date);
  }

  public static String formatTime(Date date, String pattern) {
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    return sdf.format(date);
  }
}
