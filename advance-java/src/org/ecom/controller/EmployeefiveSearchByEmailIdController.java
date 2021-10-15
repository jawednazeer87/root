package org.ecom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.Employeefive;
import org.ecom.service.EmployeefiveService;

public class EmployeefiveSearchByEmailIdController extends HttpServlet {

	private static final long serialVersionUID = 8170467442791463622L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String emailId = request.getParameter("Email");
		
		System.out.println("search employee by emailId: "+emailId);
		
		EmployeefiveService empService = new EmployeefiveService();
		
		try {
			
			List<Employeefive> empList = empService.getempByEmailId(emailId);
			request.setAttribute("empList", empList);
			empService.connectionClose();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "Employeefive-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	
	
}
