package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogServletDemo
 */
@WebServlet("/LogServletDemo")
public class LogServletDemo extends HttpServlet {
	Logger log = Logger.getAnonymousLogger();
	private static final long serialVersionUID = 1L;
	
	
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Hello world <br>");
	}

}
