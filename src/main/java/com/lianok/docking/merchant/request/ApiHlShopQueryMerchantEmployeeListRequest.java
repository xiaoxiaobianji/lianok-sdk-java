package com.lianok.docking.merchant.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.merchant.response.ApiHlShopQueryMerchantEmployeeListResponse;

public class ApiHlShopQueryMerchantEmployeeListRequest extends AbstractDockingRequest {

    private String merchantNo;
    private String shopNo;
    private String employeeName;
    private int pageSize;
    private int currentPage;

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

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
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
