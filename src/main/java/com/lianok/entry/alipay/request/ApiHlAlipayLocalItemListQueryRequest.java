package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayLocalItemListQueryResponse;

import java.util.List;


/**
 * @author lianok.com
 */
public class ApiHlAlipayLocalItemListQueryRequest extends AbstractEntryRequest {

    /**
     * 商户号
     */
    private String merchantNo;
    private List<String> itemIdList;
    private List<String> outItemIdList;
    private Long pageNum;
    private Long pageSize;
    private String spuStatus;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public List<String> getItemIdList() {
        return itemIdList;
    }

    public void setItemIdList(List<String> itemIdList) {
        this.itemIdList = itemIdList;
    }

    public List<String> getOutItemIdList() {
        return outItemIdList;
    }

    public void setOutItemIdList(List<String> outItemIdList) {
        this.outItemIdList = outItemIdList;
    }

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpuStatus() {
        return spuStatus;
    }

    public void setSpuStatus(String spuStatus) {
        this.spuStatus = spuStatus;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.local.item.list.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayLocalItemListQueryResponse.class;
    }
}
