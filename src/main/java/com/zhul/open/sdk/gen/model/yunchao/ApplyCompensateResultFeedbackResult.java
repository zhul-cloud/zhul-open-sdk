package com.zhul.open.sdk.gen.model.yunchao;

import com.zhul.open.sdk.model.APIResult;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author liutl
 * @date 2019/8/2 11:46 对应接口编码：YCSMS1014 名称：申偿审批结果回传 描述：SAP审单后将申偿申请结果回传彩食鲜供应链
 */
@Data
public class ApplyCompensateResultFeedbackResult implements APIResult {

  private Header header;


  private List<Item> items;

  @Data
  public static class Header {

    //YCMS申偿单号
    private String compensateId;

    //申偿地点
    private String addressCode;

    //审批日期
    private String approvedDate;

    //审批时间
    private String approvedTime;

    //审批人
    private String approveBy;

  }

  @Data
  public static class Item {

    //审批结果
    private String approveResult;

    //商品编码
    private String goodsId;

    //库存地点
    private String inventoryAddress;


  }

}
