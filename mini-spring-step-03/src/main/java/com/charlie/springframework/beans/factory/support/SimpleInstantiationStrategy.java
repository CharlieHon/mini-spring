package com.charlie.springframework.beans.factory.support;

import com.charlie.springframework.beans.BeansException;
import com.charlie.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 20:47
 * @Description: JDK实例化
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor<?> constructor, Object[] args) throws BeansException {
        // 1. 首先通过 beanDefinition 获取 Class 信息
        Class<?> clazz = beanDefinition.getBeanClass();
        try {
            // 2. 判断 constructor 是否为空，如果为空则是无构造函数实例化，否则就是有构造函数的实例化
            if (constructor != null) {
                return clazz.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            } else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }
}
