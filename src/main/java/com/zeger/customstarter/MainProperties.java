package com.zeger.customstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Pavel Zeger
 * @implNote custom-starter
 * @since 03/04/2021
 */
@ConfigurationProperties(prefix = "main")
@Data
public class MainProperties {

    private String value;

}
