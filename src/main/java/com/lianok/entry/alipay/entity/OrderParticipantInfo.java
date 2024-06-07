package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class OrderParticipantInfo {
    private List<OrderExtInfo> extInfo;
    private String logoMaterialId;
    private String name;
    private String shortName;
    private String type;
    private String uid;

    public List<OrderExtInfo> getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(List<OrderExtInfo> extInfo) {
        this.extInfo = extInfo;
    }

    public String getLogoMaterialId() {
        return logoMaterialId;
    }

    public void setLogoMaterialId(String logoMaterialId) {
        this.logoMaterialId = logoMaterialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
