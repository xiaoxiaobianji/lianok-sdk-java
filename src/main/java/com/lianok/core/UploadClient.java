package com.lianok.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lianok.core.config.AbstractConfig;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.core.entity.ResponseResultBase;
import com.lianok.core.entity.ResponseResultListBase;
import com.lianok.core.utils.HttpUtil;
import com.lianok.core.utils.StrUtils;
import com.lianok.docking.complaint.request.ApiHlComplaintUploadImageRequest;
import com.lianok.docking.upload.request.ApiHlShopUploadImageRequest;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class UploadClient implements IDockingClient {

    private final AbstractConfig config;

    public UploadClient(AbstractConfig config) {
        this.config = config;
    }

    @Override
    public <T extends DockingResponseBase> ResponseResultBase<T> execute(AbstractDockingRequest request) throws Exception {
        if (!(request instanceof ApiHlShopUploadImageRequest) && !(request instanceof ApiHlComplaintUploadImageRequest)) {
            throw new ClassFormatError("参数类型错误，需要使用sdk图片上传Request");
        }
        if (StrUtils.isEmpty(request.getRequestTime())) {
            String requestTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            request.setRequestTime(requestTime);
        }
        String sign = config.encrypt(request);
        Map<String, String> paramMap = new HashMap<>(5);
        paramMap.put("authCode", config.getAuthCode());
        paramMap.put("resource", request.getResource());
        paramMap.put("requestTime", request.getRequestTime());
        paramMap.put("versionNo", request.getVersionNo());
        paramMap.put("sign", sign);
        Map<String, byte[]> fileMap = new HashMap<>(1);
        if (request instanceof ApiHlShopUploadImageRequest) {
            ApiHlShopUploadImageRequest temp = (ApiHlShopUploadImageRequest) request;
            fileMap.put(temp.getFileName(), temp.getFile());
        } else if (request instanceof ApiHlComplaintUploadImageRequest) {
            ApiHlComplaintUploadImageRequest temp = (ApiHlComplaintUploadImageRequest) request;
            fileMap.put(temp.getFileName(), temp.getFile());
        }
        String responseContent = HttpUtil.upload(config.getUrl().replace("/do", "/file"), paramMap, fileMap);
        ResponseResultBase<T> result = JSONObject.parseObject(responseContent, ResponseResultBase.class);
        if (result.success()) {
            JSONObject jsonObject = JSONObject.parseObject(responseContent);
            String respData = jsonObject.getString("data");
            T response = JSON.parseObject(respData, (Type) request.getResponseClass());
            result.setData(response);
        }
        return result;
    }

    @Override
    public <T extends DockingResponseBase> ResponseResultListBase<T> executeList(AbstractDockingRequest request) throws Exception {
        throw new Exception("上传方法请调用 execute");
    }
}
