package com.lianok.docking.request.applet;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.applet.ApiHLMerchantSwitchChannelResponse;

/**
 * 开通小程序支付
 * 指定小程序支付使用的渠道
 *
 * @author linshu
 * @create 2022/11/1 11:17
 */
public class ApiHLMerchantSwitchChannelRequest extends DockingRequestBase {

    @Override
    public String getApiName() {
        return "api.hl.merchant.switchChannel";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLMerchantSwitchChannelResponse.class;
    }

    /**
     * 商户ID
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    @JSONField(name = "merchantNo")
    private String merchantNo;
    /**
     * 操作者账号
     * 收银员手机号或收银员登陆账号。手机号一般为商户注册火脸时的手机号。在火脸商户后台员工管理中，可配置收银员，收银员登陆支持手机号和账号登陆。可在商户后台-员工管理中查看所有收银员的手机号、登陆账号
     */
    @JSONField(name = "operatorAccount")
    private String operatorAccount;
    /**
     * 支付类型
     * com.lianok.docking.enums.PayWayEnum
     */
    @JSONField(name = "payWay")
    private String payWay;
    /**
     * 支付方式
     * com.lianok.docking.enums.PayStyleEnum
     */
    @JSONField(name = "payStyle")
    private String payStyle;
    /**
     * 渠道编号
     * com.lianok.docking.enums.ChannelEnum
     */
    @JSONField(name = "channelCode")
    private String channelCode;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(String payStyle) {
        this.payStyle = payStyle;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

}
