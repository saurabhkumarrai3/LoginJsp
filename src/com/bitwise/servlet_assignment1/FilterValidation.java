package com.bitwise.servlet_assignment1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

//import com.sun.javafx.collections.MappingChange.Map;

/**
 * Servlet Filter implementation class Validate
 */
@WebFilter("/Validate")
public class FilterValidation implements Filter {

	public FilterValidation() {
		
	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		Storage st = new Storage();
		PrintWriter out = response.getWriter();

		String username = request.getParameter("name");
		String pass = request.getParameter("password");
		if (username != null && pass != null) {
			if (st.returnKeyValue(username.toLowerCase(), pass.toLowerCase())) {
				chain.doFilter(request, response);
			} else {

				out.println("<br><font >Invalid Credentials</font>");
				request.getRequestDispatcher("login.html").include(request, response);

			}
		} else {
			out.println("<br><font>Invalid Credential</font><br>");
			request.getRequestDispatcher("login.html").include(request, response);

		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
