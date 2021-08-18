package com.patterns.java;

import java.util.*;
import java.text.*;
public class CurrencyFormatIn {
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

       
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));

       
        String india = inFormat.format(payment);
      
       
        System.out.println("India: " + india);
       
    }

}
