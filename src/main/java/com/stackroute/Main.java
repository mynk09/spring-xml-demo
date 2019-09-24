package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Movie mov1 = context.getBean("movie1", Movie.class);
        mov1.role();

        Movie mov2 = context.getBean("movie2", Movie.class);
        mov2.role();

        System.out.println(mov1==mov2);
    }
}