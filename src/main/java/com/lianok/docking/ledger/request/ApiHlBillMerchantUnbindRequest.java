package com.lianok.docking.ledger.request;

import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillMerchantUnbindResponse;

/**
 * 分账关系解绑
 */
public class ApiHlBillMerchantUnbindRequest extends DockingRequestBase {


    private String merchantNo;
    private String channelCode;
    private String receiveMerchantNo;
    private String receiveChannelCode;

    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 商户编号
     *
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
     *
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
     *
     * @param receiveMerchantNo
     */
    public void setReceiveMerchantNo(String receiveMerchantNo) {
        this.receiveMerchantNo = receiveMerchantNo;
    }

    public String getReceiveChannelCode() {
        return receiveChannelCode;
    }

    /**
     * 分 账接收方渠道编号
     *
     * @param receiveChannelCode
     */
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
