package com.charlie.springframework.beans.factory.support;

import com.charlie.springframework.beans.factory.BeansException;
import com.charlie.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 19:15
 * @Description: 实例化Bean类
 * 在 AbstractAutowireCapableBeanFactory 类中实现了 Bean 的**实例化**操作 newInstance
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Instantiation of bean failed", e);
        }
        // DefaultSingletonBeanRegistry 方法
        // 在处理完 Bean 对象的实例化后，直接调用 addSingleton 方法存放到单例对象的缓存中去
        addSingleton(beanName, bean);
        return bean;
    }
}
