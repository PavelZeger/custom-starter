package com.zeger.customstarter.config;

import com.zeger.customstarter.MainApplicationListener;
import com.zeger.customstarter.MainProperties;
import com.zeger.customstarter.annotation.ConditionalOnProduction;
import com.zeger.customstarter.frontend.FrontendControllerHandler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pavel Zeger
 * @implNote custom-starter
 * @since 03/04/2021
 */
@Configuration
@EnableConfigurationProperties(MainProperties.class)
public class MainConfig {

    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("main.value")
    public MainApplicationListener mainApplicationListener() {
        return new MainApplicationListener();
    }

    @Bean
    public FrontendControllerHandler frontendControllerHandler() {
        return new FrontendControllerHandler();
    }

}
