package com.lianok.entry.merchant.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlSettleQueryResponse;

import java.time.LocalDate;

/**
 * 对账单查询
 *
 * @author lianok.com
 */
public class ApiHlSettleQueryRequest extends AbstractEntryRequest {

    /**
     * 查询日期
     */
    private LocalDate queryBeginTime;

    private LocalDate queryEndTime;

    private String merchantNo;

    private Integer currentPage;

    private Integer pageSize;

    public LocalDate getQueryBeginTime() {
        return queryBeginTime;
    }

    public void setQueryBeginTime(LocalDate queryBeginTime) {
        this.queryBeginTime = queryBeginTime;
    }

    public LocalDate getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(LocalDate queryEndTime) {
        this.queryEndTime = queryEndTime;
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
        return "api.hl.settle.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlSettleQueryResponse.class;
    }

}
