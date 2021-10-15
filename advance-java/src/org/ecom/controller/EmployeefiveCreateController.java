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
import org.ecom.model.Employeefive;
import org.ecom.service.EmployeefiveService;

public class EmployeefiveCreateController extends HttpServlet {

	private static final long serialVersionUID = 6467649553058598678L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String destination = ProjectConstants.JSP_FOLDER_PATH + "Employeefive-create.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		System.out.println("Employeefive add do get");
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Name = request.getParameter("fname");
		String email = request.getParameter("email");
		String dobString = request.getParameter("dob");
		String JoinedString = request.getParameter("jdate");
		String CreateString = request.getParameter("cdate");
		String UpdateString = request.getParameter("udate");
		String ReleaseString = request.getParameter("rdate");
		String NoticePeriod = request.getParameter("period");
		String genderString = request.getParameter("gender");
	
		
		System.out.println("Name: "+Name);
		System.out.println("email: "+email);
		System.out.println("dob String: "+dobString);
		System.out.println("Joined String: "+JoinedString);
		System.out.println("Create String: "+CreateString);
		System.out.println("Update String: "+UpdateString);
		System.out.println("Release String: "+ReleaseString);
		System.out.println("Notice Period: "+NoticePeriod);
		System.out.println("gender: "+genderString);
		
		boolean gender = false;
		if(genderString!=null) {
			gender = Boolean.parseBoolean(genderString);
		}
		EmployeefiveService empService = new EmployeefiveService();
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		
		Date dob = null;
		Date jdate = null;
		Date cdate = null;
		Date udate = null;
		Date rdate = null;
		
		try {
			dob = formatter.parse(dobString);
	        System.out.println(dob);
	        jdate = formatter.parse(JoinedString);
	        System.out.println(jdate);
	        cdate = formatter.parse(CreateString);
	        System.out.println(cdate);
	        udate = formatter.parse(UpdateString);
	        System.out.println(udate);
	        rdate = formatter.parse(ReleaseString);
	        System.out.println(rdate);
	         
	        Employeefive emp = new Employeefive();
	        emp.setName(Name);
	 		emp.setDob(dob);
	 		emp.setJoined_date(jdate);
	 		emp.setCreate_date(cdate);
	 		emp.setUpdate_date(udate);
	 		emp.setRelease_date(rdate);
	 		emp.setGender(gender);
	 		emp.setEmailid(email);
	 		emp.setNotice_period(Integer.valueOf(NoticePeriod));
	 		empService.createEmp(emp);
	 		
        } 
		catch (ParseException e) {
            e.printStackTrace();
        }
		catch (Exception e) {
            e.printStackTrace();
        }
		
		empService.connectionClose();
		
		//to avoid form submission
		response.sendRedirect("/advance-java/Employeefive/list");  
	}
	
}
