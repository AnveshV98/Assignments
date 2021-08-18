package com.patterns.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidate {
	  public static boolean
	    isValidPassword(String password)
	    {
	  
	       
	        String regex = "^(?=.*[A-S])"
	                       + "\\d*[02468]"
	                       +"(?=.*[#$])"
	                       + "\\d|10$";
	  
	        
	        Pattern p = Pattern.compile(regex);
	  
	        if (password == null) {
	            return false;
	        }
	  
	        Matcher m = p.matcher(password);
	  
	       
	        return m.matches();
	    }
	  
	   
	    public static void main(String args[])
	    {
	  
	        
	        String str1 = "Gvk2#1";
	        System.out.println(isValidPassword(str1));
	  
	       
	    }

}
