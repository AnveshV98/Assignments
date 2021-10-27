package second.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculations
 */
@WebServlet("/Calculations")
public class Calculations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculations() {
        super();
        // TODO Auto-generated constructor stub
    }
    public int add() {
    	int a=3;
    	int b=4;
    	
		return a+b;
    }
    public void show() {
    	String msg="hello world";
    
    	
    }
    
   
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Addition of two numbers:</h1> "+add());
		
	}
	
	 

}
