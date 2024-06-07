package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayAppItemDeleteResponse;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppItemDeleteRequest extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    private List<String> itemIdList;
    private List<String> outItemIdList;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public List<String> getItemIdList() {
        return itemIdList;
    }

    public void setItemIdList(List<String> itemIdList) {
        this.itemIdList = itemIdList;
    }

    public List<String> getOutItemIdList() {
        return outItemIdList;
    }

    public void setOutItemIdList(List<String> outItemIdList) {
        this.outItemIdList = outItemIdList;
    }
    
    @Override
    public String getResource() {
        return "api.hl.alipay.app.item.delete";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayAppItemDeleteResponse.class;
    }
}
