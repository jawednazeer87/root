package org.ecom.student.shoaeeb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.student.shoaeeb.service.UserService;

public class UserDeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		//get the user id
		String userId=  request.getParameter("userId");
		try {
			long id = Long.valueOf(userId);

			UserService service =  new UserService();
			int count=service.deleteUserById(id);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		response.sendRedirect("/advance-java/user/list/shoaeeb");
		
	}
}
