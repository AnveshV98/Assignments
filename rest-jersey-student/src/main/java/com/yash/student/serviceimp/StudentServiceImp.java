package com.yash.student.serviceimp;

import java.util.ArrayList;
import java.util.List;

import com.yash.student.model.Student;
import com.yash.student.service.StudentService;

public class StudentServiceImp implements StudentService {

	
	List<Student> stud = new ArrayList<Student>();
	

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub

		stud.add(new Student(101,"Ravi","Hyderabad"));
		stud.add(new Student(102,"Anvesh","Indore"));
		stud.add(new Student(103,"Harshada","pune"));
		return stud;
	}


	@Override
	public List<Student> addStudent(Student st) {
		
		
		
		stud.add(st);
		return stud;
	}


	@Override
	public List<Student> updateStudent() {
		// TODO Auto-generated method stub
		return stud;
	}


	@Override
	public List<Student> deleteStudent() {
		// TODO Auto-generated method stub
		return stud;
	}

	
	
	

}
