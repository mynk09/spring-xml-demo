package com.stackroute;


import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args ) throws Exception {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BeanLifecycleDemoBean demoBean = context.getBean("lifecycledemo", BeanLifecycleDemoBean.class);
        System.out.println("Life Cycle Demo");
        context.close();
    }
}