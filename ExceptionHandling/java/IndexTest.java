package com.ExceptionHandling.java;

import java.util.Scanner;

public class IndexTest {
	
	 public static void main(String[] args) {

	       Scanner scanner = new Scanner(System.in);

	       String[] names = {"Anvesh", "Ravi", "Aishwary", "Dharmesh", "Harshada", "Anuj", "sunny", "sharma", "raj", "pavan"};

	       int number = Integer.parseInt(scanner.nextLine());

	       try{

	           System.out.println(names[number]);

	       }catch (ArrayIndexOutOfBoundsException  exception){

	           System.out.println(exception + " isn't a vailid value.");

	       }

	   }

}
