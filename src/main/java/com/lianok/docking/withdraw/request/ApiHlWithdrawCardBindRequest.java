package com.lianok.docking.withdraw.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.withdraw.response.ApiHlWithdrawCardBindResponse;
import com.lianok.docking.withdraw.response.ApiHlWithdrawCardListResponse;

/**
 * 易分账-提现卡绑定
 *
 * @author lianok.com
 */
public class ApiHlWithdrawCardBindRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;

    /**
     * 通道标识
     */
    private String channelCode;

    /**
     * 卡类型
     */
    private String bankCardType;

    /**
     * 银行账号
     */
    private String accountNo;

    /**
     * 总行编码
     */
    private String bankCode;

    /**
     * 支行编码
     */
    private String branchCode;

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

    public String getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }



    @Override
    public String getResource() {
        return "api.hl.withdraw.cardBind";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlWithdrawCardBindResponse.class;
    }
}
