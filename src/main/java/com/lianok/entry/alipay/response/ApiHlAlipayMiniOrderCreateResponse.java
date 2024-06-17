package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;


/**
 * @author lianok.com
 */
public class ApiHlAlipayMiniOrderCreateResponse extends DockingResponseBase {

    /**
     * 组件下单单号
     */
    private String channelOrderNo;

    /**
     * 交易订单号
     */
    private String officeOrderNo;

    /**
     * 支付信息
     */
    private String jspayInfo;

    /**
     * 火脸支付订单号
     */
    private String orderNo;

    /**
     * 对接方业务订单号
     */
    private String businessOrderNo;

    /**
     * 操作账号,手机号或自定义登录账号
     */
    private String operatorAccount;

    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

    public String getOfficeOrderNo() {
        return officeOrderNo;
    }

    public void setOfficeOrderNo(String officeOrderNo) {
        this.officeOrderNo = officeOrderNo;
    }

    public String getJspayInfo() {
        return jspayInfo;
    }

    public void setJspayInfo(String jspayInfo) {
        this.jspayInfo = jspayInfo;
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

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }
}
