package com.lianok.docking.b2b.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlAppletB2bQueryStoreInfoResponse extends DockingResponseBase {
    private String storeInfos;

    public String getStoreInfos() {
        return storeInfos;
    }

    public void setStoreInfos(String storeInfos) {
        this.storeInfos = storeInfos;
    }
}
