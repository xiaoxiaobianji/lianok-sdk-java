package com.lianok.entry.merchant.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.entity.DockingResponseBase;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlShopQueryBranchShopListResponse extends DockingResponseBase {

    private Integer totalCount;
    private Integer pageSize;
    private Integer currentPage;
    public List<ApiHlShopQueryBranchShopInfo> branchShopList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<ApiHlShopQueryBranchShopInfo> getBranchShopList() {
        return branchShopList;
    }

    public void setBranchShopList(List<ApiHlShopQueryBranchShopInfo> branchShopList) {
        this.branchShopList = branchShopList;
    }

    public static class ApiHlShopQueryBranchShopInfo {
        private String shopNo;
        private String shopName;
        private String provinceCode;
        private String provinceName;
        private String cityCode;
        private String cityName;
        private String areaCode;
        private String areaName;
        private String address;
        private String contacter;
        private String phone;
        private String mccCode;
        @JSONField(name = "mccCodeCN")
        private String mccCodeName;

        public String getShopNo() {
            return shopNo;
        }

        public void setShopNo(String shopNo) {
            this.shopNo = shopNo;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getProvinceCode() {
            return provinceCode;
        }

        public void setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }

        public String getCityCode() {
            return cityCode;
        }

        public void setCityCode(String cityCode) {
            this.cityCode = cityCode;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getAreaName() {
            return areaName;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getContacter() {
            return contacter;
        }

        public void setContacter(String contacter) {
            this.contacter = contacter;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getMccCode() {
            return mccCode;
        }

        public void setMccCode(String mccCode) {
            this.mccCode = mccCode;
        }

        public String getMccCodeName() {
            return mccCodeName;
        }

        public void setMccCodeName(String mccCodeName) {
            this.mccCodeName = mccCodeName;
        }
    }
}
