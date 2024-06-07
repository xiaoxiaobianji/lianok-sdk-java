package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class CategoryAndParent {
    /**
     * 叶子类目与它的父类目
     */
    private List<AppxCategory> catAndParent;

    public List<AppxCategory> getCatAndParent() {
        return catAndParent;
    }

    public void setCatAndParent(List<AppxCategory> catAndParent) {
        this.catAndParent = catAndParent;
    }
}
