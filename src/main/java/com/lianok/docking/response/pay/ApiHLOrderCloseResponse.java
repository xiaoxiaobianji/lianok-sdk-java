package com.lianok.docking.response.pay;

import com.lianok.docking.DockingResponseBase;

/**
 * @author linshu
 * @create 2022/8/22 17:49
 */
public class ApiHLOrderCloseResponse extends DockingResponseBase {

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
