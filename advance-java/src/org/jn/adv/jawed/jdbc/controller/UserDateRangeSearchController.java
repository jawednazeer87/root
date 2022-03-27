package org.jn.adv.jawed.jdbc.controller;

import static org.jn.adv.jawed.constant.ProjectConstants.JAWED;
import static org.jn.adv.jawed.constant.ProjectConstants.MM_DD_YYYY;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jn.adv.jawed.constant.ProjectConstants;
import org.jn.adv.jawed.jdbc.model.User;
import org.jn.adv.jawed.jdbc.service.UserService;
import org.jn.adv.jawed.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDateRangeSearchController extends HttpServlet {

	private static final long serialVersionUID = 8170467442791463622L;
	private static final Logger log = LoggerFactory.getLogger(UserDateRangeSearchController.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		String startDateString = request.getParameter("startDate");
		String endDateString = request.getParameter("endDate");
		log.info("startDateString: {}", startDateString);
		log.info("endDateString: {}", endDateString);
		UserService userService = new UserService();
		try {
			LocalDate startDate = DateUtil.stringToLocalDate(MM_DD_YYYY, startDateString);
			LocalDate endDate = DateUtil.stringToLocalDate(MM_DD_YYYY, endDateString);
			List<User> userList = userService.getByDobRange(startDate, endDate);
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
