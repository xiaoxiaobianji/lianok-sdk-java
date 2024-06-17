package com.lianok.docking.fund.settle.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.fund.settle.response.ApiHlOrderDeferredSettlementRevokeResponse;

/**
 * 延时结算交易撤销
 *
 * @author lianok.com
 */
public class ApiHlOrderDeferredSettlementRevokeRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;
    /**
     * 操作者账号
     */
    private String operatorAccount;
    /**
     * 火脸订单号
     */
    private String orderNo;
    /**
     * 对接商系统订单号
     */
    private String businessOrderNo;
    /**
     * 渠道订单号
     */
    private String channelOrderNo;
    /**
     * 延时结算完成订单号
     */
    private String deferredOrderNo;

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

    public String getDeferredOrderNo() {
        return deferredOrderNo;
    }

    public void setDeferredOrderNo(String deferredOrderNo) {
        this.deferredOrderNo = deferredOrderNo;
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
