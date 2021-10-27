package com.yash.dao;

import java.util.List;

import com.yash.model.Employee;

public interface EmployeeDao {
	
	  public List <Employee> getEmployees();

	    public void saveEmployee(Employee theEmployee);

	    public Employee getEmployee(int theId);

	    public void deleteEmployee(int theId);

}
