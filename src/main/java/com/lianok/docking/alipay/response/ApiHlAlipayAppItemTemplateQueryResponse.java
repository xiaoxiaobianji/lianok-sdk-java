package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.ItemAttrGroupVO;


public class ApiHlAlipayAppItemTemplateQueryResponse extends DockingResponseBase {

    /**
     * 属性分组
     */
    private ItemAttrGroupVO attr;

    /**
     * 商品类目id
     */
    private String categoryId;

    /**
     * 商品类目名称
     */
    private String categoryName;

    public ItemAttrGroupVO getAttr() {
        return attr;
    }

    public void setAttr(ItemAttrGroupVO attr) {
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
