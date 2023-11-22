package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.CertificatePrepareInfo;

import java.util.List;


public class ApiHlAlipayCertPrePareUseResponse extends DockingResponseBase {

    /**
     * 凭证信息列表
     */
    private List<CertificatePrepareInfo> certificatePrepareInfoList;

    /**
     * 凭证归属支付宝用户openId
     */
    private String openId;

    /**
     * 购买商品的订单id，核销接口使用
     */
    private String orderId;

    /**
     * 凭证归属支付宝用户id，核销接口使用
     */
    private String userId;

    public List<CertificatePrepareInfo> getCertificatePrepareInfoList() {
        return certificatePrepareInfoList;
    }

    public void setCertificatePrepareInfoList(List<CertificatePrepareInfo> certificatePrepareInfoList) {
        this.certificatePrepareInfoList = certificatePrepareInfoList;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
