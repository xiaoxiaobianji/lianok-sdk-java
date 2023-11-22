package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.CategoryAndParentVO;

import java.util.List;


public class ApiHlAlipayAppItemAllCategoryQueryResponse extends DockingResponseBase {
    /**
     * 类目信息
     */
    private List<CategoryAndParentVO> cats;

    public List<CategoryAndParentVO> getCats() {
        return cats;
    }

    public void setCats(List<CategoryAndParentVO> cats) {
        this.cats = cats;
    }
}
