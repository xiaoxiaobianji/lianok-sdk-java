package com.lianok.docking.alipay.entity;

import java.util.Date;
import java.util.List;

public class TicketOrderInfo {
    private JourneyLocation arrival;
    private String content;
    private JourneyLocation departure;
    private Long effectiveNum;
    private Date endTime;
    private List<OrderExtInfo> extInfo;
    private String faceValue;
    private List<FunctionalService> functionalServices;
    private String invalidReason;
    private List<JourneyLocation> locations;
    private String merchantTicketNo;
    private List<SeatInfo> seatInfos;
    private OrderParticipantInfo serviceProvider;
    private List<OrderShopInfo> shops;
    private Date startTime;
    private String status;
    private Date ticketCreateTime;
    private Date ticketModifyTime;
    private Long ticketNum;
    private List<UserInfomation> ticketUsers;
    private String title;
    private OrderVehicleInfo vehicleInfo;

    public JourneyLocation getArrival() {
        return arrival;
    }

    public void setArrival(JourneyLocation arrival) {
        this.arrival = arrival;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public JourneyLocation getDeparture() {
        return departure;
    }

    public void setDeparture(JourneyLocation departure) {
        this.departure = departure;
    }

    public Long getEffectiveNum() {
        return effectiveNum;
    }

    public void setEffectiveNum(Long effectiveNum) {
        this.effectiveNum = effectiveNum;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<OrderExtInfo> getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(List<OrderExtInfo> extInfo) {
        this.extInfo = extInfo;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    public List<FunctionalService> getFunctionalServices() {
        return functionalServices;
    }

    public void setFunctionalServices(List<FunctionalService> functionalServices) {
        this.functionalServices = functionalServices;
    }

    public String getInvalidReason() {
        return invalidReason;
    }

    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
    }

    public List<JourneyLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<JourneyLocation> locations) {
        this.locations = locations;
    }

    public String getMerchantTicketNo() {
        return merchantTicketNo;
    }

    public void setMerchantTicketNo(String merchantTicketNo) {
        this.merchantTicketNo = merchantTicketNo;
    }

    public List<SeatInfo> getSeatInfos() {
        return seatInfos;
    }

    public void setSeatInfos(List<SeatInfo> seatInfos) {
        this.seatInfos = seatInfos;
    }

    public OrderParticipantInfo getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(OrderParticipantInfo serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public List<OrderShopInfo> getShops() {
        return shops;
    }

    public void setShops(List<OrderShopInfo> shops) {
        this.shops = shops;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTicketCreateTime() {
        return ticketCreateTime;
    }

    public void setTicketCreateTime(Date ticketCreateTime) {
        this.ticketCreateTime = ticketCreateTime;
    }

    public Date getTicketModifyTime() {
        return ticketModifyTime;
    }

    public void setTicketModifyTime(Date ticketModifyTime) {
        this.ticketModifyTime = ticketModifyTime;
    }

    public Long getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Long ticketNum) {
        this.ticketNum = ticketNum;
    }

    public List<UserInfomation> getTicketUsers() {
        return ticketUsers;
    }

    public void setTicketUsers(List<UserInfomation> ticketUsers) {
        this.ticketUsers = ticketUsers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OrderVehicleInfo getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(OrderVehicleInfo vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }
}
