package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankCheckoutWithdrawalResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 金额提现
 *
 * @author lianok.com
 */
public class ApiHlBankCheckoutWithdrawalRequest extends AbstractDockingRequest {

    private String ip;
    /**
     * 账户编号
     */
    private String businessNo;
    /**
     * 提现金额
     */
    private String amount;
    /**
     * 摘要
     */
    private String memo;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.checkout.withdrwawal";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankCheckoutWithdrawalResponse.class;
    }
}
