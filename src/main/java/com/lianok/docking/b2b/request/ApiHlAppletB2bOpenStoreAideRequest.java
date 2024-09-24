package com.lianok.docking.b2b.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.b2b.response.ApiHlAppletB2bOpenStoreAideResponse;

/**
 * @author lianok.com
 */
public class ApiHlAppletB2bOpenStoreAideRequest extends AbstractDockingRequest {


    private String merchantNo;

    private String goodsTypeList;

    private String goodsSaleList;

    private String coverNum;

    private String serviceList;

    private String description;

    private String contactName;

    private String contactPhone;

    private String contactEmail;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getGoodsTypeList() {
        return goodsTypeList;
    }

    public void setGoodsTypeList(String goodsTypeList) {
        this.goodsTypeList = goodsTypeList;
    }

    public String getGoodsSaleList() {
        return goodsSaleList;
    }

    public void setGoodsSaleList(String goodsSaleList) {
        this.goodsSaleList = goodsSaleList;
    }

    public String getCoverNum() {
        return coverNum;
    }

    public void setCoverNum(String coverNum) {
        this.coverNum = coverNum;
    }

    public String getServiceList() {
        return serviceList;
    }

    public void setServiceList(String serviceList) {
        this.serviceList = serviceList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String serviceList) {
        this.description = description;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String getResource() {
        return "api.hl.applet.b2b.openStoreAide";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAppletB2bOpenStoreAideResponse.class;
    }
}
