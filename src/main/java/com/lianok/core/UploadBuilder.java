package com.lianok.core;

import com.lianok.core.config.AbstractConfig;

import java.util.Objects;

public class UploadBuilder {

    private AbstractConfig config;

    public UploadBuilder config(AbstractConfig config) {
        Objects.requireNonNull(config);
        this.config = config;
        return this;
    }

    public IDockingClient build() {
        return new UploadClient(this.config);
    }
}
