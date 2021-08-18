package com.ExceptionHandling.java;

import java.util.Scanner;

public class ProductApp {

	int productId; 
	String productName;
	double productPrice;
	public ProductApp (int prouctId, String productName, double productPrice) { 

		
	}
		public static void main(String[] args) {
		try {

				Scanner sc=new Scanner (System.in);
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter name");
				String str=sc .nextLine( );
				System.out.println("enter double ") ; double price=sc .nextDouble();
				ProductApp a=new ProductApp(id, str,price);

	}catch(Exception e) {
		System.out.println(e);
	}
}
}
