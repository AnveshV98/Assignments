package com.yash.collection.assignment.student;

import java.util.Objects;

public class Student {
	int id;
	String name;
	int standard;
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", standard=" + standard + "]";
	}
	public Student(int id, String name, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, standard);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && standard == other.standard;
	}
	

}
