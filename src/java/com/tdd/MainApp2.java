package com.tdd;

import com.tdd.bean.HelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/8/24.
 */
public class MainApp2 {
    public static void main(String args[]){
        AbstractApplicationContext Acontext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld hw = (HelloWorld)Acontext.getBean("helloWorld");
        hw.getMessage();
        Acontext.registerShutdownHook();
    }
}
