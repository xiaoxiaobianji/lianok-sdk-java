package com.lianok.docking.withdraw.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * @author lianok.com
 */
public class ApiHlWithdrawQueryUpdateResponse extends DockingResponseBase {

    private String merchantNo;
    private BigDecimal payoutFeeRate;
    /**
     * 开通状态 0 审核中 1开通 2驳回
     */
    private Integer openStatus;

    /**
     * 驳回原因
     */
    private String rejectReason;

    /**
     * 签约链接
     */
    private String signUrl;


    public String getMerchantNo() {
        return merchantNo;
    }
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public BigDecimal getPayoutFeeRate() {return payoutFeeRate;}
    public void setPayoutFeeRate(BigDecimal payoutFeeRate) {
        this.payoutFeeRate = payoutFeeRate;
    }

    public Integer getOpenStatus() {
        return openStatus;
    }
    public void setOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
    }

    public String getRejectReason() {
        return rejectReason;
    }
    public void setRejectReason(String openStatus) {
        this.rejectReason = rejectReason;
    }

    public String getSignUrl() {
        return signUrl;
    }
    public void setSignUrl(String signUrl) {
        this.rejectReason = signUrl;
    }
}
