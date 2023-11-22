package com.lianok.docking.alipay.entity;

import java.util.List;

public class LocalAppxCategoryVO {

    /**
     * 类目编号
     */
    private String catId;

    /**
     * 类目层级
     */
    private Long catLevel;

    /**
     * 类目名称
     */
    private String catName;

    /**
     * 仅叶子节点有类目状态
     */
    private String catStatus;

    /**
     * 父类目编号
     */
    private String fCatId;

    /**
     * 商品类型
     */
    private List<String> itemTypes;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public Long getCatLevel() {
        return catLevel;
    }

    public void setCatLevel(Long catLevel) {
        this.catLevel = catLevel;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatStatus() {
        return catStatus;
    }

    public void setCatStatus(String catStatus) {
        this.catStatus = catStatus;
    }

    public String getfCatId() {
        return fCatId;
    }

    public void setfCatId(String fCatId) {
        this.fCatId = fCatId;
    }

    public List<String> getItemTypes() {
        return itemTypes;
    }

    public void setItemTypes(List<String> itemTypes) {
        this.itemTypes = itemTypes;
    }
}
