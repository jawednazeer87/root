package org.ecom.asif.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.asif.model.Employee;
import org.ecom.asif.service.EmployeeService;
import org.ecom.constant.ProjectConstants;

public class EmployeeSearchController extends HttpServlet {

	private static final long serialVersionUID = 8170467442791463622L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		
		System.out.println("search user by name: "+name);
		EmployeeService employeeService = new EmployeeService();
		try {
			List<Employee> employeeList = employeeService.getEmployeeByName(name);
			request.setAttribute("employeeList", employeeList);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "asif/employee-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	
	
}
