package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

import java.util.List;

/**
 * 获取支行联行号
 *
 * @author lianok.com
 */
public class ApiHlBankFirmBranchResponse extends DockingResponseBase {

    private Integer pageSize;

    private Integer currentPage;

    private Integer totalCount;

    private List<BranchInfo> branch;

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

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<BranchInfo> getBranch() {
        return branch;
    }

    public void setBranch(List<BranchInfo> branch) {
        this.branch = branch;
    }

    public static class BranchInfo {

        /**
         * 联行号
         */
        private String bankNo;
        /**
         * 支行名称
         */
        private String bankName;

        public String getBankNo() {
            return bankNo;
        }

        public void setBankNo(String bankNo) {
            this.bankNo = bankNo;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }
    }
}
