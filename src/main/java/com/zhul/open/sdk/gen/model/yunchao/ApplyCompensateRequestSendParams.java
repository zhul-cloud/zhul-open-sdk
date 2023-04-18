package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIParams;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * @author liutl
 * @date 2019/8/2 11:39 对应接口编码：YCSMS1013 名称：申偿申请下传 内容：彩食鲜供应链申偿申请下传SAP
 */
@Data
public class ApplyCompensateRequestSendParams implements APIParams {

  private Header header;

  private List<Item> items;

  @Data
  public static class Header {

    //YHSMS申偿单号
    private String compensateId;

    //申偿类型
    private String compensateType;

    //配送地点
    private String addressCode;

    //申偿创建日期
    private String createdDate;

    //申偿创建人
    private String createdBy;

    //申偿创建时间
    private String createdTime;

    //原发运单号
    private String deliveryCode;

  }

  @Data
  public static class Item {

    //申偿单序列号
    private String rowNum;

    //商品编码
    private String goodsId;

    //申偿地点
    private String addressCode;

    //申偿数量
    private String quantity;

    //备注
    private String remark;

    //原单实收数量
    private String receivedQuantity;

    //原单单据数量
    private String shippedQuantity;

  }


  @Override
  public Map<String, Object> toParams() {
    return null;
  }
}
