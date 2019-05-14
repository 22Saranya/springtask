package com.stackroute.spring.domain;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Task-1 using Application context
        ApplicationContext bean=new ClassPathXmlApplicationContext("constructor.xml");
        Movie movie =(Movie)bean.getBean("bean-1");
        System.out.println(movie.getActor());


    }
}
