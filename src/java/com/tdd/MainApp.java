package com.tdd;

import com.tdd.bean.HelloWorld;
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
       /* XmlBeanFactory xbf = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld hw = (HelloWorld) xbf.getBean("helloWorld");
        hw.getMessage();*/
    }
}
