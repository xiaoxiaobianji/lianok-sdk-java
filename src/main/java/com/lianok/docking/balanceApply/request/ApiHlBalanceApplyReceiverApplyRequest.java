package com.lianok.docking.balanceApply.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.balanceApply.response.ApiHlBalanceApplyReceiverApplyResponse;

/**
 * 余额分账-入账方申请
 *
 * @author lianok.com
 */
public class ApiHlBalanceApplyReceiverApplyRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;

    /**
     * 请求流水号
     */
    private String requestNo;

    /**
     * 通道标识
     */
    private String channelCode;

    /**
     * 入账方类型
     */
    private String type;

    /**
     * 入账方名称
     */
    private String receiverName;

    /**
     * 证件号码
     */
    private String licenceNo;

    /**
     * 总行编码
     */
    private String bankCode;

    /**
     * 银行账户信息
     */
    private String bankCardNo;

    /**
     * 入账方标签
     */
    private String label;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 法人名称
     */
    private String legalName;

    /**
     * 法人证件号码
     */
    private String legalLicenceNo;

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

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalLicenceNo() {
        return legalLicenceNo;
    }

    public void setLegalLicenceNo(String legalLicenceNo) {
        this.legalLicenceNo = legalLicenceNo;
    }

    @Override
    public String getResource() {
        return "api.hl.balance.apply.receiverApply";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBalanceApplyReceiverApplyResponse.class;
    }
}
