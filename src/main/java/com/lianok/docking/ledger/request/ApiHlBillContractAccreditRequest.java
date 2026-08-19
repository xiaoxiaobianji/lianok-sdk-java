package com.lianok.docking.ledger.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillContractAccreditResponse;

/**
 * 分账开通
 *
 * @author lianok.com
 */
public class ApiHlBillContractAccreditRequest extends AbstractDockingRequest {

    private String merchantNo;
    private String channelCode;
    private Integer sharePercent;
    private Integer insertFlag;
    private String notifyUrl;
    private Integer feeRate;
    private Integer shareCategory;

    private String receiveMerchant;
    private String agreementImage;
    private String scenesImage;
    private String otherImage;
    private String remark;
    private String balanceModel;
    private String payMode;
    private String busiInstruction;
    private String capitalInstruction;
    private String functionInstruction;
    private String cooperationFlowImg;
    private String enterCooperationImg;




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

    public Integer getSharePercent() {
        return sharePercent;
    }

    public void setSharePercent(Integer sharePercent) {
        this.sharePercent = sharePercent;
    }

    public Integer getInsertFlag() {
        return insertFlag;
    }

    public void setInsertFlag(Integer insertFlag) {
        this.insertFlag = insertFlag;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Integer getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(Integer feeRate) {
        this.feeRate = feeRate;
    }

    public Integer getShareCategory() {
        return shareCategory;
    }

    public void setShareCategory(Integer shareCategory) {
        this.shareCategory = shareCategory;
    }

    public String getReceiveMerchant() {
        return receiveMerchant;
    }

    public void setReceiveMerchant(String receiveMerchant) {
        this.receiveMerchant = receiveMerchant;
    }

    public String getAgreementImage() {
        return agreementImage;
    }

    public void setAgreementImage(String agreementImage) {
        this.agreementImage = agreementImage;
    }

    public String getScenesImage() {
        return scenesImage;
    }

    public void setScenesImage(String scenesImage) {
        this.scenesImage = scenesImage;
    }

    public String getOtherImage() {
        return otherImage;
    }

    public void setOtherImage(String otherImage) {
        this.otherImage = otherImage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBalanceModel() {
        return balanceModel;
    }

    public void setBalanceModel(String balanceModel) {
        this.balanceModel = balanceModel;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getBusiInstruction() {
        return busiInstruction;
    }

    public void setBusiInstruction(String busiInstruction) {
        this.busiInstruction = busiInstruction;
    }

    public String getCapitalInstruction() {
        return capitalInstruction;
    }

    public void setCapitalInstruction(String capitalInstruction) {
        this.capitalInstruction = capitalInstruction;
    }

    public String getFapitalInstruction() {
        return functionInstruction;
    }

    public void setFunctionInstruction(String functionInstruction) {
        this.functionInstruction = functionInstruction;
    }

    public String getCooperationFlowImg() {
        return cooperationFlowImg;
    }

    public void setCooperationFlowImg(String cooperationFlowImg) {
        this.cooperationFlowImg = cooperationFlowImg;
    }

    public String getEnterCooperationImg() {
        return enterCooperationImg;
    }

    public void setEnterCooperationImg(String enterCooperationImg) {
        this.enterCooperationImg = enterCooperationImg;
    }

    @Override
    public String getResource() {
        return "api.hl.bill.contract.accredit";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillContractAccreditResponse.class;
    }
}
