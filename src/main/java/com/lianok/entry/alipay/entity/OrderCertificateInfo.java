package com.lianok.entry.alipay.entity;

/**
 * @author lianok.com
 */
public class OrderCertificateInfo {

    /**
     * 本地商品对应的凭证id
     */
    private String certificateId;

    /**
     * 本地生活商品凭证生效日期
     */
    private String gmtActive;

    /**
     * 本地生活商品凭证失效日期
     */
    private String gmtExpired;

    /**
     * 本地生活商品凭证核销时间
     */
    private String useTime;

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getGmtActive() {
        return gmtActive;
    }

    public void setGmtActive(String gmtActive) {
        this.gmtActive = gmtActive;
    }

    public String getGmtExpired() {
        return gmtExpired;
    }

    public void setGmtExpired(String gmtExpired) {
        this.gmtExpired = gmtExpired;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }
}
