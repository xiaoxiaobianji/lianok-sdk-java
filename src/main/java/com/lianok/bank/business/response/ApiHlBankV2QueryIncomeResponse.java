package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlBankV2QueryIncomeResponse extends DockingResponseBase {

    private Integer total;
    private Integer currentPage;
    private Integer pageSize;
    private List<Income> data;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<Income> getData() {
        return data;
    }

    public void setData(List<Income> data) {
        this.data = data;
    }

    public static class Income {
        private Long id;
        private Long firmId;
        private String accountType;
        private BigDecimal tranAmount;
        private String bankCardNo;
        private String bankCardName;
        private String tranDate;
        private String tranTime;
        private String bankName;
        private String remark;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getFirmId() {
            return firmId;
        }

        public void setFirmId(Long firmId) {
            this.firmId = firmId;
        }

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public BigDecimal getTranAmount() {
            return tranAmount;
        }

        public void setTranAmount(BigDecimal tranAmount) {
            this.tranAmount = tranAmount;
        }

        public String getBankCardNo() {
            return bankCardNo;
        }

        public void setBankCardNo(String bankCardNo) {
            this.bankCardNo = bankCardNo;
        }

        public String getBankCardName() {
            return bankCardName;
        }

        public void setBankCardName(String bankCardName) {
            this.bankCardName = bankCardName;
        }

        public String getTranDate() {
            return tranDate;
        }

        public void setTranDate(String tranDate) {
            this.tranDate = tranDate;
        }

        public String getTranTime() {
            return tranTime;
        }

        public void setTranTime(String tranTime) {
            this.tranTime = tranTime;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
