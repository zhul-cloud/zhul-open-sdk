package com.zhul.open.sdk.util.misc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.zhul.open.sdk.exception.ApiException;
import com.zhul.open.sdk.model.Response;
import java.io.IOException;

/**
 * Created by yanglikai on 2019/5/23.
 */
public final class XMLUtils {
  private static final XmlMapper OBJECT_MAPPER = new XmlMapper();

  private XMLUtils() {
  }

  public static String tXML(Object object) {
    try {
      return OBJECT_MAPPER.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      throw new ApiException(e);
    }
  }

  public static <T> T tBean(String xml, Class<T> clazz) {
    try {
      return OBJECT_MAPPER.readValue(xml, clazz);
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  public static <T> T tBean(String xml, TypeReference<T> ref) {
    try {
      return OBJECT_MAPPER.readValue(xml, ref);
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  public static <T> T tClassBean(String xml, Class clazz) {
    try {
      JavaType type = OBJECT_MAPPER.getTypeFactory().constructParametricType(Response.class, new Class[]{clazz});
      return OBJECT_MAPPER.readValue(xml, type);
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  static {
    OBJECT_MAPPER.enable(SerializationFeature.INDENT_OUTPUT);
  }
}
