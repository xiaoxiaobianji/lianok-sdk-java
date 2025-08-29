package com.lianok.docking.balanceApply.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.balanceApply.response.ApiHlBalanceApplyReceiverUpdateResponse;

/**
 * 余额分账-入账方修改
 *
 * @author lianok.com
 */
public class ApiHlBalanceApplyReceiverUpdateRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;

    /**
     * 请求流水号
     */
    private String requestNo;

    /**
     * 通道标识
     */
    private String channelCode;



    /**
     * 总行编码
     */
    private String bankCode;

    /**
     * 银行账户信息
     */
    private String bankCardNo;


    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }


    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    @Override
    public String getResource() {
        return "api.hl.balance.apply.receiverUpdate";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBalanceApplyReceiverUpdateResponse.class;
    }
}
