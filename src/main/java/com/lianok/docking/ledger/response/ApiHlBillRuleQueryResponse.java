package com.lianok.docking.ledger.response;

import com.lianok.core.entity.DockingResponseBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * 分账规则查询
 *
 * @author lianok.com
 */
public class ApiHlBillRuleQueryResponse extends DockingResponseBase {

    private List<MerchantShareRuleResponseVO> ruleList;

    public List<MerchantShareRuleResponseVO> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<MerchantShareRuleResponseVO> ruleList) {
        this.ruleList = ruleList;
    }

    public static class MerchantShareRuleResponseVO implements Serializable {

        private String receiveMerchantNo;
        private LocalDate ruleEffectiveDate;
        private LocalDate ruleExpiredDate;
        private Integer sharePercent;
        private BigDecimal maxShareAmount;
        private BigDecimal maxMonthShareAmount;
        private Integer shareRuleStatus;

        public String getReceiveMerchantNo() {
            return receiveMerchantNo;
        }

        public void setReceiveMerchantNo(String receiveMerchantNo) {
            this.receiveMerchantNo = receiveMerchantNo;
        }

        public LocalDate getRuleEffectiveDate() {
            return ruleEffectiveDate;
        }

        public void setRuleEffectiveDate(LocalDate ruleEffectiveDate) {
            this.ruleEffectiveDate = ruleEffectiveDate;
        }

        public LocalDate getRuleExpiredDate() {
            return ruleExpiredDate;
        }

        public void setRuleExpiredDate(LocalDate ruleExpiredDate) {
            this.ruleExpiredDate = ruleExpiredDate;
        }

        public Integer getSharePercent() {
            return sharePercent;
        }

        public void setSharePercent(Integer sharePercent) {
            this.sharePercent = sharePercent;
        }

        public BigDecimal getMaxShareAmount() {
            return maxShareAmount;
        }

        public void setMaxShareAmount(BigDecimal maxShareAmount) {
            this.maxShareAmount = maxShareAmount;
        }

        public BigDecimal getMaxMonthShareAmount() {
            return maxMonthShareAmount;
        }

        public void setMaxMonthShareAmount(BigDecimal maxMonthShareAmount) {
            this.maxMonthShareAmount = maxMonthShareAmount;
        }

        public Integer getShareRuleStatus() {
            return shareRuleStatus;
        }

        public void setShareRuleStatus(Integer shareRuleStatus) {
            this.shareRuleStatus = shareRuleStatus;
        }

        @Override
        public String toString() {
            return "MerchantShareRuleResponseVO {receiveMerchantNo='" + receiveMerchantNo
                    + "',ruleEffectiveDate='" + ruleEffectiveDate
                    + "',ruleExpiredDate='" + ruleExpiredDate
                    + "',sharePercent=" + sharePercent
                    + ",maxShareAmount=" + maxShareAmount
                    + ",maxMonthShareAmount=" + maxMonthShareAmount
                    + ",shareRuleStatus=" + shareRuleStatus + "}";
        }
    }
}
