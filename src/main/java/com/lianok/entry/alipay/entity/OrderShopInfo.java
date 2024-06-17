package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class OrderShopInfo {
    private String address;
    private String alipayShopId;
    private List<OrderExtInfo> extInfo;
    private String merchantShopId;
    private String merchantShopLinkPage;
    private String name;
    private String phoneNum;
    private String type;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAlipayShopId() {
        return alipayShopId;
    }

    public void setAlipayShopId(String alipayShopId) {
        this.alipayShopId = alipayShopId;
    }

    public List<OrderExtInfo> getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(List<OrderExtInfo> extInfo) {
        this.extInfo = extInfo;
    }

    public String getMerchantShopId() {
        return merchantShopId;
    }

    public void setMerchantShopId(String merchantShopId) {
        this.merchantShopId = merchantShopId;
    }

    public String getMerchantShopLinkPage() {
        return merchantShopLinkPage;
    }

    public void setMerchantShopLinkPage(String merchantShopLinkPage) {
        this.merchantShopLinkPage = merchantShopLinkPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
