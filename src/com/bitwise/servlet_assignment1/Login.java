package com.bitwise.servlet_assignment1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
// @WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(true);
		String sid = session.getId();

		session.setAttribute("name", request.getParameter("name"));
		session.setAttribute("sid", sid);
		session.setMaxInactiveInterval(24*60);

		if (session.isNew()) {
			out.print("<<br>Welcome, " + request.getParameter("name"));
			out.print("<br><font> create your profile</font> <br>");
			request.getRequestDispatcher("signUp.html").include(request, response);
		} else {
			out.println("<br><h1> Welcome Back</h1> " + session.getAttribute("name"));
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
