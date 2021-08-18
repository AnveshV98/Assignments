package com.yash.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class EmployeeTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
			Class name = Class.forName("com.yash.practicedemos.Employee");
			
			//for class
			 System.out.println(name.getName());
			 System.out.println(name.getPackageName());
			 //for fields
			Field[] field = name.getDeclaredFields();
		    for(Field f: field) {
		      System.out.print(f.getType()+" ");
		      System.out.println(f.getName());
		      System.out.println(f.getModifiers());   
		      //System.out.println(name.getDeclaredConstructors());
		    }   
		    
		    //class methods
		    
		    Method[] method = name.getDeclaredMethods();
		    for (Method m : method) {
		    	
		    	System.out.println(m);
		    	System.out.println(m.getDefaultValue());
		    	System.out.println(m.getModifiers());
		    	System.out.println(m.getName());
		    	System.out.println(m.getParameterCount());
		    	System.out.println(m.getAnnotatedReturnType());
				
			}
		    // constructors
		    
		    Constructor[] constructor = name.getDeclaredConstructors();
		    for (Constructor c : constructor) {
		    	System.out.println(c);
		    	System.out.println(c.getModifiers());
		    	System.out.println(c.getName());
		    	System.out.println(c.getParameterCount());
		    	System.out.println(c.getDeclaringClass());
				
			}
		   
				
	}
}
	

	