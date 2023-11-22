package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.CertificateReverseResult;

import java.util.List;


public class ApiHlAlipayCertRefundResponse extends DockingResponseBase {

    /**
     * 撤销核销结果列表
     */
    private List<CertificateReverseResult> certificateReverseResultList;

    public List<CertificateReverseResult> getCertificateReverseResultList() {
        return certificateReverseResultList;
    }

    public void setCertificateReverseResultList(List<CertificateReverseResult> certificateReverseResultList) {
        this.certificateReverseResultList = certificateReverseResultList;
    }
}
