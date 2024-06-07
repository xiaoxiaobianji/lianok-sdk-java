package com.lianok.entry.alipay.entity;

import java.util.Date;

/**
 * @author lianok.com
 */
public class TicketInfo {
    private String address;
    private Date endTime;
    private String resvType;
    private String shop;
    private String ticketNo;
    private Date time;
    private String type;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getResvType() {
        return resvType;
    }

    public void setResvType(String resvType) {
        this.resvType = resvType;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}