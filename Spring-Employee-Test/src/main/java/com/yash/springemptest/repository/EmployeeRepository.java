package com.yash.springemptest.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.springemptest.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public Employee findByName(String name);

	public Employee deleteByName(String name);
	
}
