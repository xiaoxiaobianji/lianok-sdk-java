package com.lianok.docking.complaint.response;

import com.lianok.core.entity.DockingResponseBase;

import java.time.LocalDateTime;

public class ApiHlComplaintLogResponse extends DockingResponseBase {

    private String huolianComplaintNo;

    private String huolianLogNo;

    private String logNo;

    private String operateType;

    private String replyContent;


    private String replyImage;

    //@DateTimeFormat(pattern = DatePattern.NORM_DATETIME_PATTERN)
    //@JsonFormat(pattern = DatePattern.NORM_DATETIME_PATTERN,timezone="GMT+8")
    private java.time.LocalDateTime operateTime;

    public String getHuolianComplaintNo() {
        return huolianComplaintNo;
    }

    public void setHuolianComplaintNo(String huolianComplaintNo) {
        this.huolianComplaintNo = huolianComplaintNo;
    }

    public String getHuolianLogNo() {
        return huolianLogNo;
    }

    public void setHuolianLogNo(String huolianLogNo) {
        this.huolianLogNo = huolianLogNo;
    }

    public String getLogNo() {
        return logNo;
    }

    public void setLogNo(String logNo) {
        this.logNo = logNo;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
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

    public LocalDateTime getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(LocalDateTime operateTime) {
        this.operateTime = operateTime;
    }
}
