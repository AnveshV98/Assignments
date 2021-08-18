package com.patterns.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbers {
	
	public static void main(String[] args) {
	      String data = "one 9two4 three7 four1five";
	      
	      System.out.println("the given string is: one 9two4 three7 four1five ");
	      
	      String regex1 = "([0-9]+)";
	      
	      Pattern pattern1 = Pattern.compile(regex1);
	      
	      String regex2 = "([a-z]+)";
	      
	      Pattern pattern2 = Pattern.compile(regex2);
	      
	      Matcher matcher1 = pattern1.matcher(data);
	      Matcher matcher2 = pattern2.matcher(data);
	      System.out.println("Digits in the given string are: ");
	      while(matcher1.find()) {
	         System.out.print(matcher1.group()+" ");
	      }
	      
	      System.out.println("\nwords in the given string are: ");
	      while(matcher2.find()) {
	    	  System.out.println(matcher2.group()+" ");
	      }
	   }

}
