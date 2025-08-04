package com.lianok.docking.balanceApply.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * @author lianok.com
 */
public class ApiHlBalanceApplyQueryAccountInfoResponse extends DockingResponseBase {

    private String merchantNo;
    private BigDecimal totalAccountBalance;
    private String accountInfoList;


    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public BigDecimal getTotalAccountBalance() {return totalAccountBalance;}

    public void setTotalAccountBalance(BigDecimal totalAccountBalance) {this.totalAccountBalance = totalAccountBalance;}

    public String getAccountInfoList() {
        return accountInfoList;
    }

    public void setAccountInfoList(String operatorAccount) {
        this.accountInfoList = operatorAccount;
    }
}
