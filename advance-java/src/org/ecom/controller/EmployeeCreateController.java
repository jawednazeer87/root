package org.ecom.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.Employee;
import org.ecom.service.EmployeeService;

@WebServlet("/EmployeeCreateController")
public class EmployeeCreateController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String destination = ProjectConstants.JSP_FOLDER_PATH + "employee-create.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		System.out.println("employee add do get");
		requestDispatcher.forward(request, response);
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String salary = request.getParameter("salary");

		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);

	
	
	try {
		EmployeeService employeeService = new EmployeeService();

			Employee employee = new Employee();
			employee.setName(name);
			employee.setAge(Integer.valueOf (age));
			employee.setSalary(salary);

			employeeService.createEmployee(employee);
	 		
        } 
		catch (Exception e) {
            e.printStackTrace();
        }
		
		
		//to avoid form submission
		  response.sendRedirect("/advance-java/employeeController/list"); 
		  
	}
	
}
