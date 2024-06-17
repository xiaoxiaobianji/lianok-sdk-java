package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 非担保交易
 *
 * @author lianok.com
 */
public class ApiHlBankOrderConsumptionResponse extends DockingResponseBase {


    /**
     * 集团id
     */
    private Long firmId;

    /**
     * 银行类型，suning/wangshang
     */
    private String bankType;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 对接订单号
     */
    private String thirdOrderNo;

    /**
     * 付款交易户编号
     */
    private String payerBusinessNo;

    /**
     * 付款交易户名称
     */
    private String payerBusinessName;

    /**
     * 收款交易户编号
     */
    private String payeeBusinessNo;

    /**
     * 收款交易户名称
     */
    private String payeeBusinessName;

    /**
     * 订单总金额(1=1元)
     */
    private java.math.BigDecimal totalAmount;

    /**
     * 订单状态 0:待支付, 1:支付中, 2:支付成功, 3:交易关闭, 4:部分退款, 5:全部退款 7.退款中
     */
    private Integer orderStatus;

    /**
     * 付款时间
     */
    private java.time.LocalDateTime payTime;

    /**
     * 订单备注
     */
    private String remark;

    /**
     * 失败信息
     */
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

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
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
