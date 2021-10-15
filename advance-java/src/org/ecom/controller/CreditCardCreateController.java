package org.ecom.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.CreditCard;
import org.ecom.service.CreditCardService;

public class CreditCardCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String destination = ProjectConstants.JSP_FOLDER_PATH + "CreditCard-create.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		System.out.println("CreditCard add do get");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Cc_num = request.getParameter("cc_num");
		String Holder_name = request.getParameter("hname");
		String Expiry_DateString = request.getParameter("Edate");

		System.out.println("Cc_num: " + Cc_num);
		System.out.println("holder_name: " + Holder_name);
		System.out.println("Expiry_Date string: " + Expiry_DateString);

		CreditCardService creditcardService = new CreditCardService();

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

		Date Edate = null;

		try {
			Edate = formatter.parse(Expiry_DateString);
			System.out.println(Edate);

			CreditCard creditcard = new CreditCard();
			creditcard.setCc_num(String.valueOf(Cc_num));
			creditcard.setHolder_name(String.valueOf(Holder_name));
			creditcard.setExpiry_date(Edate);
			creditcardService.createCreditCard(creditcard);

		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		creditcardService.connectionClose();

		// to avoid form submission
		response.sendRedirect("/advance-java/CreditCard/list");
	}

}
