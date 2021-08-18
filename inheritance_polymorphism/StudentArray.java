package com.yash.inheritance_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class StudentArray {
	
	String name;

	int age;

	String address;

	public StudentArray()

	{

	this.name="unknown";

	this.age=0;

	this.address="not avaliable";

	}

	public void setinfo(int age,String name)

	{

	this.name=name;

	this.age=age;

	}

	public void setinfo(int age ,String name,String address)

	{

	this.name=name;

	this.age=age;

	this.address=address;

	}

	@Override

	public String toString()

	{

	return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";

	}

	public static void main(String[] args)

	{

	List<StudentArray> stu=new ArrayList<>();

	stu.add(new StudentArray());

	stu.add(new StudentArray());

	stu.add(new StudentArray());

	stu.add(new StudentArray());

	stu.add(new StudentArray());

	stu.add(new StudentArray());

	stu.add(new StudentArray());

	stu.add(new StudentArray());

	stu.add(new StudentArray());

	stu.add(new StudentArray());

	stu.get(0).setinfo(55, "Anvesh");

	stu.get(2).setinfo(50, "Ravi","Andhra pradesh,India");

	stu.get(3).setinfo(45, "aishwary","indore,India");

	stu.get(5).setinfo(30, "Dharmesh","indore,India");

	stu.get(6).setinfo(65, "Anuj","indore,India");

	stu.get(8).setinfo(55, "harshada");

	for(StudentArray s :stu)

	{

	System.out.println(s);

	}

	}

}
