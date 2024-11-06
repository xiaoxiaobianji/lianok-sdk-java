package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlBankV2CityResponse extends DockingResponseBase {

    private Integer total;
    private Integer currentPage;
    private Integer pageSize;

    private List<BankV2NameInfo> data;

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

    public List<BankV2NameInfo> getData() {
        return data;
    }

    public void setData(List<BankV2NameInfo> data) {
        this.data = data;
    }
}
