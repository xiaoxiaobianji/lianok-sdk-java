package com.lianok.docking.alipay.request;


import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.*;
import com.lianok.docking.alipay.response.ApiHlAlipayMiniOrderSyncResponse;

import java.util.Date;
import java.util.List;

public class ApiHlAlipayMiniOrderSyncRequest extends AbstractDockingRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    private String amount;
    private String buyerId;
    private UserInfomation buyerInfo;
    private String buyerOpenId;
    private String categoryId;
    private String discountAmount;
    private List<DiscountInfoData> discountInfoList;
    private List<OrderExtInfo> extInfo;
    private List<ItemOrderInfo> itemOrderList;
    private List<OrderJourneyInfo> journeyOrderList;
    private List<OrderLogisticsInformationRequest> logisticsInfoList;
    private String orderAuthCode;
    private Date orderCreateTime;
    private Date orderModifiedTime;
    private Date orderPayTime;
    private String orderType;
    private String outBizNo;
    private String partnerId;
    private String payAmount;
    private String payTimeoutExpress;
    private String recordId;
    private String sellerId;
    private String sendMsg;
    private String serviceCode;
    private OrderShopInfo shopInfo;
    private String sourceApp;
    private String syncContent;
    private TicketInfo ticketInfo;
    private List<TicketOrderInfo> ticketOrderList;
    private String tradeNo;
    private String tradeType;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public UserInfomation getBuyerInfo() {
        return buyerInfo;
    }

    public void setBuyerInfo(UserInfomation buyerInfo) {
        this.buyerInfo = buyerInfo;
    }

    public String getBuyerOpenId() {
        return buyerOpenId;
    }

    public void setBuyerOpenId(String buyerOpenId) {
        this.buyerOpenId = buyerOpenId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public List<DiscountInfoData> getDiscountInfoList() {
        return discountInfoList;
    }

    public void setDiscountInfoList(List<DiscountInfoData> discountInfoList) {
        this.discountInfoList = discountInfoList;
    }

    public List<OrderExtInfo> getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(List<OrderExtInfo> extInfo) {
        this.extInfo = extInfo;
    }

    public List<ItemOrderInfo> getItemOrderList() {
        return itemOrderList;
    }

    public void setItemOrderList(List<ItemOrderInfo> itemOrderList) {
        this.itemOrderList = itemOrderList;
    }

    public List<OrderJourneyInfo> getJourneyOrderList() {
        return journeyOrderList;
    }

    public void setJourneyOrderList(List<OrderJourneyInfo> journeyOrderList) {
        this.journeyOrderList = journeyOrderList;
    }

    public List<OrderLogisticsInformationRequest> getLogisticsInfoList() {
        return logisticsInfoList;
    }

    public void setLogisticsInfoList(List<OrderLogisticsInformationRequest> logisticsInfoList) {
        this.logisticsInfoList = logisticsInfoList;
    }

    public String getOrderAuthCode() {
        return orderAuthCode;
    }

    public void setOrderAuthCode(String orderAuthCode) {
        this.orderAuthCode = orderAuthCode;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderModifiedTime() {
        return orderModifiedTime;
    }

    public void setOrderModifiedTime(Date orderModifiedTime) {
        this.orderModifiedTime = orderModifiedTime;
    }

    public Date getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayTimeoutExpress() {
        return payTimeoutExpress;
    }

    public void setPayTimeoutExpress(String payTimeoutExpress) {
        this.payTimeoutExpress = payTimeoutExpress;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSendMsg() {
        return sendMsg;
    }

    public void setSendMsg(String sendMsg) {
        this.sendMsg = sendMsg;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public OrderShopInfo getShopInfo() {
        return shopInfo;
    }

    public void setShopInfo(OrderShopInfo shopInfo) {
        this.shopInfo = shopInfo;
    }

    public String getSourceApp() {
        return sourceApp;
    }

    public void setSourceApp(String sourceApp) {
        this.sourceApp = sourceApp;
    }

    public String getSyncContent() {
        return syncContent;
    }

    public void setSyncContent(String syncContent) {
        this.syncContent = syncContent;
    }

    public TicketInfo getTicketInfo() {
        return ticketInfo;
    }

    public void setTicketInfo(TicketInfo ticketInfo) {
        this.ticketInfo = ticketInfo;
    }

    public List<TicketOrderInfo> getTicketOrderList() {
        return ticketOrderList;
    }

    public void setTicketOrderList(List<TicketOrderInfo> ticketOrderList) {
        this.ticketOrderList = ticketOrderList;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.mini.order.sync";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayMiniOrderSyncResponse.class;
    }
}
