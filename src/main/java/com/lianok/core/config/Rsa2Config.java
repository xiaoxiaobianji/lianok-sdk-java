package com.lianok.core.config;

import com.lianok.core.emuns.EncryEnum;
import com.lianok.core.emuns.EnvEnum;
import com.lianok.core.entity.AbstractDockingRequest;

import java.util.Objects;

public final class Rsa2Config extends AbstractConfig {

    public EncryEnum getEncryEnum() {
        return EncryEnum.RSA2048;
    }

    private Rsa2Config(EnvEnum env, String authCode, String salt) {
        super(env, authCode, salt);
    }


    public static class Builder extends AbstractConfigBuilder<Builder> {

        public Builder() {
        }

        @Override
        protected Rsa2Config.Builder self() {
            return this;
        }

        public Rsa2Config build() {
            return new Rsa2Config(Objects.requireNonNull(this.env), Objects.requireNonNull(this.authCode), Objects.requireNonNull(this.key));
        }
    }

    @Override
    public String encrypt(AbstractDockingRequest request) {
        throw new RuntimeException("未实现");
    }
}
