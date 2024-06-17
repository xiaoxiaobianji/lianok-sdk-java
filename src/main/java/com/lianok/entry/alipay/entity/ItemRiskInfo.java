package com.lianok.entry.alipay.entity;

import java.util.Date;

/**
 * @author lianok.com
 */
public class ItemRiskInfo {
    /**
     * 该商品最近一次审核完结时间
     */
    private Date auditTime;

    /**
     * 具体问题描述
     */
    private Reasons riskInfos;

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Reasons getRiskInfos() {
        return riskInfos;
    }

    public void setRiskInfos(Reasons riskInfos) {
        this.riskInfos = riskInfos;
    }
}
