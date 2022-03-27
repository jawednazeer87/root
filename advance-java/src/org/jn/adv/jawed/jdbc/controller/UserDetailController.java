
package org.jn.adv.jawed.jdbc.controller;

import static org.jn.adv.jawed.constant.ProjectConstants.JAWED;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.model.Address;
import org.ecom.model.MoneyDetail;
import org.ecom.service.AddressService;
import org.ecom.service.MoneyDetailService;
import org.jn.adv.jawed.constant.ProjectConstants;
import org.jn.adv.jawed.jdbc.model.User;
import org.jn.adv.jawed.jdbc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDetailController extends HttpServlet {

	private static final long serialVersionUID = -7234965939251486114L;
	private static final Logger log = LoggerFactory.getLogger(UserDetailController.class);
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		String userIdStr = request.getParameter("userId");
		
		log.info("user detail do get userId: {}", userIdStr);
		
		UserService userService = new UserService();
		
		try {
			long userId = Long.parseLong(userIdStr);
			User user = userService.findUserById(userId);
			
			if(user!=null) {
				
				//pass value to jsp 
				request.setAttribute("user", user);
				
				AddressService addressService = new AddressService();
				List<Address> addressList = addressService.findAddressByUserId(userId);
				request.setAttribute("addressList", addressList);
			}
		}
		catch(Exception e) {
			log.error(e.getMessage());
		}
		
		
		try {
			long userId = Long.parseLong(userIdStr);
			User user = userService.findUserById(userId);
			
			if(user!=null) {
				
				//pass value to jsp 
				request.setAttribute("user", user);
				
				MoneyDetailService moneydetService = new MoneyDetailService();
				List<MoneyDetail> monetdetList = moneydetService.findMoneyDetailByUserId(userId);
				request.setAttribute("monetdetList", monetdetList);
			}
		}
		catch(Exception e) {
			log.error(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + JAWED + "/user-detail.jsp";
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
