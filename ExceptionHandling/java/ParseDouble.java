package com.ExceptionHandling.java;

import java.util.Scanner;

public class ParseDouble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	       double num;
	       try{
	           System.out.print("Input a number: ");
	           num = Double.parseDouble(input.nextLine());
	       }catch(NumberFormatException e){
	           num = 0;
	           System.out.println("Invalid input! It should be a number in double type");
	       }
	       System.out.println(num);
	   }
	}

