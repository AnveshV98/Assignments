package com.patterns.java;

import java.util.Scanner;

public class YashEmailValidate {
	
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      String yashMail = sc.next();
	      sc.close();
	      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	      boolean result = yashMail.matches(regex);
	      if(result) {
	         System.out.println("Given email-id is valid");
	      } else {
	         System.out.println("Given email-id is not valid");
	      }
	   }
	}


