package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class ItemDescInfo {
    private String desc;
    private List<String> imgs;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }
}
