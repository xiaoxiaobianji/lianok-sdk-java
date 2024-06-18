package com.lianok.docking.pay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.pay.response.entity.Promotions;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlOrderPayBarcodeResponse extends DockingResponseBase {

    private String orderNo;
    private String topChannelOrderNo;
    private String channelOrderNo;
    private String businessOrderNo;
    private BigDecimal payAmount;
    private BigDecimal actualAmount;
    private String payTime;
    private String payWay;
    private Integer orderStatus;
    private String merchantNo;
    private String cashierNo;
    private String deviceNo;
    private String userId;
    private BigDecimal benefitAmount;
    private BigDecimal officialCouponAmount;
    private List<Promotions> promotions;


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

    public String getPayTime() {
        return payTime;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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

    public String getTopChannelOrderNo() {
        return topChannelOrderNo;
    }

    public void setTopChannelOrderNo(String topChannelOrderNo) {
        this.topChannelOrderNo = topChannelOrderNo;
    }

    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public List<Promotions> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotions> promotions) {
        this.promotions = promotions;
    }
}
