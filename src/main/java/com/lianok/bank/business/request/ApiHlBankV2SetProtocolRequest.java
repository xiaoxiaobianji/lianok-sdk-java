package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2SetProtocolResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBankV2SetProtocolRequest extends AbstractDockingRequest {

    private String businessNo;
    private String clientIp;
    private String macAddress;
    private Integer signChannel;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Integer getSignChannel() {
        return signChannel;
    }

    public void setSignChannel(Integer signChannel) {
        this.signChannel = signChannel;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.setprotocol";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2SetProtocolResponse.class;
    }
}
