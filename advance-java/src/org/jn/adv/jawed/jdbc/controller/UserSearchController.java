package org.jn.adv.jawed.jdbc.controller;

import static org.jn.adv.jawed.constant.ProjectConstants.JAWED;

import java.io.IOException;
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

public class UserSearchController extends HttpServlet {

	private static final long serialVersionUID = 8170467442791463622L;
	private static final Logger log = LoggerFactory.getLogger(UserSearchController.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		String name = request.getParameter("name");
		log.info("search user by name: {}", name);
		UserService userService = new UserService();
		
		try {
			List<User> userList = userService.getUserByName(name);
			request.setAttribute("userList", userList);
			userService.connectionClose();
		}
		catch(Exception e) {
			log.error(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + JAWED + "/user-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		try {
			requestDispatcher.forward(request, response);
		} catch(IOException ie) {
			log.error(ie.toString());
		} catch(Exception e) {
			log.error(e.toString());
		}
	}
	
	
}
