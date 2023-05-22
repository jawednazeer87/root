package org.ecom.student.shoaeeb.controller;

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
import org.ecom.student.shoaeeb.model.User;
import org.ecom.student.shoaeeb.service.UserService;

public class UserUpdateController extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		//get user by user id
		String userIdStr = request.getParameter("userId");
		try {
			long id = Long.valueOf(userIdStr);
			UserService service = new UserService();
			User user = service.findUserById(id);
			request.setAttribute("user", user);
			String destination = ProjectConstants.JSP_FOLDER_PATH+"shoaeeb/user-update.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(destination);
			try {
				rd.forward(request, response);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse response) throws ServletException,IOException
	{
		User user = new User();
		String userIdStr= req.getParameter("userId");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String fatherName = req.getParameter("fatherName");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
		String genderString = req.getParameter("gender");
		String country = req.getParameter("country");
		boolean gender=false;
		if(genderString!=null)
		{
			gender=Boolean.parseBoolean(genderString);
		}
		System.out.println(fname+","+lname+" "+fatherName+" "+dob+" "+email+" "+genderString+" "+country);
		//convert string to date
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			int userId = Integer.valueOf(userIdStr);
			date = formatter.parse(dob);
			user.setId(userId);
			user.setDob(date);
			user.setFirstName(fname);
			user.setLastName(lname);
			user.setFatherName(fatherName);
			user.setEmail(email);
			user.setCountry(country);
			user.setGender(gender);
		    UserService service = new UserService();
		    service.updateUser(user);
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		response.sendRedirect("/advance-java/user/list/shoaeeb");
	}
	
}
