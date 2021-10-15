package org.ecom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.Employee;
import org.ecom.service.EmployeeService;

public class EmployeeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("EmployeeController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "employee-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employeeList = employeeService.getAllEmployee();
		
		//send value from java class to jsp 
		request.setAttribute("employeeList", employeeList);
		employeeService.connectionClose();
		
		requestDispatcher.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}
