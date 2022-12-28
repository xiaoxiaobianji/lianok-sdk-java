package com.lianok.docking.request.ledger;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ledger.ApiHLBillMerchantBindResponse;

/**
 * 分账关系绑定
 *
 * @author linshu
 * @create 2022/11/2 11:24
 */
public class ApiHLBillMerchantBindRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.bill.merchant.bind";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLBillMerchantBindResponse.class;
    }

    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "channelCode")
    private String channelCode;
    @JSONField(name = "receiveMerchantNo")
    private String receiveMerchantNo;
    @JSONField(name = "receiveChannelCode")
    private String receiveChannelCode;

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

    public String getReceiveMerchantNo() {
        return receiveMerchantNo;
    }

    /**
     * 分账接收方商户编号
     * @param receiveMerchantNo
     */
    public void setReceiveMerchantNo(String receiveMerchantNo) {
        this.receiveMerchantNo = receiveMerchantNo;
    }

    public String getReceiveChannelCode() {
        return receiveChannelCode;
    }

    /**
     * 分账接收方渠道编号
     * @param receiveChannelCode
     */
    public void setReceiveChannelCode(String receiveChannelCode) {
        this.receiveChannelCode = receiveChannelCode;
    }
}
