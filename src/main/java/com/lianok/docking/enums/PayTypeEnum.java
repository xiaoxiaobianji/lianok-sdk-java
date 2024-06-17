package com.lianok.docking.enums;

import com.lianok.core.utils.StrUtils;

/**
 * 支付方式枚举
 *
 * @author lianok.com
 */
public enum PayTypeEnum {
    /**
     * 用户扫商户二维码
     */
    ACTIVESCAN("activeScan"),
    /**
     * 商户扫用户付款码
     */
    PASSIVESCAN("passiveScan"),
    /**
     * 刷脸支付
     */
    FACESCAN("faceScan"),
    /**
     * 银联刷卡
     */
    POS("pos"),
    /**
     * 小程序
     */
    APPLET("applet"),
    /**
     * 银行卡支付
     */
    BANK("bank"),
    ;

    private final String type;

    PayTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static PayTypeEnum getPayTypeEnum(String type) {
        if (StrUtils.isEmpty(type)) {
            return null;
        }
        for (PayTypeEnum value : values()) {
            if (type.equals(value.getType())) {
                return value;
            }
        }
        return null;
    }
}
