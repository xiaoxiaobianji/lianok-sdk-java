package com.lianok.docking.balanceApply.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBalanceApplyReceiverApplyResponse extends DockingResponseBase {

    private String merchantNo;
    private String requestNo;
    private String ledgerNo;
    private String status;


    public String getMerchantNo() {
        return merchantNo;
    }
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getRequestNo() {
        return requestNo;
    }
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getLedgerNo() {
        return ledgerNo;
    }
    public void setLedgerNo(String ledgerNo) {
        this.ledgerNo = ledgerNo;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
