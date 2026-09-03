package com.lianok.entry.merchant.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlFlowQueryResponse;

import java.time.LocalDate;

/**
 * 对账单查询
 *
 * @author lianok.com
 */
public class ApiHlFlowQueryRequest extends AbstractEntryRequest {

    /**
     * 查询日期
     */
    private LocalDate billDate;

    private String merchantNo;

    private Integer currentPage;

    private Integer pageSize;

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
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


    @Override
    public String getResource() {
        return "api.hl.flow.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlFlowQueryResponse.class;
    }

}
