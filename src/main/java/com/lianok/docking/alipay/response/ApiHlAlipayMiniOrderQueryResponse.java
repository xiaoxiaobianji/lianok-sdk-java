package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.*;


public class ApiHlAlipayMiniOrderQueryResponse extends DockingResponseBase {

    private AddressInfoVO addressInfo;
    private ContactInfoVO contactInfo;
    private String createTime;
    private AddressInfoVO defaultReceivingAddress;
    private DeliveryDetailInfoVO deliveryDetail;
    private String merchantBizType;
    private String openId;
    private OrderDetailInfoVO orderDetail;
    private String outOrderId;
    private String path;
    private String receiveTime;
    private RefundInfoVO refundInfo;
    private String settleType;
    private String status;
    private String tradeNo;
    private String userId;

    public AddressInfoVO getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfoVO addressInfo) {
        this.addressInfo = addressInfo;
    }

    public ContactInfoVO getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfoVO contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AddressInfoVO getDefaultReceivingAddress() {
        return defaultReceivingAddress;
    }

    public void setDefaultReceivingAddress(AddressInfoVO defaultReceivingAddress) {
        this.defaultReceivingAddress = defaultReceivingAddress;
    }

    public DeliveryDetailInfoVO getDeliveryDetail() {
        return deliveryDetail;
    }

    public void setDeliveryDetail(DeliveryDetailInfoVO deliveryDetail) {
        this.deliveryDetail = deliveryDetail;
    }

    public String getMerchantBizType() {
        return merchantBizType;
    }

    public void setMerchantBizType(String merchantBizType) {
        this.merchantBizType = merchantBizType;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public OrderDetailInfoVO getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetailInfoVO orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public RefundInfoVO getRefundInfo() {
        return refundInfo;
    }

    public void setRefundInfo(RefundInfoVO refundInfo) {
        this.refundInfo = refundInfo;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
