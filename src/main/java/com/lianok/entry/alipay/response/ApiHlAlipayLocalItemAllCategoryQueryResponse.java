package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.LocalCategoryAndParent;

import java.util.List;


/**
 * @author lianok.com
 */
public class ApiHlAlipayLocalItemAllCategoryQueryResponse extends DockingResponseBase {
    /**
     * 类目信息
     */
    private List<LocalCategoryAndParent> cats;

    public List<LocalCategoryAndParent> getCats() {
        return cats;
    }

    public void setCats(List<LocalCategoryAndParent> cats) {
        this.cats = cats;
    }
}
