package com.lianok.docking.bill.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlOrderAccountStatementApplyResponse extends DockingResponseBase {

    private String downIdentification;

    public String getDownIdentification() {
        return downIdentification;
    }

    public void setDownIdentification(String downIdentification) {
        this.downIdentification = downIdentification;
    }
}
