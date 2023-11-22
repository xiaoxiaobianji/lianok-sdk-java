package com.lianok.docking.alipay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.response.ApiHlAlipayAppItemAllCategoryQueryResponse;


public class ApiHlAlipayAppItemAllCategoryQueryRequest extends AbstractDockingRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    /**
     * 商品类型
     * 枚举值 * 售卖类（实物）: 1 * 租赁类（实物）: 2 * 付费充值/兑换类（虚拟）: 3
     */
    private String itemType;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.app.item.all.category.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayAppItemAllCategoryQueryResponse.class;
    }
}
