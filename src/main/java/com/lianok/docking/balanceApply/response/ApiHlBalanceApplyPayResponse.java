package com.lianok.docking.balanceApply.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBalanceApplyPayResponse extends DockingResponseBase {

    private String merchantNo;
    private String orderNo;
    private String businessOrderNo;
    private String divideDetail;
    private String msg;


    public String getMerchantNo() {
        return merchantNo;
    }
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOrderNo() {return orderNo;}
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
