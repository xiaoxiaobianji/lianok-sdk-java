package com.lianok.entry.merchant.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlShopQuerySwipeCardStatusResponse;

/**
 * 查询刷卡信息
 *
 * @author lianok.com
 */
public class ApiHlShopQuerySwipeCardStatusRequest extends AbstractEntryRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
     */
    private String channelCode;
    /**
     * 刷卡费率类型,目前只能传1
     */
    private Integer swipeType;

    @Override
    public String getResource() {
        return "api.hl.shop.querySwipeCardStatus";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopQuerySwipeCardStatusResponse.class;
    }
}
