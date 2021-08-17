package com.yash.ems.service;
/**
 * Employee serviceclass 
 * For initializing the ArrayList of Employee
 */

import java.util.ArrayList;
import java.util.List;

import com.yash.ems.model.Employee;

public class EmployeeService {
	
	
	
	public static ArrayList<Employee> e = new ArrayList<Employee>();
	static {
	e.add(new Employee("Ravi",101,"chennai","9876543210","manager",40000));
	e.add(new Employee("Anvesh",102,"hyderabad","9976543210","Trainee",45000));
	e.add(new Employee("Anuj",103,"pune","9076543210","developer",50000));
	e.add(new Employee("Aishwary",104,"gugoan","9176543210","devops",60000));
	e.add(new Employee("Dharmesh",105,"indore","9276543210","analyst",70000));

}
}
