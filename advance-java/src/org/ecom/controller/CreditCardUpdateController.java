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

public class CreditCardUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String creditcardcc_IdStr = request.getParameter("creditcardcc_Id");
		
		System.out.println(" CreditCard update do get creditcardcc_Id: "+creditcardcc_IdStr);
		
		CreditCardService creditcardService = new CreditCardService();
		
		try {
			long creditcardcc_Id = Long.valueOf(creditcardcc_IdStr);
			CreditCard creditcard = creditcardService.findCreditCardByCc_Id(creditcardcc_Id);
			
			if(creditcard!=null) {
				request.setAttribute("creditcard", creditcard);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "CreditCard-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String creditcardcc_IdStr = request.getParameter("creditcardcc_id");
		
		System.out.println("Creditcard update do get creditcardcc_Id: "+creditcardcc_IdStr);
		String Cc_num = request.getParameter("cc_num");
		String Holder_name = request.getParameter("hname");
		String Expiry_DateString = request.getParameter("Edate");

		System.out.println("cc_num: " + Cc_num);
		System.out.println("holder_name: " + Holder_name);
		System.out.println("Expiry_Date: " + Expiry_DateString);
		
	
		CreditCardService creditcardService = new CreditCardService();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		Date Edate = null;

		try {
			
			int creditcardcc_Id = Integer.valueOf(creditcardcc_IdStr); 
			
			Edate = formatter.parse(Expiry_DateString);
			System.out.println(Edate);

			CreditCard creditcard = new CreditCard();
			creditcard.setCc_id(creditcardcc_Id);
			creditcard.setCc_num(Cc_num);
			creditcard.setHolder_name(Holder_name);
			creditcard.setExpiry_date(Edate);
			creditcardService.updateCreditCard(creditcard);

		 } 
		catch (ParseException e) {
            e.printStackTrace();
        }
		catch (Exception e) {
            e.printStackTrace();
        }

		creditcardService.connectionClose();

		// to avoid form submission
		response.sendRedirect("/advance-java/CreditCard/list");
	}

}
