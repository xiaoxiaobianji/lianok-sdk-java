package com.lianok.docking.complaint.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.complaint.response.ApiHlComplaintLogListQueryResponse;

import java.time.LocalDateTime;


public class ApiHlComplaintLogListQueryRequest extends AbstractDockingRequest {

    private String merchantNo;

    private String huolianComplaintNo;

    private LocalDateTime beginTime;

    private LocalDateTime endTime;

    private Integer pageNo;

    private Integer pageSize;

    @Override
    public String getResource() {
        return "api.hl.complaint.log.list.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlComplaintLogListQueryResponse.class;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getHuolianComplaintNo() {
        return huolianComplaintNo;
    }

    public void setHuolianComplaintNo(String huolianComplaintNo) {
        this.huolianComplaintNo = huolianComplaintNo;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
