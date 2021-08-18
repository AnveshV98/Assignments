package com.yash.inheritance_polymorphism;

public abstract class Employee {
	
	final static String adress = "Hyderabad";
	Employee(){
		
		System.out.println("Employee ");
	}
	
	static void getPincode() {
		
		System.out.println("5000070");
	}
	void getCompanyName() {
		
		System.out.println("Yash Technologies");
		
	}
	
	abstract void getSal();
	abstract void getId();
	abstract void getRole();
	

}
