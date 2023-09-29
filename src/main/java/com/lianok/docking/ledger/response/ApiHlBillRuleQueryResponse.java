package com.lianok.docking.ledger.response;

import com.lianok.core.entity.DockingResponseBase;

import java.io.Serializable;
import java.util.List;

/**
 * 分账规则查询
 */
public class ApiHlBillRuleQueryResponse extends DockingResponseBase {

    private List<DockingMerchantShareRuleResponseVO> ruleList;

    public List<DockingMerchantShareRuleResponseVO> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<DockingMerchantShareRuleResponseVO> ruleList) {
        this.ruleList = ruleList;
    }

    public static class DockingMerchantShareRuleResponseVO implements Serializable {

        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
