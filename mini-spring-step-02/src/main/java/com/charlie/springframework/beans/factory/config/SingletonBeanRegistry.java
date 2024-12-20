package com.charlie.springframework.beans.factory.config;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 18:59
 * @Description: 单例注册接口定义：定义了一个获取单例对象的接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
