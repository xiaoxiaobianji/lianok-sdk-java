package com.lianok.docking.pay.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlOrderPayWeiqifuResponse extends DockingResponseBase {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 操作者账号
     */
    private String operatorAccount;
    /**
     * 火脸订单号
     */
    private String orderNo;
    /**
     * 业务订单号
     */
    private String businessOrderNo;
    /**
     * 支付类型：
     * activeScan：主扫二维码支付
     * applet：小程序支付
     * app：App支付
     * h5：H5支付
     */
    private String payType;
    /**
     * 支付链接
     */
    private String payUrl;
    /**
     * 小程序appid
     */
    private String mpAppid;
    /**
     * 小程序路径
     */
    private String mpPath;
    /**
     * 小程序原始id
     */
    private String mpUsername;
    /**
     * 小程序版本
     */
    private String mpVersion;

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

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getMpAppid() {
        return mpAppid;
    }

    public void setMpAppid(String mpAppid) {
        this.mpAppid = mpAppid;
    }

    public String getMpPath() {
        return mpPath;
    }

    public void setMpPath(String mpPath) {
        this.mpPath = mpPath;
    }

    public String getMpUsername() {
        return mpUsername;
    }

    public void setMpUsername(String mpUsername) {
        this.mpUsername = mpUsername;
    }

    public String getMpVersion() {
        return mpVersion;
    }

    public void setMpVersion(String mpVersion) {
        this.mpVersion = mpVersion;
    }
}
