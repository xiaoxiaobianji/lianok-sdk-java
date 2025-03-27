package com.lianok.docking.pay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.pay.response.ApiHlOrderPayAuthCodeGetOpenIdResponse;

/**
 * 通过微信支付条码获取用户openid
 *
 * @author lianok.com
 */
public class ApiHlOrderPayAuthCodeGetOpenIdRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    private String merchantNo;
    /**
     * 支付条码
     */
    private String payBarcode;
    /**
     * 支付方式
     */
    private String payWay;

    public String getPayBarcode() {
        return payBarcode;
    }

    public void setPayBarcode(String payBarcode) {
        this.payBarcode = payBarcode;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    @Override
    public String getResource() {
        return "api.hl.order.pay.authCodeGetOpenId";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderPayAuthCodeGetOpenIdResponse.class;
    }

}
