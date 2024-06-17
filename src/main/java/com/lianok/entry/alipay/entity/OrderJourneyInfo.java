package com.lianok.entry.alipay.entity;

import java.util.Date;
import java.util.List;

/**
 * @author lianok.com
 */
public class OrderJourneyInfo {

    private String action;
    private List<OrderExtInfo> extInfo;
    private Date journeyCreateTime;
    private String journeyDesc;
    private List<OrderJourneyElement> journeyElements;
    private String journeyIndex;
    private Date journeyModifyTime;
    private String merchantJourneyNo;
    private String status;
    private String statusDesc;
    private String subType;
    private String title;
    private String type;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<OrderExtInfo> getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(List<OrderExtInfo> extInfo) {
        this.extInfo = extInfo;
    }

    public Date getJourneyCreateTime() {
        return journeyCreateTime;
    }

    public void setJourneyCreateTime(Date journeyCreateTime) {
        this.journeyCreateTime = journeyCreateTime;
    }

    public String getJourneyDesc() {
        return journeyDesc;
    }

    public void setJourneyDesc(String journeyDesc) {
        this.journeyDesc = journeyDesc;
    }

    public List<OrderJourneyElement> getJourneyElements() {
        return journeyElements;
    }

    public void setJourneyElements(List<OrderJourneyElement> journeyElements) {
        this.journeyElements = journeyElements;
    }

    public String getJourneyIndex() {
        return journeyIndex;
    }

    public void setJourneyIndex(String journeyIndex) {
        this.journeyIndex = journeyIndex;
    }

    public Date getJourneyModifyTime() {
        return journeyModifyTime;
    }

    public void setJourneyModifyTime(Date journeyModifyTime) {
        this.journeyModifyTime = journeyModifyTime;
    }

    public String getMerchantJourneyNo() {
        return merchantJourneyNo;
    }

    public void setMerchantJourneyNo(String merchantJourneyNo) {
        this.merchantJourneyNo = merchantJourneyNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class OrderJourneyElement {
        private JourneyLocation arrival;
        private JourneyLocation departure;
        private String duration;
        private String endTime;
        private String endTimeDesc;
        private List<OrderExtInfo> extInfo;
        private List<FunctionalService> functionalServices;
        private List<UserInfomation> passagers;
        private JourneyServiceChangeInfo serviceChangeInfo;
        private JourneyMerchantInfo serviceProvider;
        private String startTime;
        private String startTimeDesc;

        public JourneyLocation getArrival() {
            return arrival;
        }

        public void setArrival(JourneyLocation arrival) {
            this.arrival = arrival;
        }

        public JourneyLocation getDeparture() {
            return departure;
        }

        public void setDeparture(JourneyLocation departure) {
            this.departure = departure;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getEndTimeDesc() {
            return endTimeDesc;
        }

        public void setEndTimeDesc(String endTimeDesc) {
            this.endTimeDesc = endTimeDesc;
        }

        public List<OrderExtInfo> getExtInfo() {
            return extInfo;
        }

        public void setExtInfo(List<OrderExtInfo> extInfo) {
            this.extInfo = extInfo;
        }

        public List<FunctionalService> getFunctionalServices() {
            return functionalServices;
        }

        public void setFunctionalServices(List<FunctionalService> functionalServices) {
            this.functionalServices = functionalServices;
        }

        public List<UserInfomation> getPassagers() {
            return passagers;
        }

        public void setPassagers(List<UserInfomation> passagers) {
            this.passagers = passagers;
        }

        public JourneyServiceChangeInfo getServiceChangeInfo() {
            return serviceChangeInfo;
        }

        public void setServiceChangeInfo(JourneyServiceChangeInfo serviceChangeInfo) {
            this.serviceChangeInfo = serviceChangeInfo;
        }

        public JourneyMerchantInfo getServiceProvider() {
            return serviceProvider;
        }

        public void setServiceProvider(JourneyMerchantInfo serviceProvider) {
            this.serviceProvider = serviceProvider;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getStartTimeDesc() {
            return startTimeDesc;
        }

        public void setStartTimeDesc(String startTimeDesc) {
            this.startTimeDesc = startTimeDesc;
        }
    }

    public static class FunctionalService {
        private String content;
        private List<OrderExtInfo> extInfo;
        private String functionCode;
        private String functionName;
        private String functionType;
        private String functionUrl;
        private String memo;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public List<OrderExtInfo> getExtInfo() {
            return extInfo;
        }

        public void setExtInfo(List<OrderExtInfo> extInfo) {
            this.extInfo = extInfo;
        }

        public String getFunctionCode() {
            return functionCode;
        }

        public void setFunctionCode(String functionCode) {
            this.functionCode = functionCode;
        }

        public String getFunctionName() {
            return functionName;
        }

        public void setFunctionName(String functionName) {
            this.functionName = functionName;
        }

        public String getFunctionType() {
            return functionType;
        }

        public void setFunctionType(String functionType) {
            this.functionType = functionType;
        }

        public String getFunctionUrl() {
            return functionUrl;
        }

        public void setFunctionUrl(String functionUrl) {
            this.functionUrl = functionUrl;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }
    }

    public static class JourneyServiceChangeInfo {
        private String changeStatus;
        private String detailUrl;
        private List<OrderExtInfo> extInfo;
        private String remindContent;

        public String getChangeStatus() {
            return changeStatus;
        }

        public void setChangeStatus(String changeStatus) {
            this.changeStatus = changeStatus;
        }

        public String getDetailUrl() {
            return detailUrl;
        }

        public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public List<OrderExtInfo> getExtInfo() {
            return extInfo;
        }

        public void setExtInfo(List<OrderExtInfo> extInfo) {
            this.extInfo = extInfo;
        }

        public String getRemindContent() {
            return remindContent;
        }

        public void setRemindContent(String remindContent) {
            this.remindContent = remindContent;
        }
    }

    public static class JourneyMerchantInfo {
        private List<OrderExtInfo> extInfo;
        private String logo;
        private String name;
        private String shortName;

        public List<OrderExtInfo> getExtInfo() {
            return extInfo;
        }

        public void setExtInfo(List<OrderExtInfo> extInfo) {
            this.extInfo = extInfo;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }
    }
}
