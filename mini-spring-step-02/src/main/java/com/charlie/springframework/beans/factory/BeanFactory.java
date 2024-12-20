package com.charlie.springframework.beans.factory;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 19:05
 * @Description: BeanFactory
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
