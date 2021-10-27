package com.yash.springemsjdbctemp.model;

import javax.persistence.Column;

/**
 * pojo class for employee
 * 
 * @author anvesh.veldhandi
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_JDBCTEMP")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String name;
	
	private double salary;
	
	private String desg;
	
	private String address;
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Employee(int id, String name, double salary, String desg, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desg = desg;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", desg=" + desg + ", address="
				+ address + "]";
	}
	
	

}
