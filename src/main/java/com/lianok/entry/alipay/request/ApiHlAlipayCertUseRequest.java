package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.CertificateUseInfo;
import com.lianok.entry.alipay.response.ApiHlAlipayCertUseResponse;

import java.util.Date;
import java.util.List;


/**
 * @author lianok.com
 */
public class ApiHlAlipayCertUseRequest  extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    private Date bizDt;
    private List<CertificateUseInfo> certificateUseInfoList;
    @Deprecated
    private String code;
    private String openId;
    private String orderId;
    private String outBizNo;
    private String outOrderId;
    private String shopId;
    private String userId;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public Date getBizDt() {
        return bizDt;
    }

    public void setBizDt(Date bizDt) {
        this.bizDt = bizDt;
    }

    public List<CertificateUseInfo> getCertificateUseInfoList() {
        return certificateUseInfoList;
    }

    public void setCertificateUseInfoList(List<CertificateUseInfo> certificateUseInfoList) {
        this.certificateUseInfoList = certificateUseInfoList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.cert.use";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayCertUseResponse.class;
    }
}
