package com.lianok.docking.response.ledger;

import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.model.ApiHLBillMerchantRelation;

import java.util.List;

/**
 * 分账关系查询
 *
 * @author linshu
 * @create 2022/11/2 11:26
 */
public class ApiHLBillMerchantQueryResponse extends DockingResponseBase {

    private List<ApiHLBillMerchantRelation> relationList;

    public List<ApiHLBillMerchantRelation> getRelationList() {
        return relationList;
    }

    public void setRelationList(List<ApiHLBillMerchantRelation> relationList) {
        this.relationList = relationList;
    }
}
