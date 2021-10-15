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


@WebServlet("/EmployeeUpdateController")
public class EmployeeUpdateController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeeIdStr = request.getParameter("employeeId");
		
		System.out.println("employee update do get employeeId: "+employeeIdStr);
		
		EmployeeService employeeService = new EmployeeService();
		
		try {
			long employeeId = Long.valueOf(employeeIdStr);
			Employee employee = employeeService.findEmployeeById(employeeId);
			
			if(employee!=null) {
				request.setAttribute("employee", employee);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "employee-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeeIdStr = request.getParameter("employeeId");
		
		System.out.println("employee update do get employeeId: "+employeeIdStr);
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String salary = request.getParameter("salary");
		
		
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);

	
		EmployeeService employeeService = new EmployeeService();

		try {
			
			int employeeId = Integer.valueOf(employeeIdStr);
			

			Employee employee = new Employee();

			employee.setId(employeeId);
			employee.setName(name);
			employee.setAge(Integer.valueOf (age));
			employee.setSalary(salary);

	 		employeeService.updateEmployee(employee);
     
		} 
		catch (Exception e) {
            e.printStackTrace();
        }
		
		employeeService.connectionClose();

		//to avoid form submission
		response.sendRedirect("/advance-java/employeeController/list");  
	}
	

}
