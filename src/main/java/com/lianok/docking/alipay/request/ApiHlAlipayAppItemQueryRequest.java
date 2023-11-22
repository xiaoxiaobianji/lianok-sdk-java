package com.lianok.docking.alipay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.response.ApiHlAlipayAppItemQueryResponse;


public class ApiHlAlipayAppItemQueryRequest extends AbstractDockingRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    private String itemId;
    private Long needEditSpu;
    private String outItemId;

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

    public Long getNeedEditSpu() {
        return needEditSpu;
    }

    public void setNeedEditSpu(Long needEditSpu) {
        this.needEditSpu = needEditSpu;
    }

    public String getOutItemId() {
        return outItemId;
    }

    public void setOutItemId(String outItemId) {
        this.outItemId = outItemId;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.app.item.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayAppItemQueryResponse.class;
    }
}
