package com.ExceptionHandling.java;

import java.util.Scanner;

public class ArrayIncompatible {

	public static void main(String[] args) {
		int arr[]=new int [5];
		boolean res=false;
		System.out.println( "enter integer");
		do {


			try {
				Scanner sc=new Scanner (System. in);
				arr[0]=sc.nextInt ();
				res=false;



			}catch (Exception e) {


				//e.getStackTrace();
				System.out .println("Not of the type wanted try againin");
				res=true;
			}

		}while(res);
		System.out.println("It is running");

	}
}
