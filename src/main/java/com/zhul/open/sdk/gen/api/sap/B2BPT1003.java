package com.zhul.open.sdk.gen.api.sap;


import com.zhul.open.sdk.api.AbstractFtpAPI;
import com.zhul.open.sdk.properties.FtpProperties;

/**
 * 采购/配送/退货/返配订单关系回传
 * （SAP生成多级订单时，需要回传给彩食鲜订关系）
 * <p>
 * Created by yanglikai on 2019/5/23.
 */
public class B2BPT1003 extends AbstractFtpAPI {

  public B2BPT1003(FtpProperties ftp) {
    super(ftp);
  }
}
