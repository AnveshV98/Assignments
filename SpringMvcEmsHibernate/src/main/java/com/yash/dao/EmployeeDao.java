package com.yash.dao;

import java.util.List;

import com.yash.model.Employee;

public interface EmployeeDao {
	
	public void addEmployee(Employee employee);
	 
    public List<Employee> getAllEmployees();
 
    public void deleteEmployee(Integer employeeId);
 
    public Employee updateEmployee(Employee employee);
 
    public Employee getEmployee(int employeeid);

}
