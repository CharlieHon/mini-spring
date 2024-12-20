package com.charlie.springframework.beans.factory.support;

import com.charlie.springframework.beans.BeansException;
import com.charlie.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 20:43
 * @Description: 定义实例化策略接口
 */
public interface InstantiationStrategy {
    // 在实例化接口 instantiate 方法中添加必要的入参信息，包括：beanDefinition、 beanName、ctor、args
    // Constructor 类，里面包含了一些必要的类信息，有这个参数的目的就是为了拿到符合入参信息相对应的构造函数。
    // args 就是一个具体的入参信息了，最终实例化时候会用到
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor<?> constructor, Object[] args) throws BeansException;
}
