package com.lianok.docking.response.bill;

import com.lianok.docking.DockingResponseBase;

/**
 * @author linshu
 * @create 2022/8/22 16:16
 */
public class ApiHLOrderAccountStatementApplyResponse extends DockingResponseBase {

    private String downIdentification;

    public String getDownIdentification() {
        return downIdentification;
    }

    public void setDownIdentification(String downIdentification) {
        this.downIdentification = downIdentification;
    }
}
