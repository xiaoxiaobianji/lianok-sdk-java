package com.lianok.docking.enums;

import cn.hutool.core.util.StrUtil;

/**
 * @author linshu
 * @create 2023/9/16 17:24
 */
public enum BankCardTypeEnum {

    /**
     * 借记卡
     */
    DEBIT("DEBIT"),
    /**
     * 信用卡
     */
    CREDIT("CREDIT"),
    ;

    private final String cardType;


    BankCardTypeEnum(String cardType) {
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }

    public static BankCardTypeEnum getCardTypeEnum(String cardType) {
        if (StrUtil.isBlank(cardType)) {
            return null;
        }
        for (BankCardTypeEnum value : values()) {
            if (cardType.equals(value.getCardType())) {
                return value;
            }
        }
        return null;
    }
}
