package com.bagal.config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactoryReader {
    private ConfigFactoryReader(){}

    public static FrameworkConfig getConfig()
    {
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
