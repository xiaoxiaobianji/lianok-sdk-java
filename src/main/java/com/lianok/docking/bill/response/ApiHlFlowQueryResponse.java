package com.lianok.docking.bill.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlShopQueryBranchShopListResponse;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlFlowQueryResponse extends DockingResponseBase {

    private Integer totalCount;
    private Integer pageSize;
    private Integer currentPage;
    public List<ApiHlFlowQueryResponse.ApiHlFlowInfo> flowList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<ApiHlFlowQueryResponse.ApiHlFlowInfo> getFlowList() {
        return flowList;
    }

    public void setFlowList(List<ApiHlFlowQueryResponse.ApiHlFlowInfo> flowList) {
        this.flowList = flowList;
    }

    public static class ApiHlFlowInfo {
        /**
         * 流水单号
         */
        private String flowNo;

        /**
         * 交易单号，入金业务订单号
         */
        private String orderNo;

        /**
         * 火脸业务单号，不同业务对应不同订单号
         */
        private String businessNo;

        /**
         * 渠道订单号
         */
        private String channelOrderNo;

        /**
         * 官方单号
         */
        private String topChannelOrderNo;

        /**
         * 对接方单号，外部流水号
         */
        private String businessOrderNo;


        /**
         * 门店编号
         */
        private String shopNo;

        /**
         * 门店名称
         */
        private String shopName;

        /**
         * 门店简称
         */
        private String shopShortName;

        /**
         * 员工编号
         */
        private String cashierNo;

        /**
         * 员工简称
         */
        private String cashierName;

        /**
         * 交易类型（收款/退款/预授权/延时结算冻资/延时结算完成）
         */
        private String businessType;

        private String businessTypeName;

        /**
         * 交易通道（乐刷、随行付）
         */
        private String payChannel;

        /**
         * 交易状态（成功、失败、处理中）
         */
        private Integer orderStatus;

        /**
         * 交易模式（b扫c、小程序、刷卡）
         */
        private String payType;

        /**
         * 交易方式（支付宝、微信、银联刷卡、云闪付、现金）
         */
        private String payWay;

        private String payWayName;

        /**
         * 交易时间
         */
        private LocalDateTime payTime;

        /**
         * 用户信息
         */
        private String userId;

        /**
         * 流水金额
         */
        private BigDecimal totalAmount;

        /**
         * 官方优惠
         */
        private BigDecimal officialAmount;

        /**
         * 商家优惠
         */
        private BigDecimal benefitAmount;

        /**
         * 实收金额
         */
        private BigDecimal actualAmount;

        /**
         * 手续费
         */
        private BigDecimal serviceFee;

        /**
         * 收款工具（pos、插件、小程序、码牌）
         */
        private String payBiz;

        /**
         * 订单归属业务
         */
        private String payBizName;

        /**
         * 到账方式（T0、T1、D0、D1）
         */
        private String settleType;

        private String settleTypeName;

        /**
         * 创建时间
         */
        private LocalDateTime createTime;

        /**
         * 交易状态
         */
        private String orderStatusName;

        private String remark;


        public String getFlowNo() {
            return flowNo;
        }

        public void setFlowNo(String flowNo) {
            this.flowNo = flowNo;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getBusinessNo() {
            return businessNo;
        }

        public void setBusinessNo(String businessNo) {
            this.businessNo = businessNo;
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

        public String getBusinessOrderNo() {
            return businessOrderNo;
        }

        public void setBusinessOrderNo(String businessOrderNo) {
            this.businessOrderNo = businessOrderNo;
        }

        public String getShopNo() {
            return shopNo;
        }

        public void setShopNo(String shopNo) {
            this.shopNo = shopNo;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getShopShortName() {
            return shopShortName;
        }

        public void setShopShortName(String shopShortName) {
            this.shopShortName = shopShortName;
        }

        public String getCashierNo() {
            return cashierNo;
        }

        public void setCashierNo(String cashierNo) {
            this.cashierNo = cashierNo;
        }

        public String getCashierName() {
            return cashierName;
        }

        public void setCashierName(String cashierName) {
            this.cashierName = cashierName;
        }

        public String getBusinessType() {
            return businessType;
        }

        public void setBusinessType(String businessType) {
            this.businessType = businessType;
        }

        public String getBusinessTypeName() {
            return businessTypeName;
        }

        public void setBusinessTypeName(String businessTypeName) {
            this.businessTypeName = businessTypeName;
        }

        public String getPayChannel() {
            return payChannel;
        }

        public void setPayChannel(String payChannel) {
            this.payChannel = payChannel;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getPayType() {
            return payType;
        }

        public void setPayType(String payType) {
            this.payType = payType;
        }

        public String getPayWay() {
            return payWay;
        }

        public void setPayWay(String payWay) {
            this.payWay = payWay;
        }

        public String getPayWayName() {
            return payWayName;
        }

        public void setPayWayName(String payWayName) {
            this.payWayName = payWayName;
        }

        public LocalDateTime getPayTime() {
            return payTime;
        }

        public void setPayTime(LocalDateTime payTime) {
            this.payTime = payTime;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public BigDecimal getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(BigDecimal totalAmount) {
            this.totalAmount = totalAmount;
        }

        public BigDecimal getOfficialAmount() {
            return officialAmount;
        }

        public void setOfficialAmount(BigDecimal officialAmount) {
            this.officialAmount = officialAmount;
        }

        public BigDecimal getBenefitAmount() {
            return benefitAmount;
        }

        public void setBenefitAmount(BigDecimal benefitAmount) {
            this.benefitAmount = benefitAmount;
        }

        public BigDecimal getActualAmount() {
            return actualAmount;
        }

        public void setActualAmount(BigDecimal actualAmount) {
            this.actualAmount = actualAmount;
        }

        public BigDecimal getServiceFee() {
            return serviceFee;
        }

        public void setServiceFee(BigDecimal serviceFee) {
            this.serviceFee = serviceFee;
        }

        public String getPayBiz() {
            return payBiz;
        }

        public void setPayBiz(String payBiz) {
            this.payBiz = payBiz;
        }

        public String getPayBizName() {
            return payBizName;
        }

        public void setPayBizName(String payBizName) {
            this.payBizName = payBizName;
        }

        public String getSettleType() {
            return settleType;
        }

        public void setSettleType(String settleType) {
            this.settleType = settleType;
        }

        public String getSettleTypeName() {
            return settleTypeName;
        }

        public void setSettleTypeName(String settleTypeName) {
            this.settleTypeName = settleTypeName;
        }

        public LocalDateTime getCreateTime() {
            return createTime;
        }

        public void setCreateTime(LocalDateTime createTime) {
            this.createTime = createTime;
        }


        public String getOrderStatusName() {
            return orderStatusName;
        }

        public void setOrderStatusName(String orderStatusName) {
            this.orderStatusName = orderStatusName;
        }


        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
