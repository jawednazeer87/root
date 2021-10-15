package org.ecom.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.service.EmployeeService;

@WebServlet("/EmployeeDeleteController")
public class EmployeeDeleteController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeeIdStr = request.getParameter("employeeId");
		System.out.println("employeeIdStr: "+employeeIdStr);
		
		EmployeeService employeeService = new EmployeeService();
		try {
			long employeeId = Long.valueOf(employeeIdStr);
			employeeService.deleteEmployeeById(employeeId);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/employeeController/list");  
	}

}
