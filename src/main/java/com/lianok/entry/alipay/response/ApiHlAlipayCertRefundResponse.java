package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.CertificateReverseResult;

import java.util.List;

/**
 * @author lianok.com
 */
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
