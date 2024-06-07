package com.lianok.entry.alipay.entity;

/**
 * @author lianok.com
 */
public class OrderLogisticsInformationRequest {
    private String logisticsCode;
    private String trackingNo;

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }
}
