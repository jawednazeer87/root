package org.ecom.elhadj.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.elhadj.model.User;
import org.ecom.elhadj.service.UserService;
import org.ecom.constant.ProjectConstants;

public class UserUpdateController extends HttpServlet{
	
	private static final long serialVersionUID = 8170467442791463622L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userIdStr = request.getParameter("userId");
		
		System.out.println("user update do get userId: "+userIdStr);
		
		UserService userService = new UserService();
		
		try {
			long userId = Long.valueOf(userIdStr);
			User user = userService.findUserById(userId);
			
			if(user!=null) {
				request.setAttribute("user", user);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "elhadj/user-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userIdStr = request.getParameter("userId");
		
		System.out.println("user update do get userId: "+userIdStr);
		String firstName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String email = request.getParameter("email");
		String dobString = request.getParameter("dob");
		String genderString = request.getParameter("gender");
		String fatherName = request.getParameter("fatherName");
		String country = request.getParameter("country");
		
		System.out.println("fatherName: "+fatherName);
		System.out.println("firstName: "+firstName);
		System.out.println("lName: "+lName);
		System.out.println("email: "+email);
		System.out.println("dob: "+dobString);
		System.out.println("gender: "+genderString);
		System.out.println("country: "+country);
		
		boolean gender = false;
		if(genderString!=null) {
			gender = Boolean.parseBoolean(genderString);
		}
		UserService userService = new UserService();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = null;
		try {
			int userId = Integer.valueOf(userIdStr);
			dob = formatter.parse(dobString);
	        System.out.println(dob);
	        User user = new User();
	        user.setId(userId);
	 		user.setDob(dob);
	 		user.setFirstName(firstName);
	 		user.setLastName(lName);
	 		user.setFatherName(fatherName);
	 		user.setGender(gender);
	 		user.setEmail(email);
	 		user.setCountry(country);
	 		userService.updateUser(user);
        } 
		catch (ParseException e) {
            e.printStackTrace();
        }
		catch (Exception e) {
            e.printStackTrace();
        }
		
		userService.connectionClose();
		
		//to avoid form submission
		response.sendRedirect("/advance-java/user/list/elhadj");  
	}

}
