package com.lianok.docking.pay.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlOrderCloseResponse extends DockingResponseBase {

    private String orderNo;
    private String merchantNo;
    private String businessOrderNo;
    private Integer state;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo() {
        this.businessOrderNo = businessOrderNo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
