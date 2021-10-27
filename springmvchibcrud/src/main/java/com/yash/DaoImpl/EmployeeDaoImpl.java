package com.yash.DaoImpl;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.Dao.EmployeeDao;
import com.yash.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	 private SessionFactory sessionFactory;
	
	 
	 

	@Override
	@Transactional
	public List<Employee> getEmployee() {
		
		Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery <Employee> cq = cb.createQuery(Employee.class);
        Root <Employee> root = cq.from(Employee.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
		
		  Session currentSession = sessionFactory.getCurrentSession();
	        currentSession.saveOrUpdate(theEmployee);
	}

}
