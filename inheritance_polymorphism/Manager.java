package com.yash.inheritance_polymorphism;

public class Manager extends Employee{

	@Override
	void getSal() {
		double salary = 30000;
		System.out.println(salary);
		
	}

	@Override
	void getId() {
		
		long id = 3;
		System.out.println(id);
		
	}

	@Override
	void getRole() {
		
		String role = "manager";
		System.out.println(role);
		
	}
	
	
	

}
