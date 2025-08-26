package com.lianok.docking.balanceApply.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBalanceApplyReceiverUpdateResponse extends DockingResponseBase {

    private String merchantNo;
    private String requestNo;
    private String ledgerNo;


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
}
