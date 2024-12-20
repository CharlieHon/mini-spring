package com.charlie.springframework.beans.factory.support;

import com.charlie.springframework.beans.factory.BeansException;
import com.charlie.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 19:20
 * @Description: 核心类
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    // 获取：抽象类 AbstractBeanFactory 中方法
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    // 注册：接口 BeanDefinitionRegistry 中方法
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
