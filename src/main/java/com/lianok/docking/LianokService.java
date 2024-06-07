package com.lianok.docking;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lianok.core.config.AbstractConfig;
import com.lianok.core.ClientBuilder;
import com.lianok.core.client.IDockingClient;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.core.entity.ResponseResultBase;
import com.lianok.core.entity.ResponseResultListBase;

import java.lang.reflect.Type;
import java.util.List;

/**
 * 接口调度服务
 *
 * @author lianok.com
 */
public class LianokService {

    private IDockingClient client;

    private LianokService(IDockingClient client) {
        this.client = client;
    }

    public static class Builder {

        private IDockingClient client;

        public Builder config(AbstractConfig config) {
            this.client = new ClientBuilder().config(config).build();
            return this;
        }

        /**
         * 构造服务
         *
         * @return WechatHelper
         */
        public LianokService build() {
            return new LianokService(client);
        }
    }

    public <T extends DockingResponseBase> ResponseResultBase<T> execute(AbstractDockingRequest request) throws Exception {
        String content = client.execute(request);
        ResponseResultBase<T> result = JSONObject.parseObject(content, ResponseResultBase.class);
        if (result.success()) {
            JSONObject jsonObject = JSONObject.parseObject(content);
            String respData = jsonObject.getString("data");
            T response = JSON.parseObject(respData, (Type) request.getResponseClass());
            result.setData(response);
        }
        return result;
    }

    public <T extends DockingResponseBase> ResponseResultListBase<T> list(AbstractDockingRequest request) throws Exception {
        String content = client.execute(request);
        ResponseResultListBase<T> result = JSONObject.parseObject(content, ResponseResultListBase.class);
        if (result.success()) {
            JSONObject jsonObject = JSONObject.parseObject(content);
            String respData = jsonObject.getString("data");
            List<T> response = (List<T>) JSON.parseArray(respData, request.getResponseClass());
            result.setData(response);
        }
        return result;
    }
}
