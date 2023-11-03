package com.lianok.docking.ledger.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillMerchantUnbindResponse;

/**
 * 分账关系解绑
 */
public class ApiHlBillMerchantUnbindRequest extends AbstractDockingRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 渠道编号
     */
    private String channelCode;
    /**
     * 分账接收方商户编号
     */
    private String receiveMerchantNo;
    /**
     * 分账接收方渠道编号
     */
    private String receiveChannelCode;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getReceiveMerchantNo() {
        return receiveMerchantNo;
    }

    public void setReceiveMerchantNo(String receiveMerchantNo) {
        this.receiveMerchantNo = receiveMerchantNo;
    }

    public String getReceiveChannelCode() {
        return receiveChannelCode;
    }

    public void setReceiveChannelCode(String receiveChannelCode) {
        this.receiveChannelCode = receiveChannelCode;
    }

    @Override
    public String getResource() {
        return "api.hl.bill.merchant.unbind";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillMerchantUnbindResponse.class;
    }

}
