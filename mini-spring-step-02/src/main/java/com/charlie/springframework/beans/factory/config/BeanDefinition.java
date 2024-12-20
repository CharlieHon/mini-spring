package com.charlie.springframework.beans.factory.config;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 18:57
 * @Description: BeanDefinition
 */
@Getter
@Setter
public class BeanDefinition {
    // 把上一章节中的 Object bean 替换为 Class
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }
}
