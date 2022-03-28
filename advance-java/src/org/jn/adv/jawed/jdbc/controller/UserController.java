package org.jn.adv.jawed.jdbc.controller;

import static org.jn.adv.jawed.constant.ProjectConstants.JAWED;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jn.adv.jawed.constant.ProjectConstants;
import org.jn.adv.jawed.jdbc.model.User;
import org.jn.adv.jawed.jdbc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserController extends HttpServlet {
	
	private static final  Logger log = LoggerFactory.getLogger(UserController.class);
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		log.info("UserController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + JAWED + "/user-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		UserService userService = new UserService();
		List<User> userList = userService.getAllUser();
		
		//send value from java class to jsp 
		request.setAttribute("userList", userList);
		userService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
