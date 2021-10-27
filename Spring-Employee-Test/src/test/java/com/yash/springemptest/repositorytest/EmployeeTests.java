package com.yash.springemptest.repositorytest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.yash.springemptest.model.Employee;
import com.yash.springemptest.repository.EmployeeRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EmployeeTests {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Test
	@Rollback(false)
	public void testCreateEmployee() {
		Employee emp = new Employee(101,"Anvesh",10000,"hyd");
		Employee savedEmployee = repo.save(emp);
		assertNotNull(savedEmployee);
	}
	
	@Test
	public void testFindEmployeeByName() {
		String name="Anvesh";
		Employee emp = repo.findByName(name);
		assertThat(emp.getName()).isEqualTo(name);
	}
	
	@Test
	@Rollback(false)
	public void testUpdateEmployee() {
		String employeeName = "dharmesh";
		
		Employee emp = new Employee(10,employeeName,10000,"hyd");
		emp.setId(10);
		
		repo.save(emp);
		Employee updateEmployee = repo.findByName(employeeName);
		assertThat(updateEmployee.getName()).isEqualTo(employeeName);
		
	}
	
	@Test
	public void testListEmployees() {
		List<Employee> employees = (List<Employee>) repo.findAll();
		for(Employee empl:employees) {
			System.out.println(empl);
		}
		assertThat(employees).size().isGreaterThan(0);
		
	}
	
	@Test
	@Rollback(false)
	public void testDeleteEmployee() {
		int id=3;
		
		boolean isExistBeforeDelete = repo.findById(id).isPresent();
		
		repo.deleteById(id);
		
		boolean notExistAfterDelete = repo.findById(id).isPresent();
		
		assertTrue(isExistBeforeDelete);
		assertFalse(notExistAfterDelete);
		
	}
	
}
