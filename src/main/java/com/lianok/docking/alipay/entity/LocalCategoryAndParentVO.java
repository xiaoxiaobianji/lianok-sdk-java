package com.lianok.docking.alipay.entity;

import java.util.List;

public class LocalCategoryAndParentVO {
    /**
     * 叶子类目与它的父类目
     */
    private List<LocalAppxCategoryVO> catAndParent;

    public List<LocalAppxCategoryVO> getCatAndParent() {
        return catAndParent;
    }

    public void setCatAndParent(List<LocalAppxCategoryVO> catAndParent) {
        this.catAndParent = catAndParent;
    }
}
