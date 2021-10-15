package org.ecom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.CreditCard;
import org.ecom.service.CreditCardService;

public class CreditCardController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CreditCardController doGet");
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "CreditCard-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		CreditCardService creditcardService = new CreditCardService();
		List<CreditCard> creditcardList = creditcardService.getAllCreditCard();
		
		//send value from java class to jsp 
		request.setAttribute("creditcardList", creditcardList);
		creditcardService.connectionClose();
		try {
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
