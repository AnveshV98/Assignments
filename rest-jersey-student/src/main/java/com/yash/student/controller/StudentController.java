package com.yash.student.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.student.model.Student;
import com.yash.student.serviceimp.StudentServiceImp;





@Path("/student")
public class StudentController {
	
	StudentServiceImp si = new StudentServiceImp();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public List getAllStudents() {
		
		List listOfStudents = si.getAllStudents();
		
		return listOfStudents;
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List addStudent(Student st) {
		return si.addStudent(st);
	}

}
