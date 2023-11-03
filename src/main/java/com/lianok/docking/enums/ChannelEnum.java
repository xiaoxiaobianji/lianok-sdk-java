package com.lianok.docking.enums;

import com.lianok.core.utils.StrUtils;

/**
 * 渠道枚举
 */
public enum ChannelEnum {

    /**
     * 支付宝
     */
    ALIPAY("alipay"),
    /**
     * 微信
     */
    WECHAT("wechat"),
    /**
     * 乐刷
     */
    LESHUA("leShua"),
    /**
     * 乐刷线上
     */
    LESHUAONLINE("leShuaOnline"),
    /**
     * 银盛
     */
    YSEPAY("ysepay"),
    /**
     * 随行付
     */
    SUIXINGFU("suiXingFu"),
    /**
     * 合利宝
     */
    HELIBAO("heLiBao"),
    /**
     * 富友
     */
    FUIOU("fuiou"),
    /**
     * 易宝线上
     */
    YEEPAY_ONLINE("yeepayOnline"),
    /**
     * 易宝数娱
     */
    YEEPAY_PLAY("yeepayPlay"),
    ;

    ChannelEnum(String channelCode) {
        this.channelCode = channelCode;
    }

    private final String channelCode;

    public String getChannelCode() {
        return channelCode;
    }

    public static ChannelEnum getChannelEnum(String channelCode) {
        if (StrUtils.isEmpty(channelCode)) {
            return null;
        }
        for (ChannelEnum value : values()) {
            if (channelCode.equals(value.getChannelCode())) {
                return value;
            }
        }
        return null;
    }
}
