package com.lianok.docking.alipay.entity;

import java.util.List;

public class CategoryAndParentVO {
    /**
     * 叶子类目与它的父类目
     */
    private List<AppxCategoryVO> catAndParent;

    public List<AppxCategoryVO> getCatAndParent() {
        return catAndParent;
    }

    public void setCatAndParent(List<AppxCategoryVO> catAndParent) {
        this.catAndParent = catAndParent;
    }
}
