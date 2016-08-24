package com.tdd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/8/24.
 */
public class MainApp {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
        hw.getMessage();
    }
}
