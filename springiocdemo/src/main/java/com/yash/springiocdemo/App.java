package com.yash.springiocdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean life cycle methods
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
    	
    	Employee e1 = (Employee) context.getBean("emp1");
    	//Employee e2 = (Employee) context.getBean("emp2");
    	
    	System.out.println(e1);
    	//System.out.println(e2);
    	
    	ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
    	ctx.close();// close the context
    }
}
