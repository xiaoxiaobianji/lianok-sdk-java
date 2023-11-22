package com.lianok.docking.alipay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.AppItemAttrVO;
import com.lianok.docking.alipay.entity.ItemDescInfoVO;
import com.lianok.docking.alipay.entity.ItemSkuCreateVO;
import com.lianok.docking.alipay.response.ApiHlAlipayAppItemModifyResponse;

import java.util.List;


public class ApiHlAlipayAppItemModifyRequest extends AbstractDockingRequest {
    /**
     * 商户号
     */
    private String merchantNo;

    private String itemId;

    private List<AppItemAttrVO> attrs;
    private String barcode;
    private String categoryId;
    private String desc;
    private ItemDescInfoVO descInfo;
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
    private List<ItemSkuCreateVO> skus;
    private Long stockNum;
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

    public ItemDescInfoVO getDescInfo() {
        return descInfo;
    }

    public void setDescInfo(ItemDescInfoVO descInfo) {
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

    public List<ItemSkuCreateVO> getSkus() {
        return skus;
    }

    public void setSkus(List<ItemSkuCreateVO> skus) {
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
        return "api.hl.alipay.app.item.modify";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayAppItemModifyResponse.class;
    }
}
