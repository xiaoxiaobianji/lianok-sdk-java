package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * @author lianok.com
 */
public class ApiHlBankV2PayResponse extends DockingResponseBase {

    private Long firmId;
    private String bankType;
    private String orderNo;
    private String thirdOrderNo;
    private String payerBusinessNo;
    private String payerBusinessName;
    private String payeeBusinessNo;
    private String payeeBusinessName;
    private BigDecimal totalAmount;
    private Integer orderStatus;
    private String payTime;
    private String remark;
    private String failMsg;

    public Long getFirmId() {
        return firmId;
    }

    public void setFirmId(Long firmId) {
        this.firmId = firmId;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getThirdOrderNo() {
        return thirdOrderNo;
    }

    public void setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
    }

    public String getPayerBusinessNo() {
        return payerBusinessNo;
    }

    public void setPayerBusinessNo(String payerBusinessNo) {
        this.payerBusinessNo = payerBusinessNo;
    }

    public String getPayerBusinessName() {
        return payerBusinessName;
    }

    public void setPayerBusinessName(String payerBusinessName) {
        this.payerBusinessName = payerBusinessName;
    }

    public String getPayeeBusinessNo() {
        return payeeBusinessNo;
    }

    public void setPayeeBusinessNo(String payeeBusinessNo) {
        this.payeeBusinessNo = payeeBusinessNo;
    }

    public String getPayeeBusinessName() {
        return payeeBusinessName;
    }

    public void setPayeeBusinessName(String payeeBusinessName) {
        this.payeeBusinessName = payeeBusinessName;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFailMsg() {
        return failMsg;
    }

    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg;
    }
}
