package com.lianok.docking.notification;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.List;

/**
 * 支付异步通知
 *
 * @author lianok.com
 */
public class OrderNotification {

    /**
     * 火脸订单号
     */
    private String orderNo;
    /**
     * 对接商系统订单号
     */
    private String businessOrderNo;
    /**
     * 消费者实付金额
     */
    private BigDecimal payAmount;
    /**
     * 商家实收金额
     */
    private BigDecimal actualAmount;
    /**
     * 订单金额
     */
    private BigDecimal totalAmount;
    /**
     * 支付成功时间
     */
    private String payTime;
    /**
     * 支付方式
     */
    private String payWay;
    /**
     * 订单状态
     */
    private Integer orderStatus;
    /**
     * 订单备注
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
     * 通道订单号
     */
    private String topChannelOrderNo;
    /**
     * 渠道订单号
     */
    private String channelOrderNo;
    /**
     * 付款用户id
     */
    private String userId;
    /**
     * 手续费
     */
    private BigDecimal serviceFee;
    /**
     * 商家优惠金额
     */
    private BigDecimal benefitAmount;
    /**
     * 官方优惠金额
     */
    private BigDecimal officialCouponAmount;
    /**
     * 优惠信息
     */
    @JSONField(name = "List")
    private List<Promotion> promotionList;


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

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
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

    public List<Promotion> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<Promotion> promotionList) {
        this.promotionList = promotionList;
    }


    public static class Promotion {

        private Integer type;
        private String typeDesc;
        private Integer isSellerDiscount;
        private String scope;
        private String scopeDesc;
        private String source;
        private String promotionId;
        private String promotionName;
        private BigDecimal amount;
        private BigDecimal merchantContributeAmount;
        private BigDecimal otherContributeAmount;
        private BigDecimal officialContributeAmount;

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getTypeDesc() {
            return typeDesc;
        }

        public void setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
        }

        public Integer getIsSellerDiscount() {
            return isSellerDiscount;
        }

        public void setIsSellerDiscount(Integer isSellerDiscount) {
            this.isSellerDiscount = isSellerDiscount;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getScopeDesc() {
            return scopeDesc;
        }

        public void setScopeDesc(String scopeDesc) {
            this.scopeDesc = scopeDesc;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getPromotionId() {
            return promotionId;
        }

        public void setPromotionId(String promotionId) {
            this.promotionId = promotionId;
        }

        public String getPromotionName() {
            return promotionName;
        }

        public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public BigDecimal getMerchantContributeAmount() {
            return merchantContributeAmount;
        }

        public void setMerchantContributeAmount(BigDecimal merchantContributeAmount) {
            this.merchantContributeAmount = merchantContributeAmount;
        }

        public BigDecimal getOtherContributeAmount() {
            return otherContributeAmount;
        }

        public void setOtherContributeAmount(BigDecimal otherContributeAmount) {
            this.otherContributeAmount = otherContributeAmount;
        }

        public BigDecimal getOfficialContributeAmount() {
            return officialContributeAmount;
        }

        public void setOfficialContributeAmount(BigDecimal officialContributeAmount) {
            this.officialContributeAmount = officialContributeAmount;
        }
    }
}
