package org.Blah;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servelet1
 */
@WebServlet(description = "This is the first servelet", urlPatterns = { "/servlet1" })
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("userName");
		String userpass=request.getParameter("userPass");
		String male=request.getParameter("male");
		String female=request.getParameter("female");
		
		
		if  ((male!="" && female=="" )||(male!="" && female=="" )){
		
		 RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
	        rd.include(request, response);  
		
	}
		else {
			System.out.println("Please choose male or female");
		}

}}

