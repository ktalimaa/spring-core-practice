package org.sda;

import org.sda.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // To call the bean, first need to import xml to java
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Calling the bean; name is the id form xml file
        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean.sayHello());

        myBean.setName("Martin");
        System.out.println(myBean.sayHello());
    }
}