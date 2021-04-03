package com.zeger.customstarter;

import com.zeger.customstarter.annotation.Main;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Pavel Zeger
 * @implNote custom-starter
 * @since 03/04/2021
 */
public class MainProxyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (Arrays.stream(bean.getClass().getMethods()).anyMatch(method -> method.isAnnotationPresent(Main.class))) {
            if (bean.getClass().getInterfaces().length > 0) {
                return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), bean.getClass().getInterfaces(), (proxy, method, args) -> {
                    System.out.println("The main annotation was invoked inside the main method");
                    method.invoke(bean, args);
                    return null;
                });
            }

            return Enhancer.create(bean.getClass(), (InvocationHandler) (proxy, method, args) -> null);

        }
        return bean;
    }

}
