package com.charlie.springframework.beans;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 20:20
 * @Description: BeanFactory
 * 增加传入方法
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    // 新增 getBean 方法
    Object getBean(String beanName, Object... args) throws BeansException;
}
