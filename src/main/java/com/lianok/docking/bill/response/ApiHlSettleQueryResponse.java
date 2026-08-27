package com.lianok.docking.bill.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlSettleQueryResponse extends DockingResponseBase {

    private Integer totalCount;
    private Integer pageSize;
    private Integer currentPage;
    public List<ApiHlSettleQueryResponse.ApiHlSettleInfo> settleList;

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

    public List<ApiHlSettleQueryResponse.ApiHlSettleInfo> getSettleList() {
        return settleList;
    }

    public void setSettleList(List<ApiHlSettleQueryResponse.ApiHlSettleInfo> settleList) {
        this.settleList = settleList;
    }

    public static class ApiHlSettleInfo {
        /**
         * 结算id
         */
        private Long id;
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
         * 交易日期
         */
        private String tradeDate;
        /**
         * 结算时间
         */
        private String settleDate;
        /**
         * 结算状态
         */
        private String settleStatus;
        /**
         * 结算状态名称
         */
        private String settleStatusName;
        /**
         * 结算金额
         */
        private BigDecimal totalSettleAmount;
        /**
         * 实收金额
         */
        private BigDecimal totalActualAmount;
        /**
         * 数字人民币实收金额
         */
        private BigDecimal dcpayActualAmount;
        /**
         * 总手续费
         */
        private BigDecimal totalServiceFee;
        /**
         * 分账金额
         */
        private BigDecimal shareAmount;
        /**
         * 交易通道
         */
        private String channelCode;
        /**
         * 交易通道名称
         */
        private String channelCodeCN;
        /**
         * 开户行
         */
        private String bankBranchName;
        /**
         * 银行卡号
         */
        private String bankCardNo;
        /**
         * 开户名
         */
        private String bankAccountName;
        /**
         * 失败原因
         */
        private String failReason;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
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

        public String getTradeDate() {
            return tradeDate;
        }

        public void setTradeDate(String tradeDate) {
            this.tradeDate = tradeDate;
        }

        public String getSettleDate() {
            return settleDate;
        }

        public void setSettleDate(String settleDate) {
            this.settleDate = settleDate;
        }

        public String getSettleStatus() {
            return settleStatus;
        }

        public void setSettleStatus(String settleStatus) {
            this.settleStatus = settleStatus;
        }

        public String getSettleStatusName() {
            return settleStatusName;
        }

        public void setSettleStatusName(String settleStatusName) {
            this.settleStatusName = settleStatusName;
        }

        public BigDecimal getTotalSettleAmount() {
            return totalSettleAmount;
        }

        public void setTotalSettleAmount(BigDecimal totalSettleAmount) {
            this.totalSettleAmount = totalSettleAmount;
        }

        public BigDecimal getTotalActualAmount() {
            return totalActualAmount;
        }

        public void setTotalActualAmount(BigDecimal totalActualAmount) {
            this.totalActualAmount = totalActualAmount;
        }

        public BigDecimal getDcpayActualAmount() {
            return dcpayActualAmount;
        }

        public void setDcpayActualAmount(BigDecimal dcpayActualAmount) {
            this.dcpayActualAmount = dcpayActualAmount;
        }

        public BigDecimal getTotalServiceFee() {
            return totalServiceFee;
        }

        public void setTotalServiceFee(BigDecimal totalServiceFee) {
            this.totalServiceFee = totalServiceFee;
        }

        public BigDecimal getShareAmount() {
            return shareAmount;
        }

        public void setShareAmount(BigDecimal shareAmount) {
            this.shareAmount = shareAmount;
        }

        public String getChannelCode() {
            return channelCode;
        }

        public void setChannelCode(String channelCode) {
            this.channelCode = channelCode;
        }

        public String getChannelCodeCN() {
            return channelCodeCN;
        }

        public void setChannelCodeCN(String channelCodeCN) {
            this.channelCodeCN = channelCodeCN;
        }

        public String getBankBranchName() {
            return bankBranchName;
        }

        public void setBankBranchName(String bankBranchName) {
            this.bankBranchName = bankBranchName;
        }

        public String getBankCardNo() {
            return bankCardNo;
        }

        public void setBankCardNo(String bankCardNo) {
            this.bankCardNo = bankCardNo;
        }

        public String getBankAccountName() {
            return bankAccountName;
        }

        public void setBankAccountName(String bankAccountName) {
            this.bankAccountName = bankAccountName;
        }

        public String getFailReason() {
            return failReason;
        }

        public void setFailReason(String failReason) {
            this.failReason = failReason;
        }
    }
}
