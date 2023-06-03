package org.ecom.student.shoaeeb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.student.shoaeeb.model.Employee;
import org.ecom.student.shoaeeb.service.EmployeeService;

public class EmployeeSearchController extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination = ProjectConstants.JSP_FOLDER_PATH+"shoaeeb/employee-list.jsp";
		String date = request.getParameter("date");
		System.out.println(date);
	  EmployeeService service = new EmployeeService();
	  List<Employee> list = service.findEmployeeByDate(date);
	  //continue from here
	  request.setAttribute("employeeList", list);
	  RequestDispatcher rd = request.getRequestDispatcher(destination);
	  try {
		  rd.forward(request, response);
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	}
	
}

