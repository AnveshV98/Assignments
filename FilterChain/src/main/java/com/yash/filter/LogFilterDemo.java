package com.yash.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFilterDemo
 */
@WebFilter("/LogFilterDemo")
public class LogFilterDemo implements Filter {

	Logger log = Logger.getAnonymousLogger();

	public void init(FilterConfig fConfig) throws ServletException {
		
		
		 
		 log.info("init method called"+this.getClass().getName());
		 
		log.info("-------------------------------------------");
		
	}

	

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		log.info("doFilter method is called"+this.getClass().getName());
		
		PrintWriter out=response.getWriter();
		HttpServletRequest req = (HttpServletRequest)request;
		String ipAddress = req.getRemoteAddr();
		String path = req.getPathInfo();
		log.info(path);
		log.info("IP"+ipAddress+",time"+new Date().toString());
		
		
		chain.doFilter(request, response);
		
	
	
	}


	public void destroy() {
		
	}
}
