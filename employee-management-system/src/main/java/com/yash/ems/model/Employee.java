package com.yash.ems.model;
/**
 * Employee pojo class used for initializing the variables
 */

import java.util.Objects;

public class Employee {
	
	String name;
	int id;
	String location;
	String mobile;
	String designation;
	double salary;
	public Employee(String name, int id, String location, String mobile, String designation, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
		this.mobile = mobile;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", location=" + location + ", mobile=" + mobile
				+ ", designation=" + designation + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(designation, id, location, mobile, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(designation, other.designation) && id == other.id
				&& Objects.equals(location, other.location) && Objects.equals(mobile, other.mobile)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
