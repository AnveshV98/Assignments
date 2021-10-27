package servletjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// This class can be used to initialize the database connection
public class DatabaseConnection {
	protected static Connection initializeDatabase()
		throws SQLException, ClassNotFoundException
	{
		// Initialize all the information regarding
		// Database Connection
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/employeedb","root","root");
		// Database name to access
//		String dbName = "employeedb";
//		String dbUsername = "root";
//		String dbPassword = "root";

//		Class.forName(dbDriver);
//		Connection con = DriverManager.getConnection(dbURL + dbName,
//													dbUsername,
//													dbPassword);
		return con;
	}
}
