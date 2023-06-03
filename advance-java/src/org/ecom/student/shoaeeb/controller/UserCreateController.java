package org.ecom.student.shoaeeb.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.student.shoaeeb.model.User;
import org.ecom.student.shoaeeb.service.UserService;

public class UserCreateController extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		String destination = ProjectConstants.JSP_FOLDER_PATH+"shoaeeb/user-create.jsp";
		req.setAttribute("validFirstName", true);
		req.setAttribute("validLastName", true);
		req.setAttribute("validFatherName", true);
		req.setAttribute("validDob", true);
		req.setAttribute("validEmail", true);
		req.setAttribute("validGender", true);
		req.setAttribute("validCountry", true);
		
		RequestDispatcher rd = req.getRequestDispatcher(destination);
		rd.forward(req, res);
	}
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String fatherName = req.getParameter("fatherName");
		String dobStr = req.getParameter("dob");
		String email = req.getParameter("email");
		String genderString = req.getParameter("gender");
		String country =  req.getParameter("country");
		System.out.println("fname"+fname.isEmpty());
		System.out.println("lname"+lname.isEmpty());
		System.out.println("fatherName"+fatherName.isEmpty());
		System.out.println("dob"+dobStr.isEmpty());
		System.out.println("email"+dobStr.isEmpty());
		System.out.println("genderString"+genderString);
		System.out.println("country"+country);
		boolean isFormValid=true;
		if(fname.isEmpty()||lname.isEmpty()||dobStr.isEmpty()||email.isEmpty()
				||genderString==null||country.equals(-1))
		{
			isFormValid=false;
		}
			
		if(!isFormValid)
		{
			req.setAttribute("validFirstName", false);
			req.setAttribute("validFirstName", false);
			req.setAttribute("validLastName", false);
			req.setAttribute("validFatherName", false);
			req.setAttribute("validDob",false);
			req.setAttribute("validEmail", false);
			req.setAttribute("validGender", false);
			req.setAttribute("validCountry", false);
			String destination = ProjectConstants.JSP_FOLDER_PATH+"shoaeeb/user-create.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(destination);
			rd.forward(req, res);
		}
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			//"05/01/2023"
			Date dob = formatter.parse(dobStr);
			boolean gender = Boolean.parseBoolean(genderString);
			User user = new User();
			user.setFirstName(fname);
			user.setLastName(lname);
			user.setFatherName(fatherName);
			user.setDob(dob);
			user.setGender(gender);
			user.setEmail(email);
			user.setCountry(country);
			//pass it to user service class to store the data in database
			UserService service = new UserService();
			service.createUser(user);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		//send redirect to user list page
		res.sendRedirect("/advance-java/user/list/shoaeeb");
	}
}
