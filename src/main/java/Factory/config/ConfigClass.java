package Factory.config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigClass {
    private ConfigClass(){};

public static FrameWorkConfig getConfig(){

    return ConfigCache.getOrCreate(FrameWorkConfig.class);
}
}
