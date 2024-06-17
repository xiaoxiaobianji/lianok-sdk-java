package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.AppItemAttr;
import com.lianok.entry.alipay.entity.ItemDescInfo;
import com.lianok.entry.alipay.entity.ItemSkuCreate;
import com.lianok.entry.alipay.response.ApiHlAlipayAppItemCreateResponse;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppItemCreateRequest extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;

    private List<AppItemAttr> attrs;
    private String barcode;
    private String categoryId;
    private String desc;
    private ItemDescInfo descInfo;
    private String directPath;
    private String headImg;
    private List<String> imageList;
    private String itemDetailsPageModel;
    private String itemType;
    private Long originalPrice;
    private String outItemId;
    private String path;
    private String priceUnit;
    private Long salePrice;
    private String saleStatus;
    private List<ItemSkuCreate> skus;
    private Long stockNum;
    private String title;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public List<AppItemAttr> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<AppItemAttr> attrs) {
        this.attrs = attrs;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ItemDescInfo getDescInfo() {
        return descInfo;
    }

    public void setDescInfo(ItemDescInfo descInfo) {
        this.descInfo = descInfo;
    }

    public String getDirectPath() {
        return directPath;
    }

    public void setDirectPath(String directPath) {
        this.directPath = directPath;
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

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
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

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public List<ItemSkuCreate> getSkus() {
        return skus;
    }

    public void setSkus(List<ItemSkuCreate> skus) {
        this.skus = skus;
    }

    public Long getStockNum() {
        return stockNum;
    }

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.app.item.create";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayAppItemCreateResponse.class;
    }
}
