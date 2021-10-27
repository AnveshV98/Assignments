package com.yash.SpringAopDemo.service;
/**
 * service class for calculator
 */

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	int a=3;
	int b=2;
	public void add() {
		
		System.out.println(a+b);
		
	}
	
	public void divide() {
		
		System.out.println(a/b);
		
	}
	
	public void sub() {
		
		System.out.println(a-b);
	}

}
