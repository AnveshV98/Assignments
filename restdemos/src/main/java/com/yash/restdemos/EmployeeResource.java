package com.yash.restdemos;

import javax.ws.rs.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employees")
public class EmployeeResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	
	public Employee getEmpDetails() {
		
		System.out.println("getempDetails called...");
		Employee e1=new Employee();
		e1.setEmp_id(101);
		e1.setEmp_name("Ravi");
		e1.setSalary(25000);
		return e1;
		
	}

}
