package com.yash.basics.java;

public class CubeSum {

	public static void main(String[] args) {
		int sum=0;
		int number = 223;
		int counter = 0;
		while(number>0){
		    int t= number%10;
		    System.out.println("Cube of "+t +" is "+(t*t*t));
		    sum=sum+(t*t*t);
		    counter = counter+1;
		    number = number/10;

		}
		System.out.println(sum);

	}

}
