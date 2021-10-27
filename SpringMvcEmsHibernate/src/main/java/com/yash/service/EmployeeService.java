package com.yash.service;

import java.util.List;

import com.yash.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);

	List<Employee> getAllEmployees();

	void deleteEmployee(Integer employeeId);

	Employee getEmployee(int employeeid);

	Employee updateEmployee(Employee employee);
	
	
	
	

}
