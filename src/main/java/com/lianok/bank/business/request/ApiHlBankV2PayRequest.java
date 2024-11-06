package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2PayResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBankV2PayRequest extends AbstractDockingRequest {

    private String thirdOrderNo;
    private String payeeBusinessNo;
    private String payerBusinessNo;
    private String amount;
    private String remark;

    public String getThirdOrderNo() {
        return thirdOrderNo;
    }

    public void setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
    }

    public String getPayeeBusinessNo() {
        return payeeBusinessNo;
    }

    public void setPayeeBusinessNo(String payeeBusinessNo) {
        this.payeeBusinessNo = payeeBusinessNo;
    }

    public String getPayerBusinessNo() {
        return payerBusinessNo;
    }

    public void setPayerBusinessNo(String payerBusinessNo) {
        this.payerBusinessNo = payerBusinessNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.pay";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2PayResponse.class;
    }


}
