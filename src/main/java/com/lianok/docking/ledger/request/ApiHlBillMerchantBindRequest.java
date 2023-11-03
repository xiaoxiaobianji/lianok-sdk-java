package com.lianok.docking.ledger.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillMerchantBindResponse;

/**
 * 分账关系绑定
 */
public class ApiHlBillMerchantBindRequest extends AbstractDockingRequest {

    /**
     * 分账方商户ID
     */
    private String merchantNo;
    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
     */
    private String channelCode;
    /**
     * 分账接收方商户ID
     */
    private String receiveMerchantNo;
    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
     */
    private String receiveChannelCode;
    /**
     * 分账协议图片
     */
    private String agreement;

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

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    @Override
    public String getResource() {
        return "api.hl.bill.merchant.bind";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillMerchantBindResponse.class;
    }
}
