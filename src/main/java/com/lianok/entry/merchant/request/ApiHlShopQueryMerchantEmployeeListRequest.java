package com.lianok.entry.merchant.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlShopQueryMerchantEmployeeListResponse;

/**
 * @author lianok.com
 */
public class ApiHlShopQueryMerchantEmployeeListRequest extends AbstractEntryRequest {

    private String merchantNo;
    private String shopNo;
    private String employeeName;
    private Integer pageSize;
    private Integer currentPage;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    @Override
    public String getResource() {
        return "api.hl.shop.queryMerchantEmployeeList";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopQueryMerchantEmployeeListResponse.class;
    }
}
