package org.ecom.controller;

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
import org.ecom.model.EmployeeTwo;
import org.ecom.service.EmployeeTwoService;

public class EmployeeTwoUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employeetwoidStr = request.getParameter("employeetwoid");
		
		System.out.println(" EmployeeTwo update do get employeetwoid: "+employeetwoidStr);
		
		EmployeeTwoService employeetwoService = new EmployeeTwoService();
		
		try {
			long employeetwoid = Long.valueOf(employeetwoidStr);
			EmployeeTwo employeetwo = employeetwoService.findEmployeeTwoById(employeetwoid);
			
			if(employeetwo!=null) {
				request.setAttribute("employeetwo", employeetwo);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "EmployeeTwo-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employeetwoidStr = request.getParameter("employeetwoid");
		
		System.out.println("EmployeTwo update do get employeetwoid: "+employeetwoidStr);
		
		String Name = request.getParameter("name");
		String email = request.getParameter("email");
		String dobString = request.getParameter("dob");
		String JoinedString = request.getParameter("jdate");
		String ReleaseString = request.getParameter("rdate");
		String NoticePeriod = request.getParameter("notice_period");
		String genderString = request.getParameter("gender");
	
		
		System.out.println("Name: "+Name);
		System.out.println("email: "+email);
		System.out.println("dob String: "+dobString);
		System.out.println("Joined String: "+JoinedString);
		System.out.println("Release String: "+ReleaseString);
		System.out.println("Notice Period: "+NoticePeriod);
		System.out.println("gender: "+genderString);
		
		boolean gender = false;
		if(genderString!=null) {
			gender = Boolean.parseBoolean(genderString);
		}
		
		EmployeeTwoService employeetwoService = new EmployeeTwoService();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		Date dob = null;
		Date jdate = null;
		Date rdate = null;

		try {	
			int employeetwoid = Integer.valueOf(employeetwoidStr);
			
			dob = formatter.parse(dobString);
	        System.out.println(dob);
	        jdate = formatter.parse(JoinedString);
	        System.out.println(jdate);
	        rdate = formatter.parse(ReleaseString);
	        System.out.println(rdate);

			EmployeeTwo employeetwo = new EmployeeTwo();
			employeetwo.setId(employeetwoid);
			employeetwo.setName(String.valueOf(Name));
			employeetwo.setDob(dob);
			employeetwo.setEmail(String.valueOf(email));
			employeetwo.setGender(gender);
			employeetwo.setJoined_date(jdate);
			employeetwo.setRelease_date(rdate);
			employeetwo.setNotice_period(Integer.valueOf(NoticePeriod));
			employeetwoService.createEmployeeTwo(employeetwo);
		 } 
		catch (ParseException e) {
            e.printStackTrace();
        }
		catch (Exception e) {
            e.printStackTrace();
        }

		employeetwoService.connectionClose();

		// to avoid form submission
		response.sendRedirect("/advance-java/EmployeeTwo/list");
	}

}
