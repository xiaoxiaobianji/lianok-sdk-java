package com.lianok.docking.ledger.request;

import com.alibaba.fastjson.JSON;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlShareOrderCreateResponse;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单分账申请
 *
 * @author lianok.com
 */
public class ApiHlShareOrderCreateRequest extends AbstractDockingRequest {

    /**
     * 分账方商户ID
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    private String merchantNo;
    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
     */
    private String channelCode;
    /**
     * 对接商分账单号
     */
    private String billNo;
    /**
     * 对接商系统订单号
     */
    private String businessOrderNo;
    /**
     * 火脸订单号
     */
    private String orderNo;
    /**
     * 分账总金额
     */
    private BigDecimal shareAmount;
    /**
     * 分账详情
     */
    private String details;
    /**
     * 备注
     */
    private String remark;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(BigDecimal shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(List<ShareOrderDetail> details) {
        this.details = JSON.toJSONString(details);
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String getResource() {
        return "api.hl.share.order.create";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShareOrderCreateResponse.class;
    }

    public static class ShareOrderDetail {
        /**
         * 接收方渠道编号
         */
        private String receiveChannelCode;
        /**
         * 接收方商户编号
         */
        private String receiveMerchantNo;
        /**
         * 接收方分账金额
         */
        private BigDecimal shareAmount;

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

        public BigDecimal getShareAmount() {
            return shareAmount;
        }

        public void setShareAmount(BigDecimal shareAmount) {
            this.shareAmount = shareAmount;
        }
    }
}
