package com.lianok.bank.enums;

/**
 * 证件类型
 *
 * @author lianok.com
 */
public enum IdTypeEnum {
    /**
     * 身份证
     */
    ID_CARD("10"),
    /**
     * 统一社会信用代码
     */
    BUSINESS_CODE("20"),

    ;

    private final String type;

    IdTypeEnum(String type) {
        this.type = type;
    }


    public String getType() {
        return this.type;
    }
}
