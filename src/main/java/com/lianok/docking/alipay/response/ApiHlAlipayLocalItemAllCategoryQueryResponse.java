package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.LocalCategoryAndParentVO;

import java.util.List;


public class ApiHlAlipayLocalItemAllCategoryQueryResponse extends DockingResponseBase {
    /**
     * 类目信息
     */
    private List<LocalCategoryAndParentVO> cats;

    public List<LocalCategoryAndParentVO> getCats() {
        return cats;
    }

    public void setCats(List<LocalCategoryAndParentVO> cats) {
        this.cats = cats;
    }
}
