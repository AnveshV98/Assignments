package com.yash.inheritance_polymorphism;

public class Person implements BankTest {

	@Override
	public void drawMoney() {
		
		System.out.println("withdraw money");
		
	}

	@Override
	public void getStatement() {
		 
		System.out.println("get the statement");
		
	}

}
