package com.lianok.entry.alipay.entity;

import java.util.Date;

/**
 * @author lianok.com
 */
public class CertificateQueryInfo {

    /**
     * 凭证实例的金额信息，在异常场景下可能为空，需要判断是否有值才可进行使用。
     */
    private CertificateInstanceAmountInfo amountInfo;

    /**
     * 当前凭证是否可用，如传入门店id，则会判断当前门店、当前时间是否可使用此凭证；如未传入门店id，仅返回当前时间是否可使用。
     */
    private String canUse;

    /**
     * 用户凭证id
     */
    private String certificateId;

    /**
     * 三方码凭证券码。
     */
    private String code;

    /**
     * 商家侧核销对应的交易订单id
     */
    private String outOrderId;

    /**
     * 商品信息
     */
    private CertificateSkuInfo skuInfo;

    /**
     * 状态
     */
    private String status;

    /**
     * 核销规则
     */
    private CertificateUseRuleInfo useRuleInfo;

    /**
     * 开始生效时间
     */
    private Date validBeginTime;

    /**
     * 过期时间
     */
    private Date validEndTime;

    public CertificateInstanceAmountInfo getAmountInfo() {
        return amountInfo;
    }

    public void setAmountInfo(CertificateInstanceAmountInfo amountInfo) {
        this.amountInfo = amountInfo;
    }

    public String getCanUse() {
        return canUse;
    }

    public void setCanUse(String canUse) {
        this.canUse = canUse;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public CertificateSkuInfo getSkuInfo() {
        return skuInfo;
    }

    public void setSkuInfo(CertificateSkuInfo skuInfo) {
        this.skuInfo = skuInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CertificateUseRuleInfo getUseRuleInfo() {
        return useRuleInfo;
    }

    public void setUseRuleInfo(CertificateUseRuleInfo useRuleInfo) {
        this.useRuleInfo = useRuleInfo;
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
