package com.zhul.open.sdk.client.manager;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhul.open.sdk.api.AbstractAPI;
import com.zhul.open.sdk.client.auth.BearerToken;
import com.zhul.open.sdk.client.auth.Simple;
import com.zhul.open.sdk.client.core.CaisxClient;
import com.zhul.open.sdk.client.core.DefaultCaisxClient;
import com.zhul.open.sdk.client.processor.NoOpeResponsePostProcessor;
import com.zhul.open.sdk.client.processor.YhPurchaseResponsePostProcessor;
import com.zhul.open.sdk.exception.ApiException;
import com.zhul.open.sdk.gen.api.purchase.BrandManage;
import com.zhul.open.sdk.gen.api.purchase.CsxSupplierRecord;
import com.zhul.open.sdk.gen.api.purchase.FetchToken;
import com.zhul.open.sdk.gen.api.purchase.ProductApply;
import com.zhul.open.sdk.gen.api.purchase.ProductShopApply;
import com.zhul.open.sdk.gen.api.purchase.ProductUpdate;
import com.zhul.open.sdk.gen.model.purchase.*;
import com.zhul.open.sdk.properties.YhPurchasingProperties;
import java.io.IOException;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.SocketConfig;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * @author huangjinzhou
 * @date 2020/2/10
 */
public class YhPurchaseApiManager {

  private final YhPurchasingProperties properties;

  private final AtomicReference<FetchTokenResult> tokenCache = new AtomicReference<>();

  public YhPurchaseApiManager(YhPurchasingProperties properties) {
    this.properties = properties;
  }

  public void request(CsxSupplierRecordParams params) {
    CsxSupplierRecord api = new CsxSupplierRecord(properties.getSupplierCenterHost());
    api.setAPIParams(params);

    invoke(api);
  }

  public List<CsxSupplierUpdateResult> request(List<CsxSupplierUpdateParams> params) {
    return params == null || params.size() == 0 ? Collections.emptyList() : supplierUpdate(params);
  }

  public List<CsxSupplierAddPurchaseResult> requestSupplierAddPurchase(List<CsxSupplierAddPurchaseParams> params) {
    return params == null || params.size() == 0 ? Collections.emptyList() : supplierAddPurchase(params);
  }

  public List<BrandManageResult> request(BrandManageParams params) {
    BrandManage api = new BrandManage(properties.getProductCenterHost());
    api.setAPIParams(params);

    try (CaisxClient client =
        new DefaultCaisxClient(
            new BearerToken(getValidToken().getAccessToken()), new NoOpeResponsePostProcessor())) {
      String result = client.execute(api);
      JSONObject jsonObject = JSON.parseObject(result);
      if (!Objects.equals(200000, jsonObject.getInteger("code"))) {
        throw new ApiException(jsonObject.getString("message"));
      }

      return JSON.parseArray(jsonObject.get("result").toString(), BrandManageResult.class);
    } catch (ApiException ae) {
      throw ae;
    } catch (Exception ex) {
      throw new ApiException(ex);
    }
  }

  public ProductApplyResult request(ProductApplyParams params) {
    ProductApply api = new ProductApply(properties.getProductCenterHost());
    api.setAPIParams(params);

    return invoke(api);
  }

  public void request(ProductUpdateParams params) {
    ProductUpdate api = new ProductUpdate(properties.getProductCenterHost());
    api.setAPIParams(params);

    invoke(api);
  }

  public void request(ProductShopApplyParams params) {
    ProductShopApply api = new ProductShopApply(properties.getProductCenterHost());
    api.setAPIParams(params);

    invoke(api);
  }

  public FetchTokenResult getValidToken() {
    FetchTokenResult token = tokenCache.get();
    if (token != null && Instant.now().getEpochSecond() < token.getExpiresIn()) {
      return token;
    }

    return tokenCache.updateAndGet(prev -> fetchToken());
  }

  /** 默认token超时时间：12小时 */
  private static final int DEFAULT_EXPIRES = 720;

  private FetchTokenResult fetchToken() {
    FetchToken fetchToken = new FetchToken(properties.getAuthUrl());
    fetchToken.setAPIParams(
        new FetchTokenParams(properties.getSecretId(), properties.getSecretKey(), DEFAULT_EXPIRES));

    try (CaisxClient client =
        new DefaultCaisxClient(new Simple(), new NoOpeResponsePostProcessor())) {
      return FetchTokenResult.fromJson(client.execute(fetchToken));
    } catch (Exception ex) {
      throw new ApiException(ex);
    }
  }

  private <R> R invoke(AbstractAPI api) {
    try (CaisxClient client =
        new DefaultCaisxClient(
            new BearerToken(getValidToken().getAccessToken()),
            new YhPurchaseResponsePostProcessor())) {
      return client.invoke(api);
    } catch (IOException ex) {
      throw new ApiException(ex);
    }
  }

  private List<CsxSupplierUpdateResult> supplierUpdate(List<CsxSupplierUpdateParams> params) {
    final int timeout = 60 * 1000;
    try (CloseableHttpClient client =
        HttpClientBuilder.create()
            .setDefaultSocketConfig(
                SocketConfig.copy(SocketConfig.DEFAULT).setSoTimeout(timeout).build())
            .setDefaultRequestConfig(
                RequestConfig.copy(RequestConfig.DEFAULT)
                    .setConnectTimeout(timeout)
                    .setSocketTimeout(timeout)
                    .setConnectionRequestTimeout(timeout)
                    .build())
            .build()) {
      HttpPost request =
          new HttpPost(properties.getSupplierCenterHost().concat("/openapi/csxSupplier/update"));
      request.addHeader("Authorization", "Bearer ".concat(getValidToken().getAccessToken()));
      HttpEntity entity =
          EntityBuilder.create()
              .setContentType(ContentType.APPLICATION_JSON)
              .setContentEncoding("UTF-8")
              .setText(JSON.toJSONString(params))
              .build();
      request.setEntity(entity);

      CloseableHttpResponse response = client.execute(request);
      if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
        JSONObject retObj = JSON.parseObject(EntityUtils.toString(response.getEntity()));
        Integer code = retObj.getInteger("code");
        if (!Objects.equals(code, 200000)) {
          throw new ApiException(
              "错误码："
                  .concat(String.valueOf(code))
                  .concat(", 错误信息：")
                  .concat(retObj.getString("message")));
        }
        return JSON.parseArray(
            JSON.toJSONString(retObj.get("result")), CsxSupplierUpdateResult.class);
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }

    return Collections.emptyList();
  }

  private List<CsxSupplierAddPurchaseResult> supplierAddPurchase(List<CsxSupplierAddPurchaseParams> params) {
    final int timeout = 60 * 1000;
    try (CloseableHttpClient client =
                 HttpClientBuilder.create()
                         .setDefaultSocketConfig(
                                 SocketConfig.copy(SocketConfig.DEFAULT).setSoTimeout(timeout).build())
                         .setDefaultRequestConfig(
                                 RequestConfig.copy(RequestConfig.DEFAULT)
                                         .setConnectTimeout(timeout)
                                         .setSocketTimeout(timeout)
                                         .setConnectionRequestTimeout(timeout)
                                         .build())
                         .build()) {
      HttpPost request =
              new HttpPost(properties.getSupplierCenterHost().concat("/openapi/csxSupplier/addPurchase"));
      request.addHeader("Authorization", "Bearer ".concat(getValidToken().getAccessToken()));
      HttpEntity entity =
              EntityBuilder.create()
                      .setContentType(ContentType.APPLICATION_JSON)
                      .setContentEncoding("UTF-8")
                      .setText(JSON.toJSONString(params))
                      .build();
      request.setEntity(entity);

      CloseableHttpResponse response = client.execute(request);
      if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
        JSONObject retObj = JSON.parseObject(EntityUtils.toString(response.getEntity()));
        Integer code = retObj.getInteger("code");
        if (!Objects.equals(code, 200000)) {
          throw new ApiException(
                  "错误码："
                          .concat(String.valueOf(code))
                          .concat(", 错误信息：")
                          .concat(retObj.getString("message")));
        }
        return JSON.parseArray(
                JSON.toJSONString(retObj.get("result")), CsxSupplierAddPurchaseResult.class);
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }

    return Collections.emptyList();
  }
}
