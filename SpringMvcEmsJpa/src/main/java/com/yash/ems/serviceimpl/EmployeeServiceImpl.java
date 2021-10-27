package com.yash.ems.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.ems.model.Employee;
import com.yash.ems.repository.EmployeeRepository;
import com.yash.ems.service.EmployeeService;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository repository;
	
	public EmployeeServiceImpl() {
		
		
		
	}
	
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}



	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Employee employee = repository.findById(id).get();
		return employee;
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		try {
			repository.save(employee);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

}
