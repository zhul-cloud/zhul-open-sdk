package com.zhul.open.sdk.api;

import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.properties.FtpProperties;
import com.zhul.open.sdk.util.ftp.FTPClientManager;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Objects;

/**
 * Created by yanglikai on 2019/5/23.
 */
public abstract class AbstractFtpAPI implements FtpAPI {

  private FtpProperties ftp;

  private APIParams apiParams;

  public AbstractFtpAPI(FtpProperties ftp) {
    this.ftp = ftp;
  }

  @Override
  public boolean upload() {

    Objects.requireNonNull(ftp, "ftp properties must be not null");

    Objects.requireNonNull(apiParams, "api params must be not null");

    String params = apiParams.toString();

    InputStream inputStream = new ByteArrayInputStream(params.getBytes(Charset.forName("UTF-8")));

    return FTPClientManager.init(ftp.getHost()).userName(ftp.getUserName()).password(ftp.getPassword())
        .upload(ftp.getPath(), ftp.getFileName(), inputStream);
  }

  @Override
  public void setAPIParams(APIParams params) {
    this.apiParams = params;
  }
}
