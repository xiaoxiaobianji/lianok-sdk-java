package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.ItemAttrGroupVO;


public class ApiHlAlipayLocalItemTemplateQueryResponse extends DockingResponseBase {

    /**
     * 属性分组，具体的属性值可以参考本地生活商品模板文档：https://opendocs.alipay.com/pre-open/07pywg?pathHash=1c499cb5
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

    /**
     * 商品类型
     */
    private String itemType;

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

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
