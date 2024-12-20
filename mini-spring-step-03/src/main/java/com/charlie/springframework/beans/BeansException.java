package com.charlie.springframework.beans;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 20:21
 * @Description: BeansException
 */
public class BeansException extends RuntimeException {
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
