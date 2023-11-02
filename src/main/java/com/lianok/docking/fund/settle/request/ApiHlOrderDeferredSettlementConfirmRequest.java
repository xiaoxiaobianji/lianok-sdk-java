package com.lianok.docking.fund.settle.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.fund.settle.response.ApiHlOrderDeferredSettlementConfirmResponse;

import java.math.BigDecimal;

/**
 * 延时结算确认
 */
public class ApiHlOrderDeferredSettlementConfirmRequest extends AbstractDockingRequest {

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
     * 火脸订单号可在火脸服务商后台-订单管理-交易流水或商家后台-订单管理-交易流水中查看。
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
     * 延时结算确认金额
     */
    private BigDecimal deferredAmount;

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

    public BigDecimal getDeferredAmount() {
        return deferredAmount;
    }

    public void setDeferredAmount(BigDecimal deferredAmount) {
        this.deferredAmount = deferredAmount;
    }

    @Override
    public String getResource() {
        return "api.hl.order.deferredSettlementConfirm";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderDeferredSettlementConfirmResponse.class;
    }
}
