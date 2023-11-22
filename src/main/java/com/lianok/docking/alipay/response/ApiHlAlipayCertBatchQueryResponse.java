package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.CertificateQueryInfo;

import java.util.List;


public class ApiHlAlipayCertBatchQueryResponse extends DockingResponseBase {

    /**
     * 凭证信息列表
     */
    private List<CertificateQueryInfo> certificateInfoList;

    public List<CertificateQueryInfo> getCertificateInfoList() {
        return certificateInfoList;
    }

    public void setCertificateInfoList(List<CertificateQueryInfo> certificateInfoList) {
        this.certificateInfoList = certificateInfoList;
    }
}
