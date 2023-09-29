package com.lianok.docking.fund.settle.request;

import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.fund.settle.response.ApiHlOrderDeferredSettlementRevokeResponse;

/**
 * 延时结算交易撤销
 */
public class ApiHlOrderDeferredSettlementRevokeRequest extends DockingRequestBase {

    private String merchantNo;
    private String operatorAccount;
    private String orderNo;
    private String businessOrderNo;
    private String channelOrderNo;
    private String deferredAmount;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

    public String getDeferredAmount() {
        return deferredAmount;
    }

    public void setDeferredAmount(String deferredAmount) {
        this.deferredAmount = deferredAmount;
    }

    @Override
    public String getResource() {
        return "api.hl.order.deferredSettlementRevoke";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderDeferredSettlementRevokeResponse.class;
    }
}
