package com.zhul.open.sdk.util.ftp;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

/**
 * Created by yanglikai on 2019/5/23.
 */
public final class FTPClientManager {

  private String hostName;

  private String userName;

  private String password;

  private FTPClientManager(String hostName) {
    this.hostName = hostName;
  }

  public static FTPClientManager init(String hostName) {
    return new FTPClientManager(hostName);
  }

  public FTPClientManager userName(String userName) {
    this.userName = userName;

    return this;
  }

  public FTPClientManager password(String password) {
    this.password = password;

    return this;
  }

  public boolean upload(String pathname, String fileName, InputStream inputStream) {
    FTPClient ftpClient = new FTPClient();

    try {
      ftpClient.connect(hostName, 21);

      ftpClient.login(userName, password);

      ftpClient.changeWorkingDirectory(pathname);

      ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

      ftpClient.storeFile(fileName, inputStream);

      return true;
    } catch (Exception ex) {
      ex.printStackTrace();

      return false;
    } finally {
      try {
        inputStream.close();

        ftpClient.logout();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
