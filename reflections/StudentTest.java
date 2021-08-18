package com.yash.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentTest {

	public static void main(String[] args) {
		try
	    {
	      Class c = Class.forName("com.yash.practicedemos.Student");
	      Constructor< Student>[] ct = c.getConstructors();
	      for(int i=0; i< ct.length; i++)
	      {
	    	  System.out.println(ct[i]);
	    	  
	      }
	      Constructor< Student>[]cdt = c.getDeclaredConstructors();
	      for(int i=0;i< cdt.length;i++)
	      { 
	    	  System.out.println(cdt[i]);
	    	  
	      }
	      
	      Method[] md = c.getMethods();
	      for(int i=0;i<md.length; i++) {
	    	  System.out.println(md[i]);
	    	  
	      }
	      
	      Field[] f = c.getFields();
	      for (Field field : f) {
	    	  System.out.println(field);
			
		}
	      
	      
	    }
	    catch(Exception e)
	    { 
	    	System.out.println(e);
	    	
	    }

	}

}
