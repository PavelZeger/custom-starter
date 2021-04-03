package com.zeger.customstarter.annotation;

import com.zeger.customstarter.config.MainConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Pavel Zeger
 * @implNote custom-starter
 * @since 03/04/2021
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MainConfig.class)
public @interface Main {
}
