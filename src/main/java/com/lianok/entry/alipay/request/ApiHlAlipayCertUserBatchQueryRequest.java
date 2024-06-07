package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayCertUserBatchQueryResponse;

/**
 * @author lianok.com
 */
public class ApiHlAlipayCertUserBatchQueryRequest  extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    private String belongMerchantId;
    private String certificateStatus;
    private String openId;
    private Long pageNum;
    private Long pageSize;
    private String shopId;
    private String userId;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getBelongMerchantId() {
        return belongMerchantId;
    }

    public void setBelongMerchantId(String belongMerchantId) {
        this.belongMerchantId = belongMerchantId;
    }

    public String getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
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
        return "api.hl.alipay.cert.user.batch.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayCertUserBatchQueryResponse.class;
    }
}
