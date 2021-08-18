package com.patterns.java;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		int rem=0;

		Scanner sc=new Scanner(System.in);

		int num=sc.nextInt();

		if(num==0)

		{

		System.out.println("no");

		}

		while (num!=1)

		{

		rem=num%2;

		num=num/2;

		}

		if(num==1 && rem==0)

		{

		System.out.println("yes");

		}

		else{

		System.out.println("no");

		}

	}

}
