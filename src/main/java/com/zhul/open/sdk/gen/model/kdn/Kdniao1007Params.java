package com.zhul.open.sdk.gen.model.kdn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * 电子面单
 * Created by yanglikai on 2019/3/20.
 */
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Kdniao1007Params extends KdniaoParams {

  @JsonProperty(value = "Callback")
  private String callback;       // 用户自定义回传字段

  @JsonProperty(value = "MemberID")
  private String memberID;       // ERP 系统、电商平台等系统或平台类型用户的会员 ID 或店铺账号等唯一性标识，用于区分其用户

  @JsonProperty(value = "CustomerName")
  private String customerName;   // 客户编码

  @JsonProperty(value = "CustomerPwd")
  private String customerPwd;    // 客户秘钥

  @JsonProperty(value = "SendSite")
  private String sendSite;      // 所属网点

  @JsonProperty(value = "ShipperCode")
  private String shipperCode;   // 快递公司编码

  @JsonProperty(value = "LogisticCode")
  private String logisticCode; // 快递单号

  @JsonProperty(value = "ThrOrderCode")
  private String thrOrderCode; // 第三方订单号

  @JsonProperty(value = "OrderCode")
  private String orderCode;    // 订单编号

  @JsonProperty(value = "PayType")
  private String payType;      // 运费支付方式：1-现付、2-到付、3-月结、4-第三方付(仅SF支持)

  @JsonProperty(value = "MonthCode")
  private String monthCode;    // 月结号

  @JsonProperty(value = "ExpType")
  private String expType;      // 快递类型

  @JsonProperty(value = "IsReturnSignBill")
  private Integer isReturnSignBill; // 是否要求签回单(0-不要求、1-要求)

  @JsonProperty(value = "OperateRequire")
  private String operateRequire;   // 签回单操作要求(如：签名、盖章、身份证复印件等)

  @JsonProperty(value = "Cost")
  private Double cost;             // 快递运费

  @JsonProperty(value = "OtherCost")
  private Double otherCost;        // 其他费用

  @JsonProperty(value = "Receiver")
  private Receiver receiver;       // 收件人

  @JsonProperty(value = "Sender")
  private Sender sender;           // 发件人

  @JsonProperty(value = "IsNotice")
  private Integer isNotice;        // 是否通知快递员上门揽件(0-通知、1-不通知,不填则默认为1)

  @JsonProperty(value = "StartDate")
  private String startDate;        // 上门揽件时间

  @JsonProperty(value = "EndDate")
  private String endDate;          // 上门揽件时间

  @JsonProperty(value = "Weight")
  private Double weight;           // 包裹总重量

  @JsonProperty(value = "Quantity")
  private Integer quantity;        // 包裹数

  @JsonProperty(value = "Volume")
  private Double volume;           // 包裹总体积

  @JsonProperty(value = "Remark")
  private String remark;           // 备注

  @JsonProperty(value = "AddService")
  private List<AddService> addServices; // 增值服务

  @JsonProperty(value = "Commodity")
  private List<Commodity> commodities;  // 商品信息

  @JsonProperty(value = "IsReturnPrintTemplate")
  private Integer isReturnPrintTemplate; // 是否返回电子面单模板(0-不需要、1-需要)

  @JsonProperty(value = "IsSendMessage")
  private Integer isSendMessage;         // 是否订阅短信(0-不需要、1-需要)

  @JsonProperty(value = "TemplateSize")
  private Integer templateSize;          // 模板规格

  public Kdniao1007Params() {
    super("1007");
  }

  public Kdniao1007Params(String requestType) {
    super(requestType);
  }

  /**
   * 商品信息
   */
  @Data
  @JsonInclude(value = JsonInclude.Include.NON_NULL)
  public static class Commodity implements Serializable {
    @JsonProperty(value = "GoodsName")
    private String goodsName; // 商品名称

    @JsonProperty(value = "GoodsCode")
    private String goodsCode; // 商品编码

    @JsonProperty(value = "Goodsquantity")
    private Integer qty;      // 商品件数

    @JsonProperty(value = "GoodsPrice")
    private Double price;    // 商品价格

    @JsonProperty(value = "GoodsWeight")
    private Double weight;   // 商品重量

    @JsonProperty(value = "GoodsVol")
    private Integer vol;     // 商品体积

    @JsonProperty(value = "GoodsDesc")
    private Integer desc;    // 商品描述
  }

  /**
   * 附加服务
   */
  @Data
  @JsonInclude(value = JsonInclude.Include.NON_NULL)
  public static class AddService implements Serializable {
    @JsonProperty(value = "Name")
    private String name;

    @JsonProperty(value = "Value")
    private String value;

    @JsonProperty(value = "CustomerID")
    private String customerId;
  }

  /**
   * 收货人
   */
  @Data
  public static class Receiver extends Express {
  }

  /**
   * 发货人
   */
  @Data
  public static class Sender extends Express {

  }

  /**
   * 快递信息
   */
  @Data
  @JsonInclude(value = JsonInclude.Include.NON_NULL)
  public static class Express implements Serializable {
    @JsonProperty(value = "Company")
    private String company; // 公司

    @JsonProperty(value = "Name")
    private String name;    // 名称

    @JsonProperty(value = "Tel")
    private String tel;     // 电话

    @JsonProperty(value = "Mobile")
    private String mobile;  // 手机

    @JsonProperty(value = "PostCode")
    private String postCode; // 邮编

    @JsonProperty(value = "ProvinceName")
    private String provinceName; // 省

    @JsonProperty(value = "CityName")
    private String cityName;    // 市

    @JsonProperty(value = "ExpAreaName")
    private String expAreaName; // 区/县

    @JsonProperty(value = "Address")
    private String address;     // 详细地址
  }
}
