package com.lianok.entry.complaint.response;

import com.lianok.core.entity.DockingResponseBase;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlComplaintListQueryResponse extends DockingResponseBase {

    private Integer pageNo;

    private Integer pageSize;

    private Integer totalCount;

    private List<ApiHlComplaintListQueryPageResponse> complaintList;

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

    public List<ApiHlComplaintListQueryPageResponse> getComplaintList() {
        return complaintList;
    }

    public void setComplaintList(List<ApiHlComplaintListQueryPageResponse> complaintList) {
        this.complaintList = complaintList;
    }
}
