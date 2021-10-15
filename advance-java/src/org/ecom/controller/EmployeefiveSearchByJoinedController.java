package org.ecom.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.Employeefive;
import org.ecom.service.EmployeefiveService;

public class EmployeefiveSearchByJoinedController extends HttpServlet {

	private static final long serialVersionUID = 8170467442791463622L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fromJoined = request.getParameter("fromJoinedDate");
		String toJoined = request.getParameter("toJoinedDate");
		
		System.out.println("search fromJoined "+fromJoined);
		System.out.println("search toJoined : "+toJoined);
		
		EmployeefiveService empService = new EmployeefiveService();
		
		try {
			
			List<Employeefive> empList = empService.getempByJoinedDate(Date.valueOf(fromJoined),Date.valueOf (toJoined));
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
