package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankFirmBranchResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 获取支行联行号
 *
 * @author lianok.com
 */
public class ApiHlBankFirmBranchRequest extends AbstractDockingRequest {

    /**
     * 真实ip
     */
    private String ip;

    /**
     * 城市代码
     */
    private String cityCode;

    /**
     * 联行号
     */
    private String bankNo;

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 行别代码
     */
    private String bankCategory;

    /**
     * 当前页码
     */
    private Integer currentPage;

    /**
     * 每页条数
     */
    private Integer pageSize;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getBankCategory() {
        return bankCategory;
    }

    public void setBankCategory(String bankCategory) {
        this.bankCategory = bankCategory;
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
        return "api.hl.bank.firm.branch";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankFirmBranchResponse.class;
    }
}
