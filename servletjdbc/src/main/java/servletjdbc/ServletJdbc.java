package servletjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Driver;
/**
 * Servlet implementation class ServletJdbc
 */


@WebServlet("/ServletJdbc")
public class ServletJdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			 response.setContentType("text/html");
		       
           
            Connection con = DatabaseConnection.initializeDatabase();
  
            PreparedStatement st = con
                   .prepareStatement("insert into servlet values(?, ?)");
  
          
            st.setInt(1, Integer.valueOf(request.getParameter("id")));
  
           
            st.setString(2, request.getParameter("name"));
  
            
            st.executeUpdate();
  
            
            st.close();
            con.close();
  
           
            PrintWriter out = response.getWriter();
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}

}
