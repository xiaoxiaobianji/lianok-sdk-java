package com.lianok.docking.balanceApply.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.balanceApply.response.ApiHlBalanceApplyPayResponse;

/**
 * 余额分账-发起余额分账
 *
 * @author lianok.com
 */
public class ApiHlBalanceApplyPayRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;

    /**
     * 通道标识
     */
    private String channelCode;

    /**
     * 通道标识
     */
    private String operatorAccount;

    /**
     * 业务订单号
     */
    private String businessOrderNo;

    /**
     * 分账接收方集合字符串
     */
    private String divideDetail;

    /**
     * 分账方账户类型
     */
    private String accountType;

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

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getDivideDetail() {
        return divideDetail;
    }

    public void setDivideDetail(String divideDetail) {
        this.divideDetail = divideDetail;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String getResource() {
        return "api.hl.balance.apply.pay";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBalanceApplyPayResponse.class;
    }
}
