package org.jn.adv.jawed.jdbc.controller;

import static org.jn.adv.jawed.constant.ProjectConstants.JAWED;
import static org.jn.adv.jawed.constant.ProjectConstants.MM_DD_YYYY;
import static org.jn.adv.jawed.constant.URLConstants.LIST_PAGE;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jn.adv.jawed.constant.ProjectConstants;
import org.jn.adv.jawed.jdbc.model.User;
import org.jn.adv.jawed.jdbc.service.UserService;
import org.jn.adv.jawed.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserCreateController extends HttpServlet {

	private static final long serialVersionUID = 6467649553058598678L;
	private static final  Logger log = LoggerFactory.getLogger(UserCreateController.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			String destination = ProjectConstants.JSP_FOLDER_PATH + JAWED + "/user-create.jsp";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
			log.info("user add do get");
			requestDispatcher.forward(request, response);
		} catch(ServletException se) {
			log.error(se.toString()); 
		} catch(IOException ie) {
			log.error(ie.toString());
		} catch(Exception e) {
			log.error(e.toString());
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		String firstName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String email = request.getParameter("email");
		String dobString = request.getParameter("dob");
		String genderString = request.getParameter("gender");
		String fatherName = request.getParameter("fatherName");
		String country = request.getParameter("country");
		
		log.info("fatherName: {}", fatherName);
		log.info("firstName: {}", firstName);
		log.info("lName: {}", lName);
		log.info("email: {}", email);
		log.info("dob string: {}", dobString);
		log.info("gender: {}", genderString);
		log.info("country: {}", country);
		
		boolean gender = false;
		if(genderString!=null) {
			gender = Boolean.parseBoolean(genderString);
		}
		UserService userService = new UserService();
		try {
			LocalDate dob = DateUtil.stringToLocalDate(MM_DD_YYYY, dobString);
	        log.info("dob in localdate format: {}", dob);
	        User user = new User();
	 		user.setDob(dob);
	 		user.setFirstName(firstName);
	 		user.setLastName(lName);
	 		user.setFatherName(fatherName);
	 		user.setGender(gender);
	 		user.setEmail(email);
	 		user.setCountry(country);
	 		userService.createUser(user);
        } 
		catch (Exception e) {
            e.printStackTrace();
        }
		userService.connectionClose();
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
