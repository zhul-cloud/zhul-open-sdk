package com.zhul.open.sdk.gen.model.sap;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.zhul.open.sdk.model.APIParams;
import lombok.Data;

import java.util.Map;


@Data
@JacksonXmlRootElement(localName = "SHEET")
public class CSCM1001Params implements APIParams {

  @Override
  public Map<String, Object> toParams() {
    return null;
  }
}
