package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2CityResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBankV2CityRequest extends AbstractDockingRequest {


    private Integer currentPage;
    private String provinceCode;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.city";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2CityResponse.class;
    }
}
