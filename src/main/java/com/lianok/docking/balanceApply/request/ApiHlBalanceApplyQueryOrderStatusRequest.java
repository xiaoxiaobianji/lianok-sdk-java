package com.lianok.docking.balanceApply.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.balanceApply.response.ApiHlBalanceApplyQueryOrderStatusResponse;

/**
 * 余额分账-余额分账状态查询
 *
 * @author lianok.com
 */
public class ApiHlBalanceApplyQueryOrderStatusRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;

    /**
     * 业务订单号
     */
    private String businessOrderNo;

    /**
     * 火脸订单号
     */
    private String orderNo;


    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String getResource() {
        return "api.hl.balance.apply.queryOrderStatus";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBalanceApplyQueryOrderStatusResponse.class;
    }
}
