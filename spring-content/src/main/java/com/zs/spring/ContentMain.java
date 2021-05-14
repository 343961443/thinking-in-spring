package com.zs.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zhaoshuai
 * @Date: 2021/4/29
 */
public class ContentMain {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
        beanFactory = new AnnotationConfigApplicationContext();
    }
}
