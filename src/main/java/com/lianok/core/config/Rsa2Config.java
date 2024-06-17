package com.lianok.core.config;

import com.lianok.core.emuns.EncryEnum;
import com.lianok.core.entity.AbstractDockingRequest;

import java.util.Objects;

/**
 * @author lianok.com
 */
public final class Rsa2Config extends AbstractConfig {

    public EncryEnum getEncryEnum() {
        return EncryEnum.RSA2048;
    }

    private Rsa2Config(String url, String authCode, String salt) {
        super(url, authCode, salt);
    }


    public static class Builder extends AbstractConfigBuilder<Builder> {

        private String url;

        public Builder() {
        }

        @Override
        protected Rsa2Config.Builder self() {
            return this;
        }

        public Rsa2Config build() {
            return new Rsa2Config(url, Objects.requireNonNull(this.authCode), Objects.requireNonNull(this.key));
        }
    }

    @Override
    public String encrypt(AbstractDockingRequest request) {
        throw new RuntimeException("未实现");
    }
}
