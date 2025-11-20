package com.lianok.docking.withdraw.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.withdraw.response.ApiHlWithdrawCardModifyResponse;

/**
 * 易分账-提现卡编辑、注销
 *
 * @author lianok.com
 */
public class ApiHlWithdrawCardModifyRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;

    /**
     * 通道标识
     */
    private String channelCode;

    /**
     * 操作类型
     */
    private String bankCardOperateType;

    /**
     * 银行账号
     */
    private String accountNo;

    /**
     * 提现卡标识
     */
    private String bankCardId;

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

    public String getBankCardOperateType() {
        return bankCardOperateType;
    }

    public void setBankCardOperateType(String bankCardOperateType) {
        this.bankCardOperateType = bankCardOperateType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
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
        return "api.hl.withdraw.cardModify";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlWithdrawCardModifyResponse.class;
    }
}
