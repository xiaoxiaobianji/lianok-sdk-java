package com.lianok.entry.merchant.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlShopEntryStatusResponse;

/**
 * 商户进件查询
 * <p>
 * 商户入件后通过商户编号和对应通道编码，查询该商户入件状态。
 *
 * @author lianok.com
 */
public class ApiHlShopEntryStatusRequest extends AbstractEntryRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
     */
    private String channelCode;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    @Override
    public String getResource() {
        return "api.hl.shop.entryStatus";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopEntryStatusResponse.class;
    }
}
