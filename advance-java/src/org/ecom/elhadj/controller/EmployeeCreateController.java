package org.ecom.elhadj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.elhadj.model.Employee;
import org.ecom.elhadj.service.EmployeeService;
import org.ecom.constant.ProjectConstants;

public class EmployeeCreateController extends HttpServlet {

	private static final long serialVersionUID = 6467649553058598678L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String destination = ProjectConstants.JSP_FOLDER_PATH + "elhadj/employee-create.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		System.out.println("employee add do get");
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String ageString = request.getParameter("age");
		String salary = request.getParameter("salary");
		int age = Integer.valueOf(ageString);
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
		
		EmployeeService employeeService = new EmployeeService();
		
		try {
			Employee employee = new Employee();
			employee.setAge(age);
			employee.setSalary(salary);
			employee.setName(name);
			employeeService.createEmployee(employee);
        } 
		catch (Exception e) {
            e.printStackTrace();
        }
		
		employeeService.connectionClose();
		
		//to avoid form submission
		response.sendRedirect("/advance-java/employee/list/elhadj");  
	}
	
}
