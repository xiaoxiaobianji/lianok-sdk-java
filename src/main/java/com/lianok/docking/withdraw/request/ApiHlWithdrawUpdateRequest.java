package com.lianok.docking.withdraw.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.withdraw.response.ApiHlWithdrawOpenResponse;
import com.lianok.docking.withdraw.response.ApiHlWithdrawUpdateResponse;

import java.math.BigDecimal;

/**
 * 易分账-提现卡绑定
 *
 * @author lianok.com
 */
public class ApiHlWithdrawUpdateRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;

    /**
     * 通道标识
     */
    private String channelCode;

    /**
     * 业务类型
     * D0：当日到账；当日交易资金当天可取现到账；
     * T1：下个工作日到账；
     * D1：下个自然日到账；
     * DM：当日到账；到账资金不包括当天的交易资金；
     */
    private String cashType;

    /**
     * 提现手续费
     */
    private BigDecimal payoutFee;

    /**
     * 提现费率
     */
    private BigDecimal payoutFeeRate;


    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getCashType() {
        return cashType;
    }

    public void setCashType(String cashType) {
        this.cashType = cashType;
    }

    public BigDecimal getPayoutFee() {
        return payoutFee;
    }

    public void setPayoutFee(BigDecimal payoutFee) {
        this.payoutFee = payoutFee;
    }

    public BigDecimal getPayoutFeeRate() {
        return payoutFeeRate;
    }

    public void setPayoutFeeRate(BigDecimal payoutFeeRate) {
        this.payoutFeeRate = payoutFeeRate;
    }

    @Override
    public String getResource() {
        return "api.hl.withdraw.update";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlWithdrawUpdateResponse.class;
    }
}
