package com.yash.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;

public class EmployeeUtil {

	public  Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		Logger log = Logger.getAnonymousLogger();
		Class.forName("com.mysql.jdbc.Driver");
		 con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeyash","root","root");
		System.out.println("Database connected");
		log.info("Database connected");
		return con;
	}

}
