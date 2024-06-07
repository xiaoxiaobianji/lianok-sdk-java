package com.lianok.entry.complaint.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlComplaintRefundRequest extends AbstractEntryRequest {


    private String merchantNo;

    private String huolianComplaintNo;

    private String replyContent;

    private String replyImage;

    private String actionType;

    private String operatorUserAccount;

    private String remark;

    @Override
    public String getResource() {
        return "api.hl.complaint.refund";
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

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getOperatorUserAccount() {
        return operatorUserAccount;
    }

    public void setOperatorUserAccount(String operatorUserAccount) {
        this.operatorUserAccount = operatorUserAccount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
