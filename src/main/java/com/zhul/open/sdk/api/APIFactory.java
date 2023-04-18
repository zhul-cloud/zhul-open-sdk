package com.zhul.open.sdk.api;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.zhul.open.sdk.model.APIParams;
import com.zhul.open.sdk.model.ByteWrapper;
import com.zhul.open.sdk.model.FileParams;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by yanglikai on 2019/5/23.
 */
public final class APIFactory {
  private APIFactory() {
  }

  public static API create(String apiName, String apiVersion, String httpMethod, Map<String, Object> params, Multimap<String, ByteWrapper> fileParams) {
    return new APIFactory.DefaultAPI(apiName, apiVersion, httpMethod, params, fileParams);
  }

  private static class DefaultParamsWithFile extends APIFactory.DefaultParams implements FileParams {
    private Multimap<String, ByteWrapper> fileParams = null;

    public DefaultParamsWithFile(Map<String, Object> params, Multimap<String, ByteWrapper> fileParams) {
      super(params);
      this.fileParams = fileParams;
    }

    @Override
    public Multimap<String, ByteWrapper> toFileParams() {
      return this.fileParams;
    }
  }

  private static class DefaultParams implements APIParams {
    private Map<String, Object> params;

    public DefaultParams(Map<String, Object> params) {
      this.params = params;
    }

    @Override
    public Map<String, Object> toParams() {
      if (this.params == null) {
        return Maps.newHashMap();
      } else {
        Map<String, Object> newParams = Maps.newHashMap();
        Map<String, Object> oldParams = this.params;
        Iterator var3 = oldParams.keySet().iterator();

        while (var3.hasNext()) {
          String key = (String) var3.next();
          if (oldParams.get(key) != null) {
            newParams.put(key, oldParams.get(key));
          }
        }

        return newParams;
      }
    }
  }


  private static class DefaultAPI extends AbstractAPI {
    private String apiName;
    private String apiVersion;
    private String httpMethod;
    private Map<String, Object> params;
    private Multimap<String, ByteWrapper> fileParams;

    public DefaultAPI(String apiName, String apiVersion, String httpMethod, Map<String, Object> params, Multimap<String, ByteWrapper> fileParams) {
      this.apiName = apiName;
      this.apiVersion = apiVersion;
      this.httpMethod = httpMethod;
      this.params = params;
      this.fileParams = fileParams;
    }

    @Override
    public String getHttpMethod() {
      return this.httpMethod;
    }

    @Override
    public String getName() {
      return this.apiName;
    }

    @Override
    public APIParams getAPIParams() {
      return (APIParams) (this.fileParams != null ? new APIFactory.DefaultParamsWithFile(this.params, this.fileParams) : new APIFactory.DefaultParams(this.params));
    }

    @Override
    public void setAPIParams(APIParams params) {
    }

    @Override
    public Class getResultModelClass() {
      return null;
    }

    @Override
    public Class getParamModelClass() {
      return null;
    }

    @Override
    public boolean hasFiles() {
      return this.fileParams != null;
    }
  }
}
