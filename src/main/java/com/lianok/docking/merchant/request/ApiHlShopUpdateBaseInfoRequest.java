package com.lianok.docking.merchant.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.merchant.response.ApiHlShopUpdateBaseInfoResponse;

/**
 * 修改基础信息
 */
public class ApiHlShopUpdateBaseInfoRequest extends AbstractDockingRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 通道标识
     */
    private String channelCode;
    /**
     * 异步通知地址
     * 审核状态有变化时会发出通知
     */
    private String notifyUrl;
    /**
     * 商户类型
     */
    private String merchantType;
    /**
     * 经营类目编码
     */
    private String mccCode;
    /**
     * 经营区域-省
     */
    private String provinceCode;
    /**
     * 经营区域-市
     */
    private String cityCode;
    /**
     * 经营区域-区
     */
    private String areaCode;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 门头照
     */
    private String shopFaceImg;
    /**
     * 内景照
     */
    private String shopInnerImg;
    /**
     * 收银台照
     */
    @JSONField(name = "shopCashdeskImg")
    private String shopCashDeskImg;

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

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getMccCode() {
        return mccCode;
    }

    public void setMccCode(String mccCode) {
        this.mccCode = mccCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShopFaceImg() {
        return shopFaceImg;
    }

    public void setShopFaceImg(String shopFaceImg) {
        this.shopFaceImg = shopFaceImg;
    }

    public String getShopInnerImg() {
        return shopInnerImg;
    }

    public void setShopInnerImg(String shopInnerImg) {
        this.shopInnerImg = shopInnerImg;
    }

    public String getShopCashDeskImg() {
        return shopCashDeskImg;
    }

    public void setShopCashDeskImg(String shopCashDeskImg) {
        this.shopCashDeskImg = shopCashDeskImg;
    }

    @Override
    public String getResource() {
        return "api.hl.shop.updateBaseInfo";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopUpdateBaseInfoResponse.class;
    }
}
