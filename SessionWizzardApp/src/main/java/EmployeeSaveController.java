

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployeeSaveController
 */
@WebServlet("/EmployeeSaveController")
public class EmployeeSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {



			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			HttpSession session=request.getSession();


			Connection con = DatabaseCon.initializeDatabase();

			PreparedStatement st = con
					.prepareStatement("insert into empdetails values(?, ?, ?, ?)");



			st.setString(1, (String)session.getAttribute("empName"));
			st.setString(2, (String)session.getAttribute("empContact"));

			st.setString(3, request.getParameter("email"));
			st.setString(4, request.getParameter("address"));


			st.executeUpdate();


			st.close();
			con.close();


			PrintWriter out1 = response.getWriter();
			out1.println("<html><body><b>Successfully Inserted"
					+ "</b></body></html>");



			//		out.println("Name: "+name);
			//		out.println("<br>Contact: "+contact);
			//		out.println("<br>Email: "+email);
			//		out.println("<br>Address: "+address);


		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
