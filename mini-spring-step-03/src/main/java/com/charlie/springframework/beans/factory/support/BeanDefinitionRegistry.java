package com.charlie.springframework.beans.factory.support;

import com.charlie.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 20:31
 * @Description: BeanDefinitionRestry
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
