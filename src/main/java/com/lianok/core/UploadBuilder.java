package com.lianok.core;

import com.lianok.core.client.IDockingClient;
import com.lianok.core.client.UploadClient;
import com.lianok.core.config.UploadConfig;

import java.util.Objects;

/**
 * 上传图片
 *
 * @author lianok.com
 */
public class UploadBuilder {

    private UploadConfig config;

    public UploadBuilder config(UploadConfig config) {
        Objects.requireNonNull(config);
        this.config = config;
        return this;
    }

    public IDockingClient build() {
        return new UploadClient(this.config);
    }
}
