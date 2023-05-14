package org.ecom.jawed.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.jawed.model.Employee;
import org.ecom.jawed.service.EmployeeService;

public class EmployeeListController  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("EmployeeListController doGet");
		
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employeeList = employeeService.getAllEmployee();
		request.setAttribute("employeeList", employeeList);
		String destination = ProjectConstants.JSP_FOLDER_PATH + "asif/employee-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
