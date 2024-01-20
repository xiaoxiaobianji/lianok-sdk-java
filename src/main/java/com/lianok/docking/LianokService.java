package com.lianok.docking;

import com.lianok.core.config.AbstractConfig;
import com.lianok.core.ClientBuilder;
import com.lianok.core.IDockingClient;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.core.entity.ResponseResultBase;
import com.lianok.core.entity.ResponseResultListBase;

/**
 * 接口调度服务
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
        return (ResponseResultBase<T>) client.execute(request);
    }

    public <T extends DockingResponseBase> ResponseResultListBase<T> executeResponseList(AbstractDockingRequest request) throws Exception {
        return (ResponseResultListBase<T>) client.executeList(request);
    }
}
