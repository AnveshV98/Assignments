package com.yash.collection.assignment.Hospital;

import java.util.Objects;

public class Patient {
	
	int token_no;
	String name;
	int age;
	
	
	
	public Patient(int token_no, String name, int age) {
		super();
		this.token_no = token_no;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [token_no=" + token_no + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, token_no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return age == other.age && Objects.equals(name, other.name) && token_no == other.token_no;
	}
	
	

}
