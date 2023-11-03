package com.lianok.docking.pay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.pay.response.ApiHlOrderPayBankResponse;

import java.math.BigDecimal;

/**
 * 银行卡支付
 */
public class ApiHlOrderPayBankRequest extends AbstractDockingRequest {

    /**
     * 对接商系统订单号
     */
    private String businessOrderNo;
    /**
     * 订单支付金额
     */
    private BigDecimal payAmount;
    /**
     * 订单备注
     */
    private String remark;
    /**
     * 商户ID
     */
    private String merchantNo;
    /**
     * 操作者账号
     */
    private String operatorAccount;
    /**
     * 收银设备ID
     */
    private String deviceNo;
    /**
     * 异步通知地址
     */
    private String notifyUrl;
    /**
     * 商品名称
     */
    private String subject;
    /**
     * 支付方式
     * 枚举：com.lianok.docking.enums.PayWayEnum
     * <p>
     * 支持的类型，b2c_bank，b2b_bank，quick_pay
     */
    private String payWay;
    /**
     * 银行卡绑定的手机号
     */
    private String phone;
    /**
     * 订单失效时间
     */
    private Integer payExpireTime;
    /**
     * 支付成功页面跳转地址
     */
    private String pageNotifyUrl;
    /**
     * 银行卡信息
     * {\"bankCardNo\":\"4666********8888\",\"cardName\":\"张三\",\"idCardNo\":\"110011***********3\",\"mobilePhoneNo\":\"182********\"}
     */
    private String bankCard;
    /**
     * 银行卡类型
     * 枚举：com.lianok.docking.enums.BankCardTypeEnum
     */
    private String cardType;

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPayExpireTime() {
        return payExpireTime;
    }

    public void setPayExpireTime(Integer payExpireTime) {
        this.payExpireTime = payExpireTime;
    }

    public String getPageNotifyUrl() {
        return pageNotifyUrl;
    }

    public void setPageNotifyUrl(String pageNotifyUrl) {
        this.pageNotifyUrl = pageNotifyUrl;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String getResource() {
        return "api.hl.order.pay.bank";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderPayBankResponse.class;
    }
}
