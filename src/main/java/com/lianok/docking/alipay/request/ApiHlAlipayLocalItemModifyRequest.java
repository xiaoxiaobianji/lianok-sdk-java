package com.lianok.docking.alipay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.AppItemAttrVO;
import com.lianok.docking.alipay.entity.LocalItemSkuCreateVO;
import com.lianok.docking.alipay.entity.PhoneStructVO;
import com.lianok.docking.alipay.entity.TimeRangeStructVO;
import com.lianok.docking.alipay.response.ApiHlAlipayLocalItemModifyResponse;

import java.util.List;


public class ApiHlAlipayLocalItemModifyRequest extends AbstractDockingRequest {

    /**
     * 商户号
     */
    private String merchantNo;

    private String itemId;

    private List<AppItemAttrVO> attrs;
    private String categoryId;
    private PhoneStructVO customerServiceMobile;
    private String headImg;
    private List<String> imageList;
    private String itemDetailsPageModel;
    private String itemType;
    private String merchantName;
    private String outItemId;
    private String path;
    private List<LocalItemSkuCreateVO> skus;
    private TimeRangeStructVO soldTime;
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

    public List<AppItemAttrVO> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<AppItemAttrVO> attrs) {
        this.attrs = attrs;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public PhoneStructVO getCustomerServiceMobile() {
        return customerServiceMobile;
    }

    public void setCustomerServiceMobile(PhoneStructVO customerServiceMobile) {
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

    public List<LocalItemSkuCreateVO> getSkus() {
        return skus;
    }

    public void setSkus(List<LocalItemSkuCreateVO> skus) {
        this.skus = skus;
    }

    public TimeRangeStructVO getSoldTime() {
        return soldTime;
    }

    public void setSoldTime(TimeRangeStructVO soldTime) {
        this.soldTime = soldTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Boolean getSignByObjectMethod() {
        return true;
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
