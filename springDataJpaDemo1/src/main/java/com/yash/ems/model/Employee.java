package com.yash.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee is POJO stores varibles
 * @author anvesh.veldhandi
 *
 */
@Entity
@Table(name="Emp_jpa")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	long id;
	@Column(name="NAME")
	String name;
	@Column(name="DESIGNATION")
	String desg;
	@Column(name="SALARY")
	double salary;
	@Column(name="ADDRESS")
	String address;
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(long id, String name, String desg, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", salary=" + salary + ", address=" + address
				+ "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
