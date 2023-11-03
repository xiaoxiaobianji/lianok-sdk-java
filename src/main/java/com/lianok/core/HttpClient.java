package com.lianok.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lianok.core.config.AbstractConfig;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.core.entity.LianOkRequest;
import com.lianok.core.entity.ResponseResultBase;
import com.lianok.core.utils.HttpUtil;
import com.lianok.core.utils.StrUtils;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 基础请求对象
 */
public class HttpClient implements IDockingClient {

    private final AbstractConfig config;

    HttpClient(AbstractConfig config) {
        this.config = config;
    }

    @Override
    public <T extends DockingResponseBase> ResponseResultBase<T> execute(AbstractDockingRequest request) throws Exception {
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
        String responseContent = HttpUtil.doPost(config.getUrl(), JSONObject.toJSONString(lianOkRequest));
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
