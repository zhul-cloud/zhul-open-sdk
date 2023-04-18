package com.zhul.open.sdk.model;

import java.io.File;
import java.io.InputStream;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.InputStreamBody;

/**
 * Created by yanglikai on 2019/5/23.
 */
public class ByteWrapper {
  private String name;
  private ContentBody contentBody;

  public ByteWrapper(String filePath) {
    this.contentBody = new FileBody(new File(filePath));
  }

  public ByteWrapper(String filePath, ContentType contentType) {
    this.contentBody = new FileBody(new File(filePath), contentType);
  }

  public ByteWrapper(File file) {
    this.contentBody = new FileBody(file);
  }

  public ByteWrapper(File file, ContentType contentType) {
    this.contentBody = new FileBody(file, contentType);
  }

  public ByteWrapper(String name, byte[] data) {
    this.contentBody = new ByteArrayBody(data, name);
  }

  public ByteWrapper(String name, byte[] data, ContentType contentType) {
    this.contentBody = new ByteArrayBody(data, contentType, name);
  }

  public ByteWrapper(String name, InputStream stream) {
    this.contentBody = new InputStreamBody(stream, name);
  }

  public ByteWrapper(String name, InputStream stream, ContentType contentType) {
    this.contentBody = new InputStreamBody(stream, contentType, name);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContentBody getData() {
    return this.contentBody;
  }
}
