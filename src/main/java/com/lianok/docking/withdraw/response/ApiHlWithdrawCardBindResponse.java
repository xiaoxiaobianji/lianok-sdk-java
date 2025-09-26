package com.lianok.docking.withdraw.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlWithdrawCardBindResponse extends DockingResponseBase {

    private String merchantNo;
    private String bindCardId;


    public String getMerchantNo() {
        return merchantNo;
    }
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getBindCardId() {return bindCardId;}
    public void setBindCardId(String bindCardId) {
        this.bindCardId = bindCardId;
    }
}
