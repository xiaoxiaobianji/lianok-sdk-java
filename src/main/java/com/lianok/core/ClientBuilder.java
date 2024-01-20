package com.lianok.core;

import com.lianok.core.config.AbstractConfig;

import java.util.Objects;

public class ClientBuilder {

    private AbstractConfig config;

    public ClientBuilder config(AbstractConfig config) {
        Objects.requireNonNull(config);
        this.config = config;
        return this;
    }

    public IDockingClient build() {
        return new ResponseClient(this.config);
    }
}
