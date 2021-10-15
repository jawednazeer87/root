package org.ecom.noor.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.noor.model.User;
import org.ecom.noor.service.UserService;
import org.ecom.constant.ProjectConstants;

public class UserSearchController extends HttpServlet {
	

	private static final long serialVersionUID = 8170467442791463622L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		
		System.out.println("search user by name: "+name);
		
		UserService userService = new UserService();
		
		try {
			
			List<User> userList = userService.getUserByName(name);
			request.setAttribute("userList", userList);
			userService.connectionClose();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "noorain/user-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	

}
