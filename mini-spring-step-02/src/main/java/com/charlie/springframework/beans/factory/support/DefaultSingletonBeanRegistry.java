package com.charlie.springframework.beans.factory.support;

import com.charlie.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 19:00
 * @Description: 单例注册接口实现
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    // 受保护的 addSingleton 方法，这个方法可以被继承此类的其他类调用
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
