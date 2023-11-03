package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopEntryStatusResponse extends DockingResponseBase {

    /**
     * 渠道商户号
     */
    private String channelMerchantNo;
    /**
     * 微信子商户号
     */
    private String wechatMerchantNo;
    /**
     * 支付宝子商户号
     */
    private String alipayMerchantNo;
    /**
     * 进件状态
     */
    private Integer status;
    /**
     * 驳回原因
     */
    private String rejectReason;
    /**
     * 渠道认证二维码 审核通过后返回
     */
    private String qrcodeData;
    /**
     * 商户管理密码
     */
    private String refundPassword;

    public String getChannelMerchantNo() {
        return channelMerchantNo;
    }

    public void setChannelMerchantNo(String channelMerchantNo) {
        this.channelMerchantNo = channelMerchantNo;
    }

    public String getWechatMerchantNo() {
        return wechatMerchantNo;
    }

    public void setWechatMerchantNo(String wechatMerchantNo) {
        this.wechatMerchantNo = wechatMerchantNo;
    }

    public String getAlipayMerchantNo() {
        return alipayMerchantNo;
    }

    public void setAlipayMerchantNo(String alipayMerchantNo) {
        this.alipayMerchantNo = alipayMerchantNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getQrcodeData() {
        return qrcodeData;
    }

    public void setQrcodeData(String qrcodeData) {
        this.qrcodeData = qrcodeData;
    }

    public String getRefundPassword() {
        return refundPassword;
    }

    public void setRefundPassword(String refundPassword) {
        this.refundPassword = refundPassword;
    }
}
