package com.lianok.docking.alipay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.response.ApiHlAlipayLocalItemTemplateQueryResponse;


public class ApiHlAlipayLocalItemTemplateQueryRequest extends AbstractDockingRequest {

    /**
     * 商户号
     */
    private String merchantNo;
    /**
     * 类目id
     * 平台类目，填写的类目必须在类目表列出，只填最后一级。商品类目 ID 及信息可通过商品类目表获取。
     */
    private String categoryId;
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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.local.item.template.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayLocalItemTemplateQueryResponse.class;
    }
}
