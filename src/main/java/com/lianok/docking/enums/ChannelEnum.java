package com.lianok.docking.enums;

/**
 * @author linshu
 * @create 2022/11/1 11:37
 */
public enum ChannelEnum {
    /**
     * 乐刷
     */
    LESHUA,
    /**
     * 乐刷线上
     */
    LESHUAONLINE,
    /**
     * 支付宝
     */
    ALIPAY,
    /**
     * 微信
     */
    WECHAT,
    /**
     * 银盛
     */
    YSEPAY,
    /**
     * 随行付
     */
    SUIXINGFU,
    /**
     * 合利宝
     */
    HELIBAO;

    public static String getEnumValue(ChannelEnum channelEnum) {
        switch (channelEnum) {
            case LESHUA:
                return "leShua";
            case LESHUAONLINE:
                return "leShuaOnline";
            case ALIPAY:
                return "alipay";
            case WECHAT:
                return "wechat";
            case YSEPAY:
                return "ysepay";
            case SUIXINGFU:
                return "suiXingFu";
            case HELIBAO:
                return "heLiBao";
            default:
                return null;
        }
    }
}
