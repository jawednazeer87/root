package org.ecom.student.shoaeeb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.student.shoaeeb.model.Employee;
import org.ecom.student.shoaeeb.service.EmployeeService;

public class EmployeeDetailsController extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String destination = ProjectConstants.JSP_FOLDER_PATH+"shoaeeb/employee-details.jsp";
	 int id= Integer.parseInt(request.getParameter("employeeId"));
	 EmployeeService service = new EmployeeService();
	 Employee employee = service.getEmployeeDetails(id);
	 //sent to jsp page
	 request.setAttribute("employee", employee);
	 RequestDispatcher rd = request.getRequestDispatcher(destination);
	 try {
		 rd.forward(request, response);
	 }catch(Exception e)
	 {
		 System.out.println("something went wrong");
	 }
	}
}
