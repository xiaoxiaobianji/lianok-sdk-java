package com.lianok.docking.alipay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.ItemDirectModifySku;
import com.lianok.docking.alipay.response.ApiHlAlipayAppItemDirectModifyResponse;

import java.util.List;


public class ApiHlAlipayAppItemDirectModifyRequest extends AbstractDockingRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    private String itemId;
    private Long originalPrice;
    private String outItemId;
    private Long salePrice;
    private String saleStatus;
    private List<ItemDirectModifySku> skus;
    private Long stockNum;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getOutItemId() {
        return outItemId;
    }

    public void setOutItemId(String outItemId) {
        this.outItemId = outItemId;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public List<ItemDirectModifySku> getSkus() {
        return skus;
    }

    public void setSkus(List<ItemDirectModifySku> skus) {
        this.skus = skus;
    }

    public Long getStockNum() {
        return stockNum;
    }

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }

    @Override
    public Boolean getSignByObjectMethod() {
        return true;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.app.item.direct.modify";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayAppItemDirectModifyResponse.class;
    }
}
