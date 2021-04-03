package com.zeger.customstarter.annotation;

import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Pavel Zeger
 * @implNote custom-starter
 * @since 03/04/2021
 */
@Retention(RetentionPolicy.RUNTIME)
@RestController
public @interface FrontendController {
}
