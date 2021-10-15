package org.ecom.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;

public class StudentController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("StudentController doGet method");
		String name = request.getParameter("studentName");
		System.out.println("name value: "+name);
		String destination = ProjectConstants.JSP_FOLDER_PATH + "student-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		request.setAttribute("responceCode", "20033");
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
