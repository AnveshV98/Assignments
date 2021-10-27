package com.yash.springemsjdbctemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springemsjdbctemp.model.Employee;
import com.yash.springemsjdbctemp.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@RequestMapping("/getAllEmployees")
	@ResponseBody
	public List<Employee> getAllEmployees(){
		
		return employeeRepo.getAllEmployees();
	}
	
	@GetMapping("/getemployee/{id}")
	public Employee findById(@PathVariable int id) {
	return employeeRepo.findById(id);
	}
	 
	@PutMapping("/updateEmployee/{id}")
	public String update(@RequestBody Employee e,@PathVariable int id) {
		
		return employeeRepo.update(e, id)+"employee record updated";
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String delete(@PathVariable int id) {
		
		return employeeRepo.deleteById(id)+"employee rocord deleted";
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee e) {
		
		return employeeRepo.addEmployee(e)+"employee record added";
	}
	
	@GetMapping("/getEmployee/{name}")
	public Employee findByName(@PathVariable String name) {
		return employeeRepo.findByName(name);
	}

    }

