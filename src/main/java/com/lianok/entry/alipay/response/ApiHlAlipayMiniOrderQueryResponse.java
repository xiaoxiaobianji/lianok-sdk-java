package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.*;


/**
 * @author lianok.com
 */
public class ApiHlAlipayMiniOrderQueryResponse extends DockingResponseBase {

    private AddressInfo addressInfo;
    private ContactInfo contactInfo;
    private String createTime;
    private AddressInfo defaultReceivingAddress;
    private DeliveryDetailInfo deliveryDetail;
    private String merchantBizType;
    private String openId;
    private OrderDetailInfo orderDetail;
    private String outOrderId;
    private String path;
    private String receiveTime;
    private RefundInfo refundInfo;
    private String settleType;
    private String status;
    private String tradeNo;
    private String userId;

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AddressInfo getDefaultReceivingAddress() {
        return defaultReceivingAddress;
    }

    public void setDefaultReceivingAddress(AddressInfo defaultReceivingAddress) {
        this.defaultReceivingAddress = defaultReceivingAddress;
    }

    public DeliveryDetailInfo getDeliveryDetail() {
        return deliveryDetail;
    }

    public void setDeliveryDetail(DeliveryDetailInfo deliveryDetail) {
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

    public OrderDetailInfo getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetailInfo orderDetail) {
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

    public RefundInfo getRefundInfo() {
        return refundInfo;
    }

    public void setRefundInfo(RefundInfo refundInfo) {
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
