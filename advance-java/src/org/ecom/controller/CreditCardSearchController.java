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

public class CreditCardSearchController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String hname = request.getParameter("hname");
		
		System.out.println("search Creditcard by Holder_name: "+hname);
		
		CreditCardService creditcardService = new CreditCardService();
		
		try {
			
			List<CreditCard> creditcardList = creditcardService.getCreditCardByHolder_name(hname);
			request.setAttribute("creditcardList", creditcardList);
			creditcardService.connectionClose();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "CreditCard-list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}	

}

