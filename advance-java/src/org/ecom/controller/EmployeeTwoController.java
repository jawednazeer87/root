package org.ecom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.EmployeeTwo;
import org.ecom.service.EmployeeTwoService;

public class EmployeeTwoController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EmployeeTwoController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "EmployeeTwo-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		EmployeeTwoService employeetwoService = new EmployeeTwoService();
		List<EmployeeTwo> employeetwoList = employeetwoService.getAllEmployeeTwo();
		
		//send value from java class to jsp 
		request.setAttribute("employeetwoList", employeetwoList);
		employeetwoService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
