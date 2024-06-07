package com.lianok.bank.enums;

/**
 * 交易户类型
 *
 * @author lianok.com
 */
public enum BusinessTypeEnum {

    /**
     * 个人
     */
    PERSON("person"),
    /**
     * 个人个体工商
     */
    INDIVIDUAL("individual"),
    /**
     * 企业商户
     */
    ENTERPRISE("enterprise"),
    ;

    private final String type;

    BusinessTypeEnum(String type) {
        this.type = type;
    }


    public String getType() {
        return this.type;
    }
}
