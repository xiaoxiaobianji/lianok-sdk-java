package com.lianok.docking.request.applet;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.applet.ApiHLMerchantWxpayConfigResponse;

/**
 * 配置小程序AppId
 * 第一次使用微信小程序支付时需要和同主体商户做绑定关系
 *
 * @author linshu
 * @create 2022/11/1 11:32
 */
public class ApiHLMerchantWxpayConfigRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.merchant.wxpayconfig";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLMerchantWxpayConfigResponse.class;
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
     * 微信小程序appId
     *
     */
    @JSONField(name = "appid")
    private String appId;
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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }
}
