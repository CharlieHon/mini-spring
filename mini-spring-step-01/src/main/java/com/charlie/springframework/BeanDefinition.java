package com.charlie.springframework;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 17:04
 * @Description: BeanDefinition，用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
