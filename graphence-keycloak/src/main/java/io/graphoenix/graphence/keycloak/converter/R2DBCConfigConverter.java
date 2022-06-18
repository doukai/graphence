package io.graphoenix.graphence.keycloak.converter;

import com.google.auto.service.AutoService;
import com.google.gson.GsonBuilder;
import io.graphoenix.r2dbc.connector.config.R2DBCConfig;
import org.eclipse.microprofile.config.spi.Converter;
import org.keycloak.utils.StringUtil;

@AutoService(Converter.class)
public class R2DBCConfigConverter implements Converter<R2DBCConfig> {

    GsonBuilder gsonBuilder = new GsonBuilder();

    @Override
    public R2DBCConfig convert(String value) throws IllegalArgumentException, NullPointerException {
        R2DBCConfig r2DBCConfig = new R2DBCConfig();
        if (StringUtil.isBlank(value)) {
            return r2DBCConfig;
        }
        R2DBCConfig convertConfig = gsonBuilder.create().fromJson(value, R2DBCConfig.class);
        if (convertConfig.getDriver() != null) {
            r2DBCConfig.setDriver(convertConfig.getDriver());
        }
        if (convertConfig.getProtocol() != null) {
            r2DBCConfig.setProtocol(convertConfig.getProtocol());
        }
        if (convertConfig.getDatabase() != null) {
            r2DBCConfig.setDatabase(convertConfig.getDatabase());
        }
        if (convertConfig.getHost() != null) {
            r2DBCConfig.setHost(convertConfig.getHost());
        }
        if (convertConfig.getPort() != null) {
            r2DBCConfig.setPort(convertConfig.getPort());
        }
        if (convertConfig.getUser() != null) {
            r2DBCConfig.setUser(convertConfig.getUser());
        }
        if (convertConfig.getPassword() != null) {
            r2DBCConfig.setPassword(convertConfig.getPassword());
        }
        if (convertConfig.getUsePool() != null) {
            r2DBCConfig.setUsePool(convertConfig.getUsePool());
        }
        if (convertConfig.getPoolMaxSize() != null) {
            r2DBCConfig.setPoolMaxSize(convertConfig.getPoolMaxSize());
        }
        if (convertConfig.getPoolMaxIdleTime() != null) {
            r2DBCConfig.setPoolMaxIdleTime(convertConfig.getPoolMaxIdleTime());
        }
        return r2DBCConfig;
    }
}
