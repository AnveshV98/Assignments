package com.yash.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.dao.EmployeeDao;
import com.yash.model.Employee;
import com.yash.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	    @Autowired
	    private EmployeeDao employeeDao;

	    @Override
	    @Transactional
	    public List <Employee> getEmployees() {
	        return employeeDao.getEmployees();
	    }

	    @Override
	    @Transactional
	    public void saveEmployee(Employee theEmployee) {
	        employeeDao.saveEmployee(theEmployee);
	    }

	    @Override
	    @Transactional
	    public Employee getEmployee(int theId) {
	        return employeeDao.getEmployee(theId);
	    }

	    @Override
	    @Transactional
	    public void deleteEmployee(int theId) {
	        employeeDao.deleteEmployee(theId);
	    }

}
