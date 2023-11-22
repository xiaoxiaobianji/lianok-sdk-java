package com.lianok.docking.alipay.entity;

public class ContactInfoVO {

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人信息加密内容
     */
    private String encryptionContent;

    /**
     * 联系人手机号
     */
    private String phoneNumber;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEncryptionContent() {
        return encryptionContent;
    }

    public void setEncryptionContent(String encryptionContent) {
        this.encryptionContent = encryptionContent;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
