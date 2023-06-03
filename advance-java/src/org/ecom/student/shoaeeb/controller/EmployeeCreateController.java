package org.ecom.student.shoaeeb.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.student.shoaeeb.service.EmployeeService;
import org.ecom.student.shoaeeb.model.Employee;

public class EmployeeCreateController extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String destination = ProjectConstants.JSP_FOLDER_PATH+"shoaeeb/employee-create.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(destination);
		try {
			rd.forward(request, response);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("fname");
		String lastName=request.getParameter("lname");
		String fatherName=request.getParameter("fatherName");
		String dob = request.getParameter("dob");
		String email=request.getParameter("email");
		String genderString = request.getParameter("gender");
		String country = request.getParameter("country");
		Employee employee=new Employee();

		
		//06/21/2023
		try {
			Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse(dob);
			employee.setDob(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate=formatter.format(date);
		try {
			Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse(strDate);
			employee.setCreateDate(date1);
			employee.setUpdateDate(date1);	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setFatherName(fatherName);
		employee.setEmail(email);
		boolean gender = Boolean.parseBoolean(genderString);
		employee.setGender(gender);
		employee.setCountry(country);
		
		
		EmployeeService service = new EmployeeService();
		service.createEmployee(employee);
		response.sendRedirect("/advance-java/employee/list/shoaeeb");
	}
}

