package com.lianok.docking.ledger.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * 分账开通查询
 */
public class ApiHlBillContractAccreditQueryResponse extends DockingResponseBase {

    /**
     * 分账方商户ID
     */
    private String merchantNo;
    /**
     * 电子合同链接
     */
    private String contractUrl;
    /**
     * 分账开通状态
     */
    private Integer openStatus;
    /**
     * 合同签署状态
     */
    private Integer contractStatus;

    /**
     * 商户最大分账比例
     */
    private Integer sharePercent;
    /**
     * 开通分账类型
     * 1：订单分账,2：余额分账
     */
    private Integer shareCategory;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getContractUrl() {
        return contractUrl;
    }

    public void setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl;
    }

    public Integer getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Integer getSharePercent() {
        return sharePercent;
    }

    public void setSharePercent(Integer sharePercent) {
        this.sharePercent = sharePercent;
    }

    public Integer getShareCategory() {
        return shareCategory;
    }

    public void setShareCategory(Integer shareCategory) {
        this.shareCategory = shareCategory;
    }
}
