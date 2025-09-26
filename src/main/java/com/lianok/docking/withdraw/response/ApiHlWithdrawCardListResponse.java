package com.lianok.docking.withdraw.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlWithdrawCardListResponse extends DockingResponseBase {

    private String merchantNo;
    private String bankCardAccountList;


    public String getMerchantNo() {
        return merchantNo;
    }
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getBankCardAccountList() {return bankCardAccountList;}
    public void setBankCardAccountList(String bankCardAccountList) {
        this.bankCardAccountList = bankCardAccountList;
    }
}
