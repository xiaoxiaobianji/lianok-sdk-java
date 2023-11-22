package com.lianok.docking.alipay.entity;

import java.util.Date;

public class CertificatePrepareInfo {

    /**
     * 凭证实例的金额信息，在异常场景下可能为空，需要判断是否有值才可进行使用。
     */
    private CertificateInstanceAmountInfo amountInfo;

    /**
     * 凭证id
     */
    private String certificateId;

    /**
     * 加密券码，核销接口使用
     */
    private String encryptedCode;

    /**
     * 商品信息
     */
    private CertificateSkuInfo skuInfo;

    /**
     * 券的有效期开始时间
     */
    private Date validBeginTime;

    /**
     * 券的有效期结束时间
     */
    private Date validEndTime;

    public CertificateInstanceAmountInfo getAmountInfo() {
        return amountInfo;
    }

    public void setAmountInfo(CertificateInstanceAmountInfo amountInfo) {
        this.amountInfo = amountInfo;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getEncryptedCode() {
        return encryptedCode;
    }

    public void setEncryptedCode(String encryptedCode) {
        this.encryptedCode = encryptedCode;
    }

    public CertificateSkuInfo getSkuInfo() {
        return skuInfo;
    }

    public void setSkuInfo(CertificateSkuInfo skuInfo) {
        this.skuInfo = skuInfo;
    }

    public Date getValidBeginTime() {
        return validBeginTime;
    }

    public void setValidBeginTime(Date validBeginTime) {
        this.validBeginTime = validBeginTime;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }
}
