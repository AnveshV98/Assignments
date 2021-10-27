package com.yash.emsDaoImpl;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.yash.emsDao.EmployeeDao;
import com.yash.model.Employee;
import com.yash.util.EmployeeUtil;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	
	//EmployeeUtil eu = new EmployeeUtil();
	@Override
	public List<Employee>  getAllEmployees() throws ClassNotFoundException, SQLException {
		
		List<Employee> list = new ArrayList<Employee>();
		Logger log = Logger.getAnonymousLogger();
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeyash","root","root");
		System.out.println("Database connected");
		log.info("Database connected");

		
		System.out.println("database connected");
		Statement st = (Statement)con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		
		while(rs.next()){
			Employee e=new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getDouble(3));
			e.setAddress(rs.getString(4));
			
			list.add(e);
			}
			con.close();
			return list;
	}

}
