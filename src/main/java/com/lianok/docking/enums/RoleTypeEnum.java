package com.lianok.docking.enums;

public enum RoleTypeEnum {

    /**
     * 店员
     */
    CASHIER("cashier"),
    /**
     * 店长
     */
    SHOP_MANAGER("shop_manager"),
    ;

    private final String roleType;

    RoleTypeEnum(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleType() {
        return this.roleType;
    }
}
