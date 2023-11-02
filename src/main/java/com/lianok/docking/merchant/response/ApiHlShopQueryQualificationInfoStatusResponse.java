package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

import java.time.LocalDateTime;

public class ApiHlShopQueryQualificationInfoStatusResponse extends DockingResponseBase {

    private Integer status;
    private String reason;
    private LocalDateTime recordTime;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(LocalDateTime recordTime) {
        this.recordTime = recordTime;
    }
}
