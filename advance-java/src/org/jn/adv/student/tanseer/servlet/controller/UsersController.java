package org.jn.adv.student.tanseer.servlet.controller;

import static org.jn.adv.student.tanseer.servlet.constant.ProjectConstant.TANSEER;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jn.adv.student.tanseer.jdbc.model.Users;
import org.jn.adv.student.tanseer.jdbc.service.UsersService;
import org.jn.adv.student.tanseer.servlet.constant.ProjectConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsersController extends HttpServlet {

	private static final Logger log = LoggerFactory.getLogger(UsersController.class);
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		log.info("UserController doGet Method Called");

		String destination = ProjectConstant.JSP_FOLDER_PATH + TANSEER + "/users-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);

		UsersService usersService = new UsersService();
		List<Users> usersList = usersService.getAll();

		// send value from java class to jsp
		request.setAttribute("usersList", usersList);
		usersService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
