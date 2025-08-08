package com.tns.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con=new ClassPathXmlApplicationContext("beancontext.xml");
    	
    	Customer c1=(Customer) con.getBean("customer1");
    	
    	c1.display();
    }
}
