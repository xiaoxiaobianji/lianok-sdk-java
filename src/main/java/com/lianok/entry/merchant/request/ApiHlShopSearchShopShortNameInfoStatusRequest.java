package com.lianok.entry.merchant.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlShopSearchShopShortNameInfoStatusResponse;

/**
 * 查询商户简称修改状态
 *
 * @author lianok.com
 */
public class ApiHlShopSearchShopShortNameInfoStatusRequest extends AbstractEntryRequest {

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
    public String getResource() {
        return "api.hl.shop.searchShopShortNameInfoStatus";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopSearchShopShortNameInfoStatusResponse.class;
    }
}
