package com.charlie.springframework.beans;

/**
 * @Author: charlie
 * @CreateTime: Created in 2024/12/20 19:06
 * @Description: BeansException
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
