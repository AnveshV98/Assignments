package com.yash.jdbc_demos;
/**
 * carApp is reponsible for performing CRUD operations using carshopdb
 */

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class CarApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try {
		
		Logger log = Logger.getAnonymousLogger();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/carshopdb","root","root");
//		System.out.println("Database connected");
		log.info("Database connected");
		
		Statement st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery("select * from carDetails");
		ResultSet rs1 = st.executeQuery("select * from engineDetails");
		//to perform CRUD Operations
		
		/* create table  */
		
//		st.execute("create table carDetails(reg_num int, owner_name varchar(35), type varchar(35), engine varchar(35))");
//		System.out.println("table created");
		
		/* update table */
		
//		st.executeUpdate("insert into carDetails values(101,'Ravi','Maruthi','K15B12')");
//		log.info("values added");
		
		/* reading from table*/
		
		while(rs1.next()) {
			log.info("engine details:" +rs1.getInt(1)+" |"+rs1.getDate(2)+" |"+rs1.getString(3));
		}
		
//		while(rs.next()) {
//			log.info("car details:" +rs.getInt(1)+" |"+rs.getString(2)+" |"+rs.getString(3)+" |"+rs.getString(4));
//		}
//		
		/* deleting record*/
		
//		st.execute("delete from engineDetails where reg_num=105");
//		log.info("values deleted");
//		

//		while(rs.next()) {
//			log.info("car details:" +rs.getInt(1)+" |"+rs.getDate(2)+" |"+rs.getString(3));
//		}
//		log.info("record deleted");
		con.close();
		st.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	
	}

}
