package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.CertificateQueryInfo;

import java.util.List;


public class ApiHlAlipayCertUserBatchQueryResponse  extends DockingResponseBase {
    /**
     * 凭证信息列表
     */
    private List<CertificateQueryInfo> certificateInfoList;

    /**
     * 分页查询页码
     */
    private Long pageNum;

    /**
     * 分页查询单页数据条数
     */
    private Long pageSize;

    /**
     * 总数量
     */
    private Long totalSize;

    public List<CertificateQueryInfo> getCertificateInfoList() {
        return certificateInfoList;
    }

    public void setCertificateInfoList(List<CertificateQueryInfo> certificateInfoList) {
        this.certificateInfoList = certificateInfoList;
    }

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }
}
