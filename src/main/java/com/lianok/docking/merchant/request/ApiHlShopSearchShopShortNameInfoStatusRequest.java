package com.lianok.docking.merchant.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.merchant.response.ApiHlShopSearchShopShortNameInfoStatusResponse;

/**
 * 查询商户简称修改状态
 */
public class ApiHlShopSearchShopShortNameInfoStatusRequest extends AbstractDockingRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
     */
    private String channelCode;

    @Override
    public Boolean getSignByJsonStringMethod() {
        return true;
    }

    @Override
    public String getResource() {
        return "api.hl.shop.searchShopShortNameInfoStatus";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopSearchShopShortNameInfoStatusResponse.class;
    }
}
