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

public class EmployeefiveController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("EmployeefiveController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "Employeefive-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		EmployeefiveService empService = new EmployeefiveService();
		List<Employeefive> empList = empService.getAllEmployeefives();
		
		//send value from java class to jsp 
		request.setAttribute("empList", empList);
		empService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
