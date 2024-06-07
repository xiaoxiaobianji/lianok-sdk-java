package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayLocalItemQueryResponse;


/**
 * @author lianok.com
 */
public class ApiHlAlipayLocalItemQueryRequest extends AbstractEntryRequest {

    /**
     * 商户号
     */
    private String merchantNo;
    private String itemId;
    private String needEditSpu;
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

    public String getNeedEditSpu() {
        return needEditSpu;
    }

    public void setNeedEditSpu(String needEditSpu) {
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
        return "api.hl.alipay.local.item.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayLocalItemQueryResponse.class;
    }
}
