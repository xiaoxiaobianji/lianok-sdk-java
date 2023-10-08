package com.lianok.docking.pay.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

public class ApiHlOrderPayDetailsResponse extends DockingResponseBase {

    private String orderNo;
    private String businessOrderNo;
    private BigDecimal payAmount;
    private BigDecimal actualAmount;
    private BigDecimal refundAmount;
    private BigDecimal totalAmount;
    private String payTime;
    private String payWay;
    private Integer orderStatus;
    private String remark;
    private String merchantNo;
    private String cashierNo;
    private String deviceNo;
    private String subject;
    private String channelOrderNo;
    private String topChannelOrderNo;
    private String userId;
    private BigDecimal serviceFee;
    private BigDecimal benefitAmount;
    private BigDecimal officialCouponAmount;
    private Object promotions;

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

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getCashierNo() {
        return cashierNo;
    }

    public void setCashierNo(String cashierNo) {
        this.cashierNo = cashierNo;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getBenefitAmount() {
        return benefitAmount;
    }

    public void setBenefitAmount(BigDecimal benefitAmount) {
        this.benefitAmount = benefitAmount;
    }

    public BigDecimal getOfficialCouponAmount() {
        return officialCouponAmount;
    }

    public void setOfficialCouponAmount(BigDecimal officialCouponAmount) {
        this.officialCouponAmount = officialCouponAmount;
    }

    public Object getPromotions() {
        return promotions;
    }

    public void setPromotions(Object promotions) {
        this.promotions = promotions;
    }
}
