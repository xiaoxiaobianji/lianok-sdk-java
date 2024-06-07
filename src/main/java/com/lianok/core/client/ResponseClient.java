package com.lianok.core.client;

import com.alibaba.fastjson.JSONObject;
import com.lianok.core.config.AbstractConfig;
import com.lianok.core.entity.*;
import com.lianok.core.utils.HttpUtil;
import com.lianok.core.utils.StrUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 基础请求对象
 *
 * @author lianok.com
 */
public class ResponseClient implements IDockingClient {

    private final AbstractConfig config;

    public ResponseClient(AbstractConfig config) {
        this.config = config;
    }

    @Override
    public String execute(AbstractDockingRequest request) throws Exception {
        return doRequest(request);
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
        String responseContent = HttpUtil.doPost(config.getUrl(), JSONObject.toJSONString(lianOkRequest));
        return responseContent;
    }
}
