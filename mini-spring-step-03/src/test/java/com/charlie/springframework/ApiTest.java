package com.charlie.springframework;

import com.charlie.springframework.bean.UserService;
import com.charlie.springframework.beans.factory.config.BeanDefinition;
import com.charlie.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 20:17
 * @Description: ApiTest
 */
public class ApiTest {

    @Test
    public void testWithParameter() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService", "charlie");
        userService.queryUserInfo();        // 查询用户信息 charlie
    }

    @Test
    public void testNoParameter() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();        // 查询用户信息: null
    }
}
