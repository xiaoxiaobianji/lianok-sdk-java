package com.lianok.entry.alipay.entity;

/**
 * 收货地址
 *
 * @author lianok.com
 */
public class AddressInfo {
    /**
     * 详细收货地址信息
     */
    private String detailedAddress;

    /**
     * 收件人姓名
     */
    private String receiverName;

    /**
     * 收件人手机号码
     */
    private String telNumber;

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
}
