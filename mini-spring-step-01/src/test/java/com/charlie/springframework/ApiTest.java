package com.charlie.springframework;

import com.charlie.springframework.bean.UserService;
import org.junit.Test;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 17:11
 * @Description: ApiTest
 */
public class ApiTest {

    @Test
    public void testBeanFactory() {
        // 1. 初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        // 2. 注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3. 获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
