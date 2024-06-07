package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.*;

import java.util.Date;
import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppItemQueryResponse extends DockingResponseBase {

    /**
     * 商品属性列表，kv形式
     */
    private List<AppItemAttr> attrs;

    /**
     * 商品条形码
     */
    private String barcode;

    /**
     * 平台类目，填写的类目必须在类目表列出，多级类目只填最后一级。商品类目 ID 及信息可通过商品类目表获取。
     */
    private String categoryId;

    /**
     * 商品创建时间
     */
    private Date createTime;

    /**
     * 导购描述，用于介绍商品卖点
     */
    private String desc;

    /**
     * 商品详情信息
     */
    private ItemDescInfo descInfo;

    /**
     * 商品直接购买链接
     */
    private String directPath;

    /**
     * 商品主图，图片文件id，图片宽高为750px*750px，宽高比1:1。文件id通过alipay.open.file.upload上传资源获取。
     */
    private String headImg;

    /**
     * 商品子图文件id列表，不超过 3 个图片，图片宽高为750px*750px，宽高比1:1。文件id通过alipay.open.file.upload上传资源获取。
     */
    private List<String> imageList;

    /**
     * 商品是否在线版本，true在线，false最新版本
     */
    private Boolean isOnline;

    /**
     * 1=官方插件版，商品详情页链接不传入 0=自定义详情页版，商品详情页链接必须传入
     */
    private String itemDetailsPageModel;

    /**
     * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
     */
    private String itemId;

    /**
     * 商品类型
     */
    private String itemType;

    /**
     * 商品原价，分为单位。若填写了skus[]数组，此字段不返回值
     */
    private Long originalPrice;

    /**
     * 商家侧商品ID，要求 APPID 下全局唯一。
     */
    private String outItemId;

    /**
     * 商品详情页链接
     */
    private String path;

    /**
     * 商品价格单元
     */
    private String priceUnit;

    /**
     * 商品有冻结、驳回时，展示对应的具体问题
     */
    private List<ItemRiskInfo> riskInfo;

    /**
     * 商品售价，分为单位。若填写了skus[]数组，此字段不返回值
     */
    private Long salePrice;

    /**
     * 商品在对应场景屏蔽，展示对应的具体问题
     */
    private List<ItemSceneRiskInfo> sceneRiskInfo;

    /**
     * 商品sku信息
     */
    private List<ItemSkuSearch> skus;

    /**
     * 审核驳回：商品审核失败时，商品状态为审核驳回。
     审核中：商品处于审核流程中时，商品状态为审核中。
     已下架：商家可以通过调用接口下架商品，也可以通过商家后台下架商品。
     可售卖：商家可以通过调用接口上架商品，也可以通过商家后台上架商品。
     冻结：当商家出现违规操作时，支付宝侧将发起冻结，商品无法对外透出。
     当商品包含多个规格时，只要有一个规格的商品状态为“可售卖”，商品状态则为“可售卖”。
     */
    private String spuStatus;

    /**
     * 若填写了skus[]数组，此字段不用填写。
     若未填写skus[]数组，此字段必填。
     目前支持库存区间0~99999
     */
    private Long stockNum;

    /**
     * 商品名称，字符类型，最少不低于3，最长不超过60个字。注：1.商品标题只允许汉字、数字、英文字母、特殊字符集；2.商品标题不得仅为数字、字母、特殊字符集或上述三种的组合。
     美味甜甜圈
     */
    private String title;

    /**
     * 商品最新更新时间
     */
    private Date updateTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public String getItemDetailsPageModel() {
        return itemDetailsPageModel;
    }

    public void setItemDetailsPageModel(String itemDetailsPageModel) {
        this.itemDetailsPageModel = itemDetailsPageModel;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
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

    public List<ItemRiskInfo> getRiskInfo() {
        return riskInfo;
    }

    public void setRiskInfo(List<ItemRiskInfo> riskInfo) {
        this.riskInfo = riskInfo;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public List<ItemSceneRiskInfo> getSceneRiskInfo() {
        return sceneRiskInfo;
    }

    public void setSceneRiskInfo(List<ItemSceneRiskInfo> sceneRiskInfo) {
        this.sceneRiskInfo = sceneRiskInfo;
    }

    public List<ItemSkuSearch> getSkus() {
        return skus;
    }

    public void setSkus(List<ItemSkuSearch> skus) {
        this.skus = skus;
    }

    public String getSpuStatus() {
        return spuStatus;
    }

    public void setSpuStatus(String spuStatus) {
        this.spuStatus = spuStatus;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
