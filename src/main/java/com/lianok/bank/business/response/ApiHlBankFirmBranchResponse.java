package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * 获取支行联行号
 *
 * @author lianok.com
 */
public class ApiHlBankFirmBranchResponse extends DockingResponseBase {

    /**
     * 联行号
     */
    private String bankNo;
    /**
     * 支行名称
     */
    private String bankName;

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
