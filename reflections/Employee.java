package com.yash.reflections;
class Employee{
	int empId;
	String name;
	
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	void showInfo() {
	    System.out.println("Employee Id: "+empId);
	    System.out.println("Employee Name: "+name);
	  }
	
}
