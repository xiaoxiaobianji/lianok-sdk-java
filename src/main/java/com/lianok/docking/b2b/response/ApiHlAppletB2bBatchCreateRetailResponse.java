package com.lianok.docking.b2b.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlAppletB2bBatchCreateRetailResponse extends DockingResponseBase {

    private String failureRecords;

    private Integer numSuccess;

    private Integer numFailure;

    public String getFailureRecords() {
        return failureRecords;
    }

    public void setFailureRecords(String failureRecords) {
        this.failureRecords = failureRecords;
    }


    public Integer getNumSuccess() {
        return numSuccess;
    }

    public void setNumSuccess(Integer numSuccess) {
        this.numSuccess = numSuccess;
    }


    public Integer getNumFailure() {
        return numFailure;
    }

    public void setNumFailure(Integer numFailure) {
        this.numFailure = numFailure;
    }
}
