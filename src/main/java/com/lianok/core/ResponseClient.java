package com.lianok.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lianok.core.config.AbstractConfig;
import com.lianok.core.entity.*;
import com.lianok.core.utils.HttpUtil;
import com.lianok.core.utils.StrUtils;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * 基础请求对象
 */
public class ResponseClient implements IDockingClient {

    private final AbstractConfig config;

    ResponseClient(AbstractConfig config) {
        this.config = config;
    }

    @Override
    public <T extends DockingResponseBase> ResponseResultBase<T> execute(AbstractDockingRequest request) throws Exception {
        String responseContent = doRequest(request);
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
        String responseContent = doRequest(request);
        ResponseResultListBase<T> result = JSONObject.parseObject(responseContent, ResponseResultListBase.class);
        if (result.success()) {
            JSONObject jsonObject = JSONObject.parseObject(responseContent);
            String respData = jsonObject.getString("data");
            List<T> response = (List<T>) JSON.parseArray(respData, request.getResponseClass());
            result.setData(response);
        }
        return result;
    }

    private String doRequest(AbstractDockingRequest request) throws Exception {
        if (StrUtils.isEmpty(request.getRequestTime())) {
            String requestTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            request.setRequestTime(requestTime);
        }
        String sign = config.encrypt(request);
        LianOkRequest lianOkRequest = new LianOkRequest();
        lianOkRequest.setAuthCode(config.getAuthCode());
        lianOkRequest.setResource(request.getResource());
        lianOkRequest.setRequestTime(request.getRequestTime());
        lianOkRequest.setVersionNo(request.getVersionNo());
        lianOkRequest.setSign(sign);
        lianOkRequest.setParams(JSONObject.toJSONString(request.getParams()));
        String requestUrl = config.getUrl();
        if(request.getSignByJsonStringMethod()){
            requestUrl = requestUrl.replaceFirst("/openapi/v2/api/biz/do","");
        }

        String responseContent = HttpUtil.doPost(requestUrl, JSONObject.toJSONString(lianOkRequest));
        return responseContent;
    }
}
