package com.lianok.docking.notification;

import java.math.BigDecimal;

/**
 * 退款异步通知
 */
public class RefundNotification {

    /**
     * 火脸订单号
     */
    private String orderNo;
    /**
     * 火脸退单号
     */
    private String refundNo;
    /**
     * 系统对接单号
     */
    private String businessOrderNo;
    /**
     * 系统对接退款单号
     */
    private String businessRefundNo;
    /**
     * 退款金额
     */
    private BigDecimal refundAmount;
    /**
     * 退款状态
     */
    private Integer refundStatus;
    /**
     * 退款时间
     */
    private String refundTime;
    /**
     * 退款方式
     */
    private String payWay;
    /**
     * 退单备注
     */
    private String remark;
    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 收银员编号
     */
    private String cashierNo;
    /**
     * 收银设备编号
     */
    private String deviceNo;
    /**
     * 异步通知类型
     */
    private String notifyType;
    /**
     * 渠道退单号
     */
    private String channelRefundNo;
    /**
     * 退款手续费
     */
    private BigDecimal serviceFee;
    /**
     * 商家优惠退款金额
     */
    private BigDecimal benefitAmount;
    /**
     * 官方优惠退款金额
     */
    private BigDecimal officialCouponAmount;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getBusinessRefundNo() {
        return businessRefundNo;
    }

    public void setBusinessRefundNo(String businessRefundNo) {
        this.businessRefundNo = businessRefundNo;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
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

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getChannelRefundNo() {
        return channelRefundNo;
    }

    public void setChannelRefundNo(String channelRefundNo) {
        this.channelRefundNo = channelRefundNo;
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
}
