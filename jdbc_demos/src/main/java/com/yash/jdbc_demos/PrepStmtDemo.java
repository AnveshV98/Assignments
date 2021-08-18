package com.yash.jdbc_demos;

import java.sql.DriverManager;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PrepStmtDemo {

	public static void main(String[] args) {
		try {
			
		Logger log = Logger.getAnonymousLogger();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
		log.info("Database connected");
		
		String sql = "insert into contactdetails(phone,name,email) values(?,?,?)";
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
		pstmt.setString(1, "7788990021");
		pstmt.setString(2, "Anvesh");
		pstmt.setString(3, "anvesh@gmail.com");
		pstmt.addBatch();
		
		pstmt.setString(1, "7788990011");
		pstmt.setString(2, "Ravi");
		pstmt.setString(3, "ravi@gmail.com");
		pstmt.addBatch();
		
		pstmt.setString(1, "7788990020");
		pstmt.setString(2, "Anuj");
		pstmt.setString(3, "anuj@gmail.com");
		pstmt.addBatch();
		
		pstmt.setString(1, "8888990021");
		pstmt.setString(2, "Aishwary");
		pstmt.setString(3, "aishwary@gmail.com");
		pstmt.addBatch();
		
		pstmt.setString(1, "8788990021");
		pstmt.setString(2, "Dharmesh");
		pstmt.setString(3, "Dharmesh@gmail.com");
		pstmt.addBatch();
		
		
		pstmt.executeBatch();
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
