package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlBankV2SetProtocolResponse extends DockingResponseBase {

    private String businessNo;
    private Boolean finish;
    private List<String> protocols;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }

    public List<String> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }
}
