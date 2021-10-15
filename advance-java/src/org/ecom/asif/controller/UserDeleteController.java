package org.ecom.asif.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.asif.service.UserService;

public class UserDeleteController extends HttpServlet {

	private static final long serialVersionUID = -7234965939251486114L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userIdStr = request.getParameter("userId");
		System.out.println("userIdStr: "+userIdStr);
		
		UserService userService = new UserService();
		try {
			long userId = Long.valueOf(userIdStr);
			userService.deleteUserById(userId);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/user/list/asif");  
	}
	
}
