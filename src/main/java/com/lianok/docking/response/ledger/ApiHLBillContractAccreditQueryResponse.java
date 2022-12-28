package com.lianok.docking.response.ledger;

import com.lianok.docking.DockingResponseBase;

/**
 * 分账开通查询
 *
 * @author linshu
 * @create 2022/11/2 11:18
 */
public class ApiHLBillContractAccreditQueryResponse extends DockingResponseBase {

    private String merchantNo;
    private String contractUrl;
    private Integer openStatus;
    private Integer contractStatus;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getContractUrl() {
        return contractUrl;
    }

    public void setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl;
    }

    public Integer getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }
}
