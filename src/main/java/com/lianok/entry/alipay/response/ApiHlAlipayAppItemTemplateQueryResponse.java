package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.ItemAttrGroup;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppItemTemplateQueryResponse extends DockingResponseBase {

    /**
     * 属性分组
     */
    private ItemAttrGroup attr;

    /**
     * 商品类目id
     */
    private String categoryId;

    /**
     * 商品类目名称
     */
    private String categoryName;

    public ItemAttrGroup getAttr() {
        return attr;
    }

    public void setAttr(ItemAttrGroup attr) {
        this.attr = attr;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
