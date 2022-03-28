package org.jn.adv.jawed.jdbc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jn.adv.jawed.jdbc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.jn.adv.jawed.constant.URLConstants.LIST_PAGE;

public class UserDeleteController extends HttpServlet {

	private static final Logger log = LoggerFactory.getLogger(UserDeleteController.class);
	private static final long serialVersionUID = -7234965939251486114L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		String userIdStr = request.getParameter("userId");
		log.info("userIdStr: {}", userIdStr);
		
		UserService userService = new UserService();
		try {
			long userId = Long.parseLong(userIdStr);
			userService.deleteUserById(userId);
		}
		catch(Exception e) {
			log.error(e.getMessage());
		}
		try {
			//to avoid form submission
			response.sendRedirect(LIST_PAGE);
		} catch(IOException ie) {
			log.error(ie.toString());
		} catch(Exception e) {
			log.error(e.toString());
		}
	}
	
}
