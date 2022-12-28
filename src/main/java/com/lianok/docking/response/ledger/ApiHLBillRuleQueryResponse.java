package com.lianok.docking.response.ledger;

import com.lianok.docking.DockingResponseBase;

import java.util.List;

/**
 * 分账规则查询
 *
 * @author linshu
 * @create 2022/11/2 11:33
 */
public class ApiHLBillRuleQueryResponse extends DockingResponseBase {
    private List<DockingMerchantShareRuleResponseVO> ruleList;

    public List<DockingMerchantShareRuleResponseVO> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<DockingMerchantShareRuleResponseVO> ruleList) {
        this.ruleList = ruleList;
    }

    class DockingMerchantShareRuleResponseVO {

        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
