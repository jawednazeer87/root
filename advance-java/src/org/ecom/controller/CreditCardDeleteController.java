package org.ecom.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.service.CreditCardService;


public class CreditCardDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String creditcardcc_IdStr = request.getParameter("creditcardcc_Id");
		System.out.println("creditcardcc_IdStr: "+creditcardcc_IdStr);
		
		CreditCardService creditcardService = new CreditCardService();
		try {
			long creditcardcc_Id = Long.valueOf(creditcardcc_IdStr);
			creditcardService.deleteCreditCardByCc_Id(creditcardcc_Id);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/CreditCard/list");
	}
}

