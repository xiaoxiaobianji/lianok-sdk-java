package com.lianok.docking.complaint.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlComplaintNotifyInfoResponse extends DockingResponseBase {

    private String huolianLogNo;
    private String huolianComplaintNo;
    private String complaintNo;
    private String payWay;
    private Integer complaintStatus;

    private String channelCode;
    private String orderNo;
    private String businessOrderNo;
    private String channelOrderNo;
    private String topChannelOrderNo;

    private String merchantNo;
    private String topChannelMerchantNo;

    private Integer complaintType;
    private String payerPhone;
    private String complaintContent;
    private String complaintTime;

    private String operateType;

    public String getHuolianLogNo() {
        return huolianLogNo;
    }

    public void setHuolianLogNo(String huolianLogNo) {
        this.huolianLogNo = huolianLogNo;
    }

    public String getHuolianComplaintNo() {
        return huolianComplaintNo;
    }

    public void setHuolianComplaintNo(String huolianComplaintNo) {
        this.huolianComplaintNo = huolianComplaintNo;
    }

    public String getComplaintNo() {
        return complaintNo;
    }

    public void setComplaintNo(String complaintNo) {
        this.complaintNo = complaintNo;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public Integer getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(Integer complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

    public String getTopChannelOrderNo() {
        return topChannelOrderNo;
    }

    public void setTopChannelOrderNo(String topChannelOrderNo) {
        this.topChannelOrderNo = topChannelOrderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getTopChannelMerchantNo() {
        return topChannelMerchantNo;
    }

    public void setTopChannelMerchantNo(String topChannelMerchantNo) {
        this.topChannelMerchantNo = topChannelMerchantNo;
    }

    public Integer getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(Integer complaintType) {
        this.complaintType = complaintType;
    }

    public String getPayerPhone() {
        return payerPhone;
    }

    public void setPayerPhone(String payerPhone) {
        this.payerPhone = payerPhone;
    }

    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent;
    }

    public String getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(String complaintTime) {
        this.complaintTime = complaintTime;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }
}
