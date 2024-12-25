package com.lianok.docking.b2b.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlAppletB2bDownLoadBillResponse extends DockingResponseBase {

    private String merchantNo;

    private String successBillUrl;

    private String refundBillUrl;

    private String allBillUrl;

    private String fundBillUrl;

    private Integer endedDayAvailAmt;

    private Integer endedDayFrozenAmt;

    private Integer endedDayTotalAmt;


    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getSuccessBillUrl() {
        return successBillUrl;
    }

    public void setSuccessBillUrl(String successBillUrl) {
        this.successBillUrl = successBillUrl;
    }

    public String getRefundBillUrl() {
        return refundBillUrl;
    }

    public void setRefundBillUrl(String refundBillUrl) {
        this.refundBillUrl = refundBillUrl;
    }

    public String getAllBillUrl() {
        return allBillUrl;
    }

    public void setAllBillUrl(String allBillUrl) {
        this.allBillUrl = allBillUrl;
    }

    public String getFundBillUrl() {
        return fundBillUrl;
    }

    public void setFundBillUrl(String fundBillUrl) {
        this.fundBillUrl = fundBillUrl;
    }

    public Integer getEndedDayAvailAmt() {
        return endedDayAvailAmt;
    }

    public void setEndedDayAvailAmt(Integer endedDayAvailAmt) {
        this.endedDayAvailAmt = endedDayAvailAmt;
    }

    public Integer getEndedDayFrozenAmt() {
        return endedDayFrozenAmt;
    }

    public void setEndedDayFrozenAmt(Integer endedDayFrozenAmt) {
        this.endedDayFrozenAmt = endedDayFrozenAmt;
    }

    public Integer getEndedDayTotalAmt() {
        return endedDayTotalAmt;
    }

    public void setEndedDayTotalAmt(Integer endedDayTotalAmt) {
        this.endedDayTotalAmt = endedDayTotalAmt;
    }
}
