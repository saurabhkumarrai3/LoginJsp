package com.bitwise.servlet_assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Profile
 */
// @WebServlet("/Profile")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (request.getSession(false) == null) {
			out.println("<h3>Login First. </h3> ");
			request.getRequestDispatcher("index.html").include(request, response);
		}

		else {
			String firstname = request.getParameter("First_Name");
			String lastname = request.getParameter("Last_Name");
			String emailid = request.getParameter("Email_id");
			String mobile = request.getParameter("Mobile_no");

			if (emailid != null && firstname.matches("[a-zA-Z]+") && lastname.matches("[a-zA-Z]+")
					&& mobile.length() == 10) {
				out.println("<br>\tFirst Name\t:\t" + firstname);
				out.println("<br>\tLast Name\t:\t" + lastname);
				out.println("<br>\tEmail id\t:\t" + emailid);
				out.println("<br>\tMobile No\t:\t" + mobile);
				request.getRequestDispatcher("EducationalInfo.html").include(request, response);


			} else {
				out.println("<br><font>Invalid values!!!</font>");
				request.getRequestDispatcher("signUp.html").include(request, response);
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
