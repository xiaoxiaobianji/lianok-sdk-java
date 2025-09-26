package com.lianok.docking.withdraw.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.withdraw.response.ApiHlWithdrawOrderResponse;
import com.lianok.docking.withdraw.response.ApiHlWithdrawQueryOrderResponse;

import java.math.BigDecimal;

/**
 * 易分账-提现状态查询
 *
 * @author lianok.com
 */
public class ApiHlWithdrawQueryOrderRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;

    private String orderNo;
    private String businessOrderNo;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
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

    @Override
    public String getResource() {
        return "api.hl.withdraw.queryOrder";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlWithdrawQueryOrderResponse.class;
    }
}
