package com.charlie.springframework.beans.factory.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 20:14
 * @Description: BeanDefinition
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeanDefinition {
    private Class<?> beanClass;
}
