package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.CertificateUseResult;

import java.util.List;


/**
 * @author lianok.com
 */
public class ApiHlAlipayCertUseResponse extends DockingResponseBase {

    /**
     * 凭证核销结果
     */
    private List<CertificateUseResult> certificateUseResultList;

    public List<CertificateUseResult> getCertificateUseResultList() {
        return certificateUseResultList;
    }

    public void setCertificateUseResultList(List<CertificateUseResult> certificateUseResultList) {
        this.certificateUseResultList = certificateUseResultList;
    }
}
