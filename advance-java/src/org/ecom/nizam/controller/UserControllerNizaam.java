package org.ecom.nizam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.nizam.model.User;
import org.ecom.constant.ProjectConstants;
import org.ecom.nizam.service.UserService;

public class UserControllerNizaam extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Nizam UserController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH +"nizam/user-list.jsp";
		
		RequestDispatcher rd = req.getRequestDispatcher(destination);
		
		UserService us = new UserService();
		List<User> userList = us.getAllUser();
		
		//send value from java class to jsp 
		req.setAttribute("userList", userList);
		us.connectionClose();
		try {
			rd.forward(req, resp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
