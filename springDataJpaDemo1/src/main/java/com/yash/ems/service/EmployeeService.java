package com.yash.ems.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ems.Repository.EmployeeRepository;
import com.yash.ems.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	 public List<Employee> getAllEmployees()
	    {
	        List<Employee> employeeList = repository.findAll();
	         
	        if(employeeList.size() > 0) {
	            return employeeList;
	        } else {
	            return new ArrayList<Employee>();
	        }
	    }
	 public Employee createOrUpdateEmployee(Employee entity)  
	    {
	        Optional<Employee> employee = repository.findById(entity.getId());
	         
	        if(employee.isPresent()) 
	        {
	            Employee newEntity = employee.get();
	            newEntity.setName(entity.getName());
	            newEntity.setSalary(entity.getSalary());
	            newEntity.setDesg(entity.getDesg());
	            newEntity.setAddress(entity.getAddress());
	 
	            newEntity = repository.save(newEntity);
	             
	            return newEntity;
	        } else {
	            entity = repository.save(entity);
	             
	            return entity;
	        }
	    } 
	 
	 public Employee getEmployeeById(Long id) 
	    {
	        Optional<Employee> employee = repository.findById(id);
	         
	        if(employee.isPresent()) {
	            return employee.get();
	        } else {
	            return null;
	        }
	    }
	 
	 public void deleteEmployeeById(Long id)
	    {
	        Optional<Employee> employee = repository.findById(id);
	         
	        if(employee.isPresent()) 
	        {
	            repository.deleteById(id);
	        } else {
	            System.out.println("not found");
	        }
	    } 
}
