package com.yash.SpringAopDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.SpringAopDemo.config.AppConfig;
import com.yash.SpringAopDemo.service.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Calculator c=context.getBean(Calculator.class);
    	c.add();
    	c.divide();
    	c.sub();
        System.out.println( "Hello World!" );
    }
}
