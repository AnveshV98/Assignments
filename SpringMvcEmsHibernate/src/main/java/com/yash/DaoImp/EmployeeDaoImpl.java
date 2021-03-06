package com.yash.DaoImp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.dao.EmployeeDao;
import com.yash.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addEmployee(Employee employee) {

		 sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		
		return sessionFactory.getCurrentSession().createQuery("from Employee")
                .list();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(
                Employee.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }

	}

	@Override
	public Employee updateEmployee(Employee employee) {
		 sessionFactory.getCurrentSession().update(employee);
	        return employee;
	}

	@Override
	public Employee getEmployee(int employeeid) {
		return (Employee) sessionFactory.getCurrentSession().get(
                Employee.class, employeeid);
	}

}
