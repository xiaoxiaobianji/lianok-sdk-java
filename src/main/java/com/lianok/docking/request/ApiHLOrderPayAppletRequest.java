package com.lianok.docking.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ApiHLOrderPayAppletResponse;

import java.math.BigDecimal;

/**
 * @author linshu
 * @create 2022/8/22 17:55
 */
public class ApiHLOrderPayAppletRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.order.pay.applet";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLOrderPayAppletResponse.class;
    }

    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "operatorAccount")
    private String operatorAccount;
    @JSONField(name = "businessOrderNo")
    private String businessOrderNo;
    @JSONField(name = "payAmount")
    private BigDecimal payAmount;
    @JSONField(name = "payWay")
    private String payWay;
    @JSONField(name = "appId")
    private String appId;
    @JSONField(name = "openId")
    private String openId;
    @JSONField(name = "userId")
    private String userId;
    @JSONField(name = "deviceNo")
    private String deviceNo;
    @JSONField(name = "remark")
    private String remark;
    @JSONField(name = "notifyUrl")
    private String notifyUrl;
    @JSONField(name = "subject")
    private String subject;
    @JSONField(name = "payExpireTime")
    private Integer payExpireTime;
    @JSONField(name = "stageNum")
    private Integer stageNum;
    @JSONField(name = "goodsTag")
    private String goodsTag;
    @JSONField(name = "goods_info")
    private Object goodsInfo;

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

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getPayExpireTime() {
        return payExpireTime;
    }

    public void setPayExpireTime(Integer payExpireTime) {
        this.payExpireTime = payExpireTime;
    }

    public Integer getStageNum() {
        return stageNum;
    }

    public void setStageNum(Integer stageNum) {
        this.stageNum = stageNum;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public Object getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(Object goodsInfo) {
        this.goodsInfo = goodsInfo;
    }
}
