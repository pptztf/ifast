package com.ifast.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.ifast.api.config.JWTConfig;

/**
 * <pre>
 * </pre>
 * 
 * <small> 2018年4月6日 | Aron</small>
 */
@Component
@ConfigurationProperties(prefix = "ifast")
@Data
public class IFastConfig {
    /**
     * 项目名，末尾不带 "/"
     */
    private String projectName;
    /**
     * 项目根目录，末尾带 "/"
     */
    private String projectRootURL;

    /**
     * 演示模式
     */
    private boolean demoMode;
    /**
     * 调试模式
     */
    private boolean devMode;

    private JWTConfig jwt;

}
