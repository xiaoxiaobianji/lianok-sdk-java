package com.lianok.docking.pay.request;

import com.alibaba.fastjson.JSON;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.request.ApiHlShareOrderCreateRequest;
import com.lianok.docking.pay.response.ApiHlOrderRefundOperationResponse;

import java.math.BigDecimal;
import java.util.List;

/**
 * 退款接口
 *
 * @author lianok.com
 */
public class ApiHlOrderRefundOperationRequest extends AbstractDockingRequest {

    /**
     * 火脸订单号，
     * 火脸订单号可在火脸服务商后台-订单管理-交易流水或商家后台-订单管理-交易流水中查看
     */
    private String orderNo;
    /**
     * 对接商系统订单号，
     * 由对接商自行定义规范，最大长度不超过64
     */
    private String businessOrderNo;
    /**
     * 对接商系统退单号，
     * 由对接商自行定义规范，最大长度不超过64
     */
    private String businessRefundNo;
    /**
     * 渠道订单号，
     * 如乐刷订单号、随行付订单号等
     */
    private String channelOrderNo;
    /**
     * 退款金额，
     * 单位为元，精确到0.01
     */
    private BigDecimal refundAmount;
    /**
     * 退单备注
     */
    private String remark;
    /**
     * 退款密码（管理密码），
     * 退款密码限制6位，管理密码在商户初次注册时会以短信形式发送到注册手机号，也可在火脸商户后台点击右上角头像-修改密码的管理密码进行修改。在商户后台，员工管理中也支持配置、修改收银员的管理密码
     */
    private String refundPassword;
    /**
     * 商户ID，
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    private String merchantNo;
    /**
     * 操作者账号，
     * 收银员手机号。手机号一般为商户注册火脸时的手机号。在火脸商户后台员工管理中，可配置收银员，收银员登陆支持手机号登陆。可在商户后台-员工管理中查看所有收银员的手机号。
     */
    private String operatorAccount;
    /**
     * 收银设备ID,
     * 火脸后台的收银设备ID为火脸后台录入的收银设备的设备ID。可在火脸服务商后台-设备管理或商家后台-设备管理中查看
     */
    private String deviceNo;
    /**
     * 异步通知地址
     */
    private String notifyUrl;

    private Integer shareRefundMode;
    private String refundDetails;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getBusinessRefundNo() {
        return businessRefundNo;
    }

    public void setBusinessRefundNo(String businessRefundNo) {
        this.businessRefundNo = businessRefundNo;
    }

    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRefundPassword() {
        return refundPassword;
    }

    public void setRefundPassword(String refundPassword) {
        this.refundPassword = refundPassword;
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

    public Integer getShareRefundMode() {
        return shareRefundMode;
    }

    public void setShareRefundMode(Integer shareRefundMode) {
        this.shareRefundMode = shareRefundMode;
    }

    public String getRefundDetails() {
        return refundDetails;
    }

    public void setRefundDetails(List<ShareRefundDetail> refundDetails) {
        this.refundDetails = JSON.toJSONString(refundDetails);
    }

    @Override
    public String getResource() {
        return "api.hl.order.refund.operation";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderRefundOperationResponse.class;
    }


    public static class ShareRefundDetail {
        /**
         * 渠道编号
         */
        private String receiveChannelCode;
        /**
         * 商户编号
         */
        private String receiveMerchantNo;
        /**
         * 退款金额
         */
        private BigDecimal refundAmount;

        public String getReceiveChannelCode() {
            return receiveChannelCode;
        }

        public void setReceiveChannelCode(String receiveChannelCode) {
            this.receiveChannelCode = receiveChannelCode;
        }

        public String getReceiveMerchantNo() {
            return receiveMerchantNo;
        }

        public void setReceiveMerchantNo(String receiveMerchantNo) {
            this.receiveMerchantNo = receiveMerchantNo;
        }

        public BigDecimal getRefundAmount() {
            return refundAmount;
        }

        public void setRefundAmount(BigDecimal refundAmount) {
            this.refundAmount = refundAmount;
        }
    }
}
