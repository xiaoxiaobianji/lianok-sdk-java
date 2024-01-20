package com.lianok.docking.pay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.pay.response.ApiHlOrderPayH5Response;

import java.math.BigDecimal;

/**
 * H5预下单
 * 适用于用户选择支付方式(微信或支付宝)完成下单操作后跳转到H5页面完成支付的场景。
 */
public class ApiHlOrderPayH5Request extends AbstractDockingRequest {

    /**
     * 对接商系统订单号，
     * 由对接商自行定义规范，最大长度不超过64
     */
    private String businessOrderNo;
    /**
     * 订单支付金额，
     * 单位为元，精确到0.01
     */
    private BigDecimal payAmount;
    /**
     * 订单备注
     */
    private String remark;
    /**
     * 商户ID，
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    private String merchantNo;
    /**
     * 操作者账号，
     * 收银员手机号。手机号一般为商户注册火脸时的手机号。在火脸商户后台员工管理中，可配置收银员，收银员登陆支持手机号登陆。可在商户后台-员工管理中查看所有收银员的手机号。
     */
    private String operatorAccount;
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
     * com.lianok.docking.enums.PayWayEnum
     */
    private String payWay;
    /**
     * 支付成功页面跳转地址
     */
    private String pageNotifyUrl;

    private String itemAmount;
    private String itemQuantity;
    /**
     * 客户端用户IP
     */
    private String clientIp;

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

    public String getPageNotifyUrl() {
        return pageNotifyUrl;
    }

    public void setPageNotifyUrl(String pageNotifyUrl) {
        this.pageNotifyUrl = pageNotifyUrl;
    }

    public String getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(String itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    @Override
    public String getResource() {
        return "api.hl.order.pay.h5";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderPayH5Response.class;
    }
}
