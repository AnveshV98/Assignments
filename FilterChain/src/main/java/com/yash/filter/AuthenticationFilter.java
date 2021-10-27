package com.yash.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {
	
	/**
	 * @see Filter#init(FilterConfig)
	 */
	
	Logger log = Logger.getAnonymousLogger();
	public void init(FilterConfig fConfig) throws ServletException {
		log.info("----------------------");
		log.info("init method"+this.getClass().getName());
	}
	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
//		log.info("doFilter method called"+this.getClass().getName());
		HttpServletRequest req =(HttpServletRequest) request;
		HttpServletRequest res =(HttpServletRequest) response;
//		
//		String userName = req.getParameter("username");
//		String passWord = req.getParameter("password");
//		
//		
//		if(!(userName.equalsIgnoreCase("anvesh") && passWord.equalsIgnoreCase("anvesh"))) {
//			
//			log.info("##############");
//			log.info("unothorized request");
//			log.info("##############");
//			
////			   RequestDispatcher rd=req.getRequestDispatcher("index.html");  
////			   rd.include(request, response); 
//			
//		}else {
//			chain.doFilter(request, response);
//		}
		
	    PrintWriter out=response.getWriter();  
        
	    String passWord=req.getParameter("password");  
	    if(passWord.equals("admin")){  
	    chain.doFilter(request, response);//sends request to next resource  
	    }  
	    else{  
	    out.print("username or password error!");  
	    RequestDispatcher rd=req.getRequestDispatcher("index.html");  
	    rd.include(request, response);  
	    }  
		
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
