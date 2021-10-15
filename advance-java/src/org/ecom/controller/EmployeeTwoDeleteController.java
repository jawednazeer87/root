package org.ecom.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.service.EmployeeTwoService;

public class EmployeeTwoDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeetwoidStr = request.getParameter("employeetwoid");
		System.out.println("employeetwoid: "+employeetwoidStr);
		
		EmployeeTwoService employeetwoService = new EmployeeTwoService();
		try {
			long employeetwoid = Long.valueOf(employeetwoidStr);
			employeetwoService.deleteEmployeeTwoById(employeetwoid);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/EmployeeTwo/list");
	}

}
