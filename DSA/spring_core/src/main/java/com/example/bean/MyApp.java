package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Hello");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        Mybean mybean = context.getBean("myBean",Mybean.class);
        mybean.showMessage();
    }
}
