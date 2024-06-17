package com.lianok.docking;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lianok.core.client.IDockingClient;
import com.lianok.core.UploadBuilder;
import com.lianok.core.config.UploadConfig;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.core.entity.ResponseResultBase;

import java.lang.reflect.Type;

/**
 * 图片上传
 *
 * @author lianok.com
 */
public class UploadService {

    private final IDockingClient client;

    private UploadService(IDockingClient client) {
        this.client = client;
    }

    public static class Uploader {
        private IDockingClient client;

        public Uploader config(UploadConfig config) {
            this.client = new UploadBuilder().config(config).build();
            return this;
        }

        /**
         * 构造服务
         *
         * @return WechatHelper
         */
        public UploadService build() {
            return new UploadService(client);
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
}
