package com.yash.student.service;

import java.util.List;

import com.yash.student.model.Student;

public interface StudentService {
	
	
	
	public List<Student> getAllStudents();
	public List<Student> addStudent(Student st);
	public List<Student> updateStudent();
	public List<Student> deleteStudent();
	
	
	
	

}
