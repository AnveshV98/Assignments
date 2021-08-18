package com.Oops.java;

/**
 * Create a program for a Hostel to calculate the no of students
registered. Student class has three attributes: Student_ID (int),
Student_Name (String), Student_class (String).Write methods to get
and set above values of the Student object. Also devise a way to
calculate the number of students registered in the hostel.
 * @author velda
 *
 */

public class Hostel {
	
	int Student_ID;
	String Student_Name;
	String Student_class;
	
	public Hostel(String Student_Name, String Student_class, int Student_ID) {
		
		System.out.println(Student_Name+" "+Student_class+" "+Student_ID);
	}
	public int getStudent_ID() {
		return Student_ID;
	}
	public void setStudent_ID(int student_ID) {
		Student_ID = student_ID;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getStudent_class() {
		return Student_class;
	}
	public void setStudent_class(String student_class) {
		Student_class = student_class;
	}
	
	
	

}
