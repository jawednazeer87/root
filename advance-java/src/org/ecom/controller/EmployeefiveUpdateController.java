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

public class EmployeefiveUpdateController extends HttpServlet {

	private static final long serialVersionUID = 8170467442791463622L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String empIdStr = request.getParameter("empId");
		
		System.out.println("Employeefive update do get empId: "+empIdStr);
		
		EmployeefiveService empService = new EmployeefiveService();
		
		try {
			long empId = Long.valueOf(empIdStr);
			Employeefive emp = empService.findeEmployeefiveById(empId);
			
			if(emp!=null) {
				request.setAttribute("emp", emp);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "Employeefive-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String empIdStr = request.getParameter("empId");
		
		System.out.println("emp update do get empId: "+empIdStr);
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
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
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
	 		emp.setDob(dob);
	 		emp.setJoined_date(jdate);
	 		emp.setCreate_date(cdate);
	 		emp.setUpdate_date(udate);
	 		emp.setRelease_date(rdate);
	 		emp.setName(Name);
	 		emp.setGender(gender);
	 		emp.setEmailid(email);
	 		emp.setNotice_period(Integer.valueOf(NoticePeriod));
	 		emp.setId(Integer.valueOf(empIdStr));
	 		
	 		empService.updateEmp(emp);
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
