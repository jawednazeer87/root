
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

public class EmployeefiveDetailController extends HttpServlet {

	private static final long serialVersionUID = -7234965939251486114L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String empIdStr = request.getParameter("empId");
		
		System.out.println("user detail do get empId: "+empIdStr);
		
		EmployeefiveService empService = new EmployeefiveService();
		
		try {
			long empId = Long.valueOf(empIdStr);
			Employeefive emp = empService.findeEmployeefiveById(empId);
			
			if(emp!=null) {
				
				//pass value to jsp 
				request.setAttribute("emp", emp);
				
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "Employeefive-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	}
	
}
