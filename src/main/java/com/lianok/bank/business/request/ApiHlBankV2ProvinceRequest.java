package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2ProvinceResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 查询支行省份
 *
 * @author lianok.com
 */
public class ApiHlBankV2ProvinceRequest extends AbstractDockingRequest {

    private Integer currentPage;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.province";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2ProvinceResponse.class;
    }
}
