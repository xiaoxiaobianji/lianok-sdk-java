package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.AppItemAttr;
import com.lianok.entry.alipay.entity.LocalItemSkuCreate;
import com.lianok.entry.alipay.entity.PhoneStruct;
import com.lianok.entry.alipay.entity.TimeRangeStruct;
import com.lianok.entry.alipay.response.ApiHlAlipayLocalItemModifyResponse;

import java.util.List;


/**
 * @author lianok.com
 */
public class ApiHlAlipayLocalItemModifyRequest extends AbstractEntryRequest {

    /**
     * 商户号
     */
    private String merchantNo;

    private String itemId;

    private List<AppItemAttr> attrs;
    private String categoryId;
    private PhoneStruct customerServiceMobile;
    private String headImg;
    private List<String> imageList;
    private String itemDetailsPageModel;
    private String itemType;
    private String merchantName;
    private String outItemId;
    private String path;
    private List<LocalItemSkuCreate> skus;
    private TimeRangeStruct soldTime;
    private String title;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public List<AppItemAttr> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<AppItemAttr> attrs) {
        this.attrs = attrs;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public PhoneStruct getCustomerServiceMobile() {
        return customerServiceMobile;
    }

    public void setCustomerServiceMobile(PhoneStruct customerServiceMobile) {
        this.customerServiceMobile = customerServiceMobile;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public String getItemDetailsPageModel() {
        return itemDetailsPageModel;
    }

    public void setItemDetailsPageModel(String itemDetailsPageModel) {
        this.itemDetailsPageModel = itemDetailsPageModel;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getOutItemId() {
        return outItemId;
    }

    public void setOutItemId(String outItemId) {
        this.outItemId = outItemId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<LocalItemSkuCreate> getSkus() {
        return skus;
    }

    public void setSkus(List<LocalItemSkuCreate> skus) {
        this.skus = skus;
    }

    public TimeRangeStruct getSoldTime() {
        return soldTime;
    }

    public void setSoldTime(TimeRangeStruct soldTime) {
        this.soldTime = soldTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.local.item.modify";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayLocalItemModifyResponse.class;
    }
}
