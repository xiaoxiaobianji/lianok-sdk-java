package com.lianok.docking.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ApiHLOrderPayBarcodeResponse;

import java.math.BigDecimal;

/**
 * @author linshu
 * @create 2022/8/22 17:55
 */
public class ApiHLOrderPayBarcodeRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.order.pay.barcode";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLOrderPayBarcodeResponse.class;
    }

    @JSONField(name = "payBarcode")
    private String payBarcode;
    @JSONField(name = "businessOrderNo")
    private String businessOrderNo;
    @JSONField(name = "payAmount")
    private BigDecimal payAmount;
    @JSONField(name = "remark")
    private String remark;
    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "operatorAccount")
    private String operatorAccount;
    @JSONField(name = "deviceNo")
    private String deviceNo;
    @JSONField(name = "notifyUrl")
    private String notifyUrl;
    @JSONField(name = "stageNum")
    private Integer stageNum;
    @JSONField(name = "subject")
    private String subject;
    @JSONField(name = "limitPay")
    private Integer limitPay;
    @JSONField(name = "payExpireTime")
    private Integer payExpireTime;
    @JSONField(name = "goodsTag")
    private String goodsTag;
    @JSONField(name = "goodsInfo")
    private String goodsInfo;

    public String getPayBarcode() {
        return payBarcode;
    }

    public void setPayBarcode(String payBarcode) {
        this.payBarcode = payBarcode;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

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

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Integer getStageNum() {
        return stageNum;
    }

    public void setStageNum(Integer stageNum) {
        this.stageNum = stageNum;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(Integer limitPay) {
        this.limitPay = limitPay;
    }

    public Integer getPayExpireTime() {
        return payExpireTime;
    }

    public void setPayExpireTime(Integer payExpireTime) {
        this.payExpireTime = payExpireTime;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }
}
