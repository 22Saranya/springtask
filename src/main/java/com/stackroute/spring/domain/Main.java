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
        ApplicationContext bean3=new ClassPathXmlApplicationContext("autowire.xml");
        Movie movie =(Movie)bean3.getBean("bean-1");
        System.out.println(movie.getActor());

        System.out.println(movie.toString());


    }
}
