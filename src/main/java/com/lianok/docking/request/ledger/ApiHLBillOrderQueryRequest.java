package com.lianok.docking.request.ledger;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ledger.ApiHLBillOrderQueryResponse;

/**
 * 分账查询
 *
 * @author linshu
 * @create 2022/11/2 11:23
 */
public class ApiHLBillOrderQueryRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.bill.order.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLBillOrderQueryResponse.class;
    }

    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "channelCode")
    private String channelCode;
    @JSONField(name = "billNo")
    private String billNo;
    @JSONField(name = "billId")
    private Long billId;


    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 商户编号
     * @param merchantNo
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    /**
     * 渠道编号
     * @param channelCode
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getBillNo() {
        return billNo;
    }

    /**
     * 对接商分账单号
     * @param billNo
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Long getBillId() {
        return billId;
    }

    /**
     * 火脸分账账单编号
     * @param billId
     */
    public void setBillId(Long billId) {
        this.billId = billId;
    }
}
