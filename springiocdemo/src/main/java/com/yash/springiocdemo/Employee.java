package com.yash.springiocdemo;

public class Employee {
	
	int id;
	String name;
	Address address;
	
	
	
	public Employee() {
		
		System.out.println("constructor called");
		
	}


//constuctor injection
	public Employee( Address address) {
	
		
		this.address = address;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Address getAddress() {
		return address;
	}


// setter injection
	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}



	public void myInit() {
		System.out.println("--object initiated---");
	}
	
	public void myDestroy() {
		System.out.println("--object destroyed--");
	}

}
