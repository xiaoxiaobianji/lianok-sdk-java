package com.lianok.entry.merchant.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlShopUpdateShopShortNameResponse;

/**
 * 修改商户简称
 *
 * @author lianok.com
 */
public class ApiHlShopUpdateShopShortNameRequest extends AbstractEntryRequest {

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
     * 异步通知地址
     * 审核状态有变化时会发出通知
     */
    private String notifyUrl;
    /**
     * 商户简称
     */
    private String merchantShortName;
    /**
     * 资料变更申请书
     */
    private String changeFormImg;

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

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getMerchantShortName() {
        return merchantShortName;
    }

    public void setMerchantShortName(String merchantShortName) {
        this.merchantShortName = merchantShortName;
    }

    public String getChangeFormImg() {
        return changeFormImg;
    }

    public void setChangeFormImg(String changeFormImg) {
        this.changeFormImg = changeFormImg;
    }

    @Override
    public String getResource() {
        return "api.hl.shop.updateShopShortName";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopUpdateShopShortNameResponse.class;
    }
}
