package org.ecom.student.shoaeeb.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.student.shoaeeb.service.EmployeeService;

public class EmployeeDeleteController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination = ProjectConstants.JSP_FOLDER_PATH+"shoaeeb/employee-list.jsp";
		String id =request.getParameter("employeeId");
		int employeeId = 0;
		try {
			 employeeId = Integer.valueOf(id);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		EmployeeService service = new EmployeeService();
		int executeUpdate=service.deleteEmployee(employeeId);
		response.sendRedirect("/advance-java/employee/list/shoaeeb");
	}
}
