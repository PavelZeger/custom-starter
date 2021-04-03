package com.zeger.customstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Pavel Zeger
 * @implNote custom-starter
 * @since 03/04/2021
 */
public class MainApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private MainProperties mainProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Main annotation was invoked: " + mainProperties.getValue());
    }

}
