package com.stackroute.spring.domain;
import com.stackroute.spring.domain.Actor;
import com.stackroute.spring.domain.Movie;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.stackroute.spring.domain.Configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {

        // Task-1 using Application context
        //ApplicationContext bean3=new ClassPathXmlApplicationContext("awareinterface.xml");
        //Movie movie =(Movie)bean3.getBean("bean-1");
        //System.out.println(movie.getActor());

        //System.out.println(movie.toString());
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(ApplicationConfiguration.class);
        annotationConfigApplicationContext.refresh();
        Movie movie=(Movie)annotationConfigApplicationContext.getBean("movie");
        // Actor actor=(Actor)annotationConfigApplicationContext.getBean("actor");
        System.out.println(movie.getActor());


    }
}
