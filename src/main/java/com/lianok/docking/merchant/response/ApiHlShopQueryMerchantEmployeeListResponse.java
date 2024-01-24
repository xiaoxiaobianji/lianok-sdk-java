package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopQueryMerchantEmployeeListResponse extends DockingResponseBase {

    private String name;
    private String loginAccount;
    private String userNo;
    private String shopNo;
    private String shopName;
    private String roleType;
    private String refundSuperPassword;
    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRefundSuperPassword() {
        return refundSuperPassword;
    }

    public void setRefundSuperPassword(String refundSuperPassword) {
        this.refundSuperPassword = refundSuperPassword;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
