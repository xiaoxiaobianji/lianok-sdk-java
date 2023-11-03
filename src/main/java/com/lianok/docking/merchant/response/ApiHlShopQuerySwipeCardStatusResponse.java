package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ApiHlShopQuerySwipeCardStatusResponse extends DockingResponseBase {

    private Integer status;
    private String reason;
    private LocalDateTime recordTime;
    private BigDecimal unionDebitRate;
    private BigDecimal unionCreditRate;

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

    public BigDecimal getUnionDebitRate() {
        return unionDebitRate;
    }

    public void setUnionDebitRate(BigDecimal unionDebitRate) {
        this.unionDebitRate = unionDebitRate;
    }

    public BigDecimal getUnionCreditRate() {
        return unionCreditRate;
    }

    public void setUnionCreditRate(BigDecimal unionCreditRate) {
        this.unionCreditRate = unionCreditRate;
    }
}
