package com.charlie.springframework.beans.factory.support;

import com.charlie.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 19:22
 * @Description: BeanDefinitionRegistry
 */
public interface BeanDefinitionRegistry {
    // 向注册表中注册 BeanDefinition
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
