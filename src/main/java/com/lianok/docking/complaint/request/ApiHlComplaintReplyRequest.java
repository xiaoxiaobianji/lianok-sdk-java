package com.lianok.docking.complaint.request;


import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

public class ApiHlComplaintReplyRequest extends AbstractDockingRequest {

    private String merchantNo;

    private String huolianComplaintNo;

    private String operationLogNo;

    private String replyToLogNo;

    private String replyContent;

    private String replyImage;

    private String operatorUserAccount;

    private String operatorUserName;

    private String operateOrigin;

    private String actionType;

    @Override
    public Boolean getSignByJsonStringMethod() {
        return true;
    }

    @Override
    public String getResource() {
        return "api.hl.complaint.reply";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return DockingResponseBase.class;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getHuolianComplaintNo() {
        return huolianComplaintNo;
    }

    public void setHuolianComplaintNo(String huolianComplaintNo) {
        this.huolianComplaintNo = huolianComplaintNo;
    }

    public String getOperationLogNo() {
        return operationLogNo;
    }

    public void setOperationLogNo(String operationLogNo) {
        this.operationLogNo = operationLogNo;
    }

    public String getReplyToLogNo() {
        return replyToLogNo;
    }

    public void setReplyToLogNo(String replyToLogNo) {
        this.replyToLogNo = replyToLogNo;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyImage() {
        return replyImage;
    }

    public void setReplyImage(String replyImage) {
        this.replyImage = replyImage;
    }

    public String getOperatorUserAccount() {
        return operatorUserAccount;
    }

    public void setOperatorUserAccount(String operatorUserAccount) {
        this.operatorUserAccount = operatorUserAccount;
    }

    public String getOperatorUserName() {
        return operatorUserName;
    }

    public void setOperatorUserName(String operatorUserName) {
        this.operatorUserName = operatorUserName;
    }

    public String getOperateOrigin() {
        return operateOrigin;
    }

    public void setOperateOrigin(String operateOrigin) {
        this.operateOrigin = operateOrigin;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
}