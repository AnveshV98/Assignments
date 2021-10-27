
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// This class can be used to initialize the database connection
public class DatabaseCon {
	protected static Connection initializeDatabase()
		throws SQLException, ClassNotFoundException
	{
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/employeedb","root","root");

		return con;
	}
}