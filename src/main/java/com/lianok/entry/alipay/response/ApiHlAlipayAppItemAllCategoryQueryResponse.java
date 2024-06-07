package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.CategoryAndParent;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppItemAllCategoryQueryResponse extends DockingResponseBase {
    /**
     * 类目信息
     */
    private List<CategoryAndParent> cats;

    public List<CategoryAndParent> getCats() {
        return cats;
    }

    public void setCats(List<CategoryAndParent> cats) {
        this.cats = cats;
    }
}
