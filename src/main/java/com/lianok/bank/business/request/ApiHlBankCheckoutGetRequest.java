package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankCheckoutGetResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 提现详情
 *
 * @author lianok.com
 */
public class ApiHlBankCheckoutGetRequest extends AbstractDockingRequest {

    /**
     * 提现单号
     */
    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.checkout.get";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankCheckoutGetResponse.class;
    }
}
