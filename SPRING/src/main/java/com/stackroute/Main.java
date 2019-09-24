package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String [] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
        Movie m1 = context.getBean("mov1", Movie.class);
        m1.role();

        Movie m2 = context.getBean("mov2", Movie.class);
        m2.role();

        BeanFactory factory= new XmlBeanFactory(new ClassPathResource("bean.xml"));
        Movie m3= factory.getBean("mov2", Movie.class);
        m3.role();
    }

}
