package com.lianok.entry.complaint.response;

import com.lianok.core.entity.DockingResponseBase;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlComplaintLogListQueryResponse extends DockingResponseBase {

    private String huolianComplaintNo;

    private Integer pageNo;

    private Integer pageSize;

    private Integer totalCount;

    private List<ApiHlComplaintLogResponse> communicationLogList;

    public String getHuolianComplaintNo() {
        return huolianComplaintNo;
    }

    public void setHuolianComplaintNo(String huolianComplaintNo) {
        this.huolianComplaintNo = huolianComplaintNo;
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

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ApiHlComplaintLogResponse> getCommunicationLogList() {
        return communicationLogList;
    }

    public void setCommunicationLogList(List<ApiHlComplaintLogResponse> communicationLogList) {
        this.communicationLogList = communicationLogList;
    }
}
