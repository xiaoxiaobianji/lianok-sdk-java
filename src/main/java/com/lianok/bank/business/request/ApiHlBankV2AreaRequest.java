package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2AreaResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBankV2AreaRequest extends AbstractDockingRequest {

    private Integer currentPage;
    private String cityCode;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.area";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2AreaResponse.class;
    }
}
