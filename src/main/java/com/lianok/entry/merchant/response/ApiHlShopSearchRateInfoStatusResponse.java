package com.lianok.entry.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author lianok.com
 */
public class ApiHlShopSearchRateInfoStatusResponse extends DockingResponseBase {

    private Integer status;
    private String reason;
    private LocalDateTime recordTime;
    private BigDecimal alipayRate;
    private BigDecimal wechatPayRate;
    private BigDecimal cloudPayGt1000Rate;
    private BigDecimal cloudPayLe1000Rate;

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

    public BigDecimal getAlipayRate() {
        return alipayRate;
    }

    public void setAlipayRate(BigDecimal alipayRate) {
        this.alipayRate = alipayRate;
    }

    public BigDecimal getWechatPayRate() {
        return wechatPayRate;
    }

    public void setWechatPayRate(BigDecimal wechatPayRate) {
        this.wechatPayRate = wechatPayRate;
    }

    public BigDecimal getCloudPayGt1000Rate() {
        return cloudPayGt1000Rate;
    }

    public void setCloudPayGt1000Rate(BigDecimal cloudPayGt1000Rate) {
        this.cloudPayGt1000Rate = cloudPayGt1000Rate;
    }

    public BigDecimal getCloudPayLe1000Rate() {
        return cloudPayLe1000Rate;
    }

    public void setCloudPayLe1000Rate(BigDecimal cloudPayLe1000Rate) {
        this.cloudPayLe1000Rate = cloudPayLe1000Rate;
    }
}
