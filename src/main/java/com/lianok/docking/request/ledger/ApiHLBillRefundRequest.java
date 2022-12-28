package com.lianok.docking.request.ledger;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ledger.ApiHLBillRefundResponse;

import java.math.BigDecimal;

/**
 * 分账订单退款
 *
 * @author linshu
 * @create 2022/11/2 11:15
 */
public class ApiHLBillRefundRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.bill.refund";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLBillRefundResponse.class;
    }


    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "operatorAccount")
    private String operatorAccount;
    @JSONField(name = "businessRefundNo")
    private String businessRefundNo;
    @JSONField(name = "orderNo")
    private String orderNo;
    @JSONField(name = "businessOrderNo")
    private String businessOrderNo;
    @JSONField(name = "channelOrderNo")
    private String channelOrderNo;
    @JSONField(name = "topChannelOrderNo")
    private String topChannelOrderNo;
    @JSONField(name = "refundAmount")
    private BigDecimal refundAmount;
    @JSONField(name = "refundPassword")
    private String refundPassword;
    @JSONField(name = "deviceNo")
    private String deviceNo;
    @JSONField(name = "remark")
    private String remark;
    @JSONField(name = "notifyUrl")
    private String notifyUrl;

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

    public String getBusinessRefundNo() {
        return businessRefundNo;
    }

    public void setBusinessRefundNo(String businessRefundNo) {
        this.businessRefundNo = businessRefundNo;
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

    public String getTopChannelOrderNo() {
        return topChannelOrderNo;
    }

    public void setTopChannelOrderNo(String topChannelOrderNo) {
        this.topChannelOrderNo = topChannelOrderNo;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundPassword() {
        return refundPassword;
    }

    public void setRefundPassword(String refundPassword) {
        this.refundPassword = refundPassword;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}
