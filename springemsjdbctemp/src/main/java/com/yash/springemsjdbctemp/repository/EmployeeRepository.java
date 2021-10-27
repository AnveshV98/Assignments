package com.yash.springemsjdbctemp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.springemsjdbctemp.model.Employee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	JdbcTemplate template;
	
	/**
	 * getting all employees
	 * @return
	 */
	  public List<Employee> getAllEmployees(){
	        List<Employee> employees = template.query("select id, name,salary,desg,address from emp_jdbctemp",(result,rowNum)->new Employee(result.getInt("id"),
	                result.getString("name"),result.getDouble("salary"),result.getString("desg"),result.getString("address")));
	        return employees;
	    }
	  
	  /*Getting a specific employee by employee id from table*/
	  public Employee findById(int id) {
		  return template.queryForObject("SELECT * FROM emp_jdbctemp WHERE id=?", new BeanPropertyRowMapper<Employee>(Employee.class), id);
		  }
	    
	  /**
	   * update employee record
	   */
	  public int update(Employee e,int id) {
		  
		  return template.update("UPDATE emp_jdbctemp SET name=?,salary=?,desg=?,address=? WHERE id=?", new Object[] {e.getName(),e.getSalary(),e.getDesg(),e.getAddress(),id});
		  
	  }
	  
	  /**
	   * delete record
	   */
	  
	  public int deleteById(int id) {
		  
		  return template.update("DELETE FROM emp_jdbctemp WHERE id=?",id);
	  }
	  /**
	   * add employee
	   */
	  
	  public int addEmployee(Employee e) {
		  
		  return template.update("INSERT INTO emp_jdbctemp(id,name,salary,desg,address) VALUES (?,?,?,?,?)", new Object[] {e.getId(),e.getName(),e.getSalary(),e.getDesg(),e.getAddress()});
	  }
	  
	  /**
	   * search by employee by name
	   */
	  
	  public Employee findByName(String name) {
		  
		  return template.queryForObject("SELECT * FROM emp_jdbctemp WHERE name=?", new BeanPropertyRowMapper<Employee>(Employee.class), name);
	  }
}
