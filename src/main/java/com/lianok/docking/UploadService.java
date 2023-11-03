package com.lianok.docking;

import com.lianok.core.IDockingClient;
import com.lianok.core.UploadBuilder;
import com.lianok.core.config.AbstractConfig;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.core.entity.ResponseResultBase;

public class UploadService {

    private IDockingClient client;

    private UploadService(IDockingClient client) {
        this.client = client;
    }

    public static class Uploader {
        private IDockingClient client;

        public Uploader config(AbstractConfig config) {
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
        return client.execute(request);
    }
}
