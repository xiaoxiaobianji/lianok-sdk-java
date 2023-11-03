package com.lianok.docking.ledger.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

public class ApiHlBillAccountBalanceQueryResponse extends DockingResponseBase {

    /**
     * 商户ID
     */
    private String merchantNo;
    /**
     * 分账方商户号
     */
    private String channelMerchantNo;
    /**
     * 总的待分账余额
     * 总的待分账余额-其他不可用余额-冻结额，即为可分账余额
     */
    private BigDecimal balanceAmount;
    /**
     * 冻结金额
     */
    private BigDecimal frozenAmount;
    /**
     * 其他不可用余额
     */
    private BigDecimal unavailableAmount;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelMerchantNo() {
        return channelMerchantNo;
    }

    public void setChannelMerchantNo(String channelMerchantNo) {
        this.channelMerchantNo = channelMerchantNo;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BigDecimal balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public BigDecimal getUnavailableAmount() {
        return unavailableAmount;
    }

    public void setUnavailableAmount(BigDecimal unavailableAmount) {
        this.unavailableAmount = unavailableAmount;
    }
}
