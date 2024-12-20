package com.charlie.springframework.beans.factory.config;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 20:19
 * @Description: SingletonBeanRegistry
 */
public interface SingletonBeanRegistry {

    public Object getSingleton(String beanName);

}
