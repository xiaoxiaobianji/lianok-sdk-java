package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayCertRefundResponse;

import java.util.Date;
import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlAlipayCertRefundRequest extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    private Date bizDt;
    /** @deprecated */
    @Deprecated
    private String code;
    private String openId;
    /** @deprecated */
    @Deprecated
    private String orderId;
    private String outBizNo;
    private List<String> useOrderNoList;
    private String userId;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public Date getBizDt() {
        return bizDt;
    }

    public void setBizDt(Date bizDt) {
        this.bizDt = bizDt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public List<String> getUseOrderNoList() {
        return useOrderNoList;
    }

    public void setUseOrderNoList(List<String> useOrderNoList) {
        this.useOrderNoList = useOrderNoList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.cert.refund";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayCertRefundResponse.class;
    }
}
