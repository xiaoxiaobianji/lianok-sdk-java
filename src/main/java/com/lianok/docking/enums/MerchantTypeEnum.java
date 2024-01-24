package com.lianok.docking.enums;

public enum MerchantTypeEnum {

    /**
     * 企业商户
     */
    ENTERPRISE("enterprise"),
    /**
     * 个体工商户
     */
    INDIVIDUAL("individual"),
    /**
     * 个人/小微商户
     */
    PERSONAL("personal");

    private final String merchantType;

    MerchantTypeEnum(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getMerchantType() {
        return this.merchantType;
    }
}
