package com.lianok.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lianok.core.config.AbstractConfig;
import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.core.entity.ResponseResultBase;
import com.lianok.core.utils.HttpUtil;
import com.lianok.core.utils.StrUtils;
import com.lianok.docking.upload.request.ApiHlShopUploadImageRequest;
import com.lianok.docking.upload.response.ApiHlShopUploadImageResponse;

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
    public <T extends DockingResponseBase> ResponseResultBase<T> execute(DockingRequestBase request) throws Exception {
        if (!(request instanceof ApiHlShopUploadImageRequest)) {
            throw new ClassFormatError("参数类型错误：ApiHlShopUploadImageRequest");
        }
        if (StrUtils.isEmpty(request.getRequestTime())) {
            String requestTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            request.setRequestTime(requestTime);
        }
        String sign = config.encrypt(request);
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("authCode", config.getAuthCode());
        paramMap.put("resource", request.getResource());
        paramMap.put("requestTime", request.getRequestTime());
        paramMap.put("versionNo", request.getVersionNo());
        paramMap.put("sign", sign);
        Map<String, byte[]> fileMap = new HashMap<>();
        ApiHlShopUploadImageRequest temp = (ApiHlShopUploadImageRequest) request;
        fileMap.put(temp.getFileName(), temp.getFile());
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
}
