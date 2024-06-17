package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class JourneyLocation {
    private String aoiId;
    private String city;
    private List<OrderExtInfo> extInfo;
    private String locationId;
    private String locationIdType;
    private String merchantDivisionId;
    private String merchantId;
    private String merchantPoi;
    private String name;
    private String poiId;

    public String getAoiId() {
        return aoiId;
    }

    public void setAoiId(String aoiId) {
        this.aoiId = aoiId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<OrderExtInfo> getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(List<OrderExtInfo> extInfo) {
        this.extInfo = extInfo;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationIdType() {
        return locationIdType;
    }

    public void setLocationIdType(String locationIdType) {
        this.locationIdType = locationIdType;
    }

    public String getMerchantDivisionId() {
        return merchantDivisionId;
    }

    public void setMerchantDivisionId(String merchantDivisionId) {
        this.merchantDivisionId = merchantDivisionId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantPoi() {
        return merchantPoi;
    }

    public void setMerchantPoi(String merchantPoi) {
        this.merchantPoi = merchantPoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoiId() {
        return poiId;
    }

    public void setPoiId(String poiId) {
        this.poiId = poiId;
    }
}
