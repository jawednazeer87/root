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
import org.ecom.model.EmployeeTwo;
import org.ecom.service.EmployeeTwoService;

public class EmployeeTwoJoinedDateController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fromJoinedDate = request.getParameter("fromJoinedDate");
		String toJoinedDate = request.getParameter("toJoinedDate");
		
		System.out.println("search fromJoined "+fromJoinedDate);
		System.out.println("search toJoined : "+toJoinedDate);
		
		EmployeeTwoService employeetwoService = new EmployeeTwoService();
		
		try {
			
			List<EmployeeTwo> employeetwoList = employeetwoService.findByJoinedDate(Date.valueOf(fromJoinedDate),Date.valueOf (toJoinedDate));
			request.setAttribute("employeetwoList", employeetwoList);
			employeetwoService.connectionClose();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "EmployeeTwo-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}

}
