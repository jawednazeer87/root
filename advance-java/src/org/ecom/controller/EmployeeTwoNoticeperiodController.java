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

public class EmployeeTwoNoticeperiodController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String noticePeriod = request.getParameter("notice_period");
	
	System.out.println("search employeetwo by NoticePeriod: "+noticePeriod);
	
	EmployeeTwoService employeetwoService = new EmployeeTwoService();
	
	try {
		
		List<EmployeeTwo> employeetwoList = employeetwoService.getempByNoticePeriod(Integer.valueOf(noticePeriod));
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
