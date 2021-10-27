package com.yash.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.dao.EmployeeDao;
import com.yash.model.Employee;
import com.yash.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		
		employeeDao.addEmployee(employee);
		
	}

	
	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		
		return employeeDao.getAllEmployees();
	}

	
	@Override
	@Transactional
	public void deleteEmployee(Integer employeeId) {
		
		employeeDao.deleteEmployee(employeeId);
		
	}

	
	@Override
	public Employee getEmployee(int employeeid) {
		
		return employeeDao.getEmployee(employeeid);
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeDao.updateEmployee(employee);
	}


	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	
}
