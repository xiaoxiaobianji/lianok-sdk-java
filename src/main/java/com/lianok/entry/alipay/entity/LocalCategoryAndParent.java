package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class LocalCategoryAndParent {
    /**
     * 叶子类目与它的父类目
     */
    private List<LocalAppxCategory> catAndParent;

    public List<LocalAppxCategory> getCatAndParent() {
        return catAndParent;
    }

    public void setCatAndParent(List<LocalAppxCategory> catAndParent) {
        this.catAndParent = catAndParent;
    }
}
