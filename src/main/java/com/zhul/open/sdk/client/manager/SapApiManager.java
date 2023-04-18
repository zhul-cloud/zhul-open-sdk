package com.zhul.open.sdk.client.manager;

import com.zhul.open.sdk.client.auth.Basic;
import com.zhul.open.sdk.client.core.CaisxClient;
import com.zhul.open.sdk.client.core.DefaultCaisxClient;
import com.zhul.open.sdk.client.processor.COMM0001Processor;
import com.zhul.open.sdk.client.processor.SapProcessor;
import com.zhul.open.sdk.exception.ApiException;
import com.zhul.open.sdk.gen.api.sap.*;
import com.zhul.open.sdk.gen.api.yunchuang.CSXYCC002;
import com.zhul.open.sdk.gen.api.yunchuang.CSXYCC014;
import com.zhul.open.sdk.gen.model.sap.*;
import com.zhul.open.sdk.gen.model.yunchuang.*;
import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.properties.FtpProperties;
import com.zhul.open.sdk.properties.SapProperties;

import java.util.Objects;

/**
 * SAP接口管理 Created by yanglikai on 2019/5/23.
 */
public final class SapApiManager {

  private FtpProperties ftp;

  private SapProperties sap;

  private SapApiManager() {
  }

  public static SapApiManager init() {
    return new SapApiManager();
  }

  public SapApiManager setup(FtpProperties properties) {
    this.ftp = properties;
    return this;
  }

  public SapApiManager setup(SapProperties properties) {
    this.sap = properties;
    return this;
  }

  public B2B1001Result request(B2B1001Params params) {
    Objects.requireNonNull(sap, "sap properties must be not null");

    B2B1001 api = new B2B1001(sap.getHost());
    api.setAPIParams(params);

    try (CaisxClient client = new DefaultCaisxClient(
        new Basic(sap.getUserName(), sap.getPassword()), new SapProcessor())) {
      return client.invoke(api);
    } catch (Exception ex) {
      throw new ApiException(ex.getMessage());
    }
  }

  public COMM0001Result request(APIParams params) {
    Objects.requireNonNull(sap, "sap properties must be not null");

    COMM0001 api = new COMM0001(sap.getHost());
    api.setAPIParams(params);

    try (CaisxClient client = new DefaultCaisxClient(
        new Basic(sap.getUserName(), sap.getPassword()), new COMM0001Processor())) {
      return client.invoke(api);
    } catch (Exception ex) {
      throw new ApiException(ex.getMessage());
    }
  }

  public boolean upload(B2BPT1009Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    B2BPT1009 b2BPT1009 = new B2BPT1009(ftp);

    b2BPT1009.setAPIParams(params);

    return b2BPT1009.upload();
  }

  public boolean upload(YCSMS1001Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    YCSMS1001 ycsms1001 = new YCSMS1001(ftp);

    ycsms1001.setAPIParams(params);

    return ycsms1001.upload();
  }

  public boolean upload(YCSMS1005Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    YCSMS1005 ycsms1005 = new YCSMS1005(ftp);

    ycsms1005.setAPIParams(params);

    return ycsms1005.upload();
  }

  public boolean upload(YCSMS1010Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    YCSMS1010 ycsms1010 = new YCSMS1010(ftp);

    ycsms1010.setAPIParams(params);

    return ycsms1010.upload();
  }

  public boolean upload(YCSMS1022Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    YCSMS1022 ycsms1022 = new YCSMS1022(ftp);

    ycsms1022.setAPIParams(params);

    return ycsms1022.upload();
  }


  public boolean upload(ECCBMS132Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    ECCBMS132 eccbms132 = new ECCBMS132(ftp);

    eccbms132.setAPIParams(params);

    return eccbms132.upload();
  }

  public boolean upload(CSCM1003Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    CSCM1003 cscm1003 = new CSCM1003(ftp);

    cscm1003.setAPIParams(params);

    return cscm1003.upload();
  }

  public boolean upload(CSCM1002Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    CSCM1002 cscm1002 = new CSCM1002(ftp);

    cscm1002.setAPIParams(params);

    return cscm1002.upload();
  }

  public boolean upload(CSCM1004Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    CSCM1004 cscm1004 = new CSCM1004(ftp);

    cscm1004.setAPIParams(params);

    return cscm1004.upload();
  }

  public boolean upload(CSXYCC007Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    CSXYCC007 csxycc007 = new CSXYCC007(ftp);

    csxycc007.setAPIParams(params);

    return csxycc007.upload();
  }


  public boolean upload(CSXYCC002Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    CSXYCC002 b2bcsxycc002 = new CSXYCC002(ftp);

    b2bcsxycc002.setAPIParams(params);

    return b2bcsxycc002.upload();
  }

  public boolean upload(CSXYCC008Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    CSXYC008 csxyc008 = new CSXYC008(ftp);

    csxyc008.setAPIParams(params);

    return csxyc008.upload();
  }


  public boolean upload(CSXYCC012Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    CSXYC012 csxyc012 = new CSXYC012(ftp);

    csxyc012.setAPIParams(params);

    return csxyc012.upload();
  }


  public boolean upload(CSXYCC004Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    CSXYCC004 csxycc004 = new CSXYCC004(ftp);

    csxycc004.setAPIParams(params);

    return csxycc004.upload();
  }

  public boolean upload(CSXYCC014Params params) {
    Objects.requireNonNull(ftp, "ftp properties must be not null");

    CSXYCC014 b2bcsxycc014 = new CSXYCC014(ftp);

    b2bcsxycc014.setAPIParams(params);

    return b2bcsxycc014.upload();
  }
}
