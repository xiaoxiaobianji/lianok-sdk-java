package com.lianok.docking.enums;

import com.lianok.core.utils.StrUtils;

/**
 * 银行卡类型枚举
 *
 * @author lianok.com
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
        if (StrUtils.isEmpty(cardType)) {
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
