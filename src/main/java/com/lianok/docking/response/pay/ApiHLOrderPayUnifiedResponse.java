package com.lianok.docking.response.pay;

import com.lianok.docking.DockingResponseBase;

/**
 * @author linshu
 * @create 2022/8/22 19:52
 */
public class ApiHLOrderPayUnifiedResponse extends DockingResponseBase {

    private String orderNo;
    private String businessOrderNo;
    private String payUrl;

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

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }
}
