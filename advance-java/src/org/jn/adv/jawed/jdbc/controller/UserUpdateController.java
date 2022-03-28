package org.jn.adv.jawed.jdbc.controller;

import static org.jn.adv.jawed.constant.ProjectConstants.MM_DD_YYYY;
import static org.jn.adv.jawed.constant.ProjectConstants.JAWED;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jn.adv.jawed.constant.ProjectConstants;
import org.jn.adv.jawed.jdbc.dto.UserDTO;
import org.jn.adv.jawed.jdbc.model.User;
import org.jn.adv.jawed.jdbc.service.UserService;
import org.jn.adv.jawed.util.DateUtil;
import org.jn.adv.jawed.util.GSONGenericUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.jn.adv.jawed.constant.URLConstants.LIST_PAGE;

public class UserUpdateController extends HttpServlet {

	private static final  Logger log = LoggerFactory.getLogger(UserUpdateController.class);
	private static final long serialVersionUID = 8170467442791463622L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userIdStr = request.getParameter("userId");
		
		log.info("user update do get userId: {}", userIdStr);
		
		UserService userService = new UserService();
		
		try {
			long userId = Long.parseLong(userIdStr);
			User user = userService.findUserById(userId);
			
			if(user!=null) {
				UserDTO dto = GSONGenericUtil.map(user, UserDTO.class);
				request.setAttribute("user", dto);
			}
		}
		catch(Exception e) {
			log.error(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + JAWED + "/user-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		try {
			requestDispatcher.forward(request, response);
		} catch(IOException ie) {
			log.error(ie.toString());
		} catch(Exception e) {
			log.error(e.toString());
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userIdStr = request.getParameter("userId");
		
		log.info("user update do get userId: {}", userIdStr);
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
		log.info("dob: {}", dobString);
		log.info("gender: {}", genderString);
		log.info("country: {}", country);
		
		boolean gender = false;
		if(genderString!=null) {
			gender = Boolean.parseBoolean(genderString);
		}
		UserService userService = new UserService();
		LocalDate dob = null;
		try {
			int userId = Integer.parseInt(userIdStr);
			dob = DateUtil.stringToLocalDate(MM_DD_YYYY, dobString);
	        log.info("dob: {}", dob);
	        User user = new User();
	        user.setId(userId);
	 		user.setDob(dob);
	 		user.setFirstName(firstName);
	 		user.setLastName(lName);
	 		user.setFatherName(fatherName);
	 		user.setGender(gender);
	 		user.setEmail(email);
	 		user.setCountry(country);
	 		userService.updateUser(user);
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
