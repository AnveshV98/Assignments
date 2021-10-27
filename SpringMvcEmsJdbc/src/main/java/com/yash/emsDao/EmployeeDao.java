package com.yash.emsDao;

import java.sql.SQLException;
import java.util.List;

import com.yash.model.Employee;


public interface EmployeeDao {
	
	public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException;
	

}
