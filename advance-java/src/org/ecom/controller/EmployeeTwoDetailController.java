package org.ecom.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.EmployeeTwo;
import org.ecom.service.EmployeeTwoService;

public class EmployeeTwoDetailController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeetwoidStr = request.getParameter("employeetwoid");
		
		System.out.println("EmployeeTwo detail do get employeetwoid: "+employeetwoidStr);
		
		EmployeeTwoService employeetwoService = new EmployeeTwoService();
		
		try {
			long employeetwoid = Long.valueOf(employeetwoidStr);
			EmployeeTwo employeetwo = employeetwoService.findEmployeeTwoById(employeetwoid);
			
			if(employeetwo!=null) {
				
				//pass value to jsp 
				request.setAttribute("employeetwo", employeetwo);
			}
				
			
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			long employeetwoid = Long.valueOf(employeetwoidStr);
			EmployeeTwo employeetwo = employeetwoService.findEmployeeTwoById(employeetwoid);
			
			if(employeetwo!=null) {
				
				//pass value to jsp 
				request.setAttribute("employeetwo", employeetwo);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "EmployeeTwo-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	}
	
}
