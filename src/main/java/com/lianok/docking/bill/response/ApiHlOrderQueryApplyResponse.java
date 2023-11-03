package com.lianok.docking.bill.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlOrderQueryApplyResponse extends DockingResponseBase {

    private Integer id;
    private String agentNo;
    private String merchantNo;
    private String billDate;
    private String downIdentification;
    private Integer downType;
    private Integer state;
    private String downloadUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getDownIdentification() {
        return downIdentification;
    }

    public void setDownIdentification(String downIdentification) {
        this.downIdentification = downIdentification;
    }

    public Integer getDownType() {
        return downType;
    }

    public void setDownType(Integer downType) {
        this.downType = downType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
