package org.ecom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.Address;
import org.ecom.model.CreditCard;
import org.ecom.model.MoneyDetail;
import org.ecom.service.AddressService;
import org.ecom.service.CreditCardService;
import org.ecom.service.MoneyDetailService;

public class CreditCardDetailController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String creditcardcc_IdStr = request.getParameter("creditcardcc_Id");
		
		System.out.println("CreditCard detail do get creditcardcc_Id: "+creditcardcc_IdStr);
		
		CreditCardService creditcardservice = new CreditCardService();
		
		try {
			long creditcardcc_Id = Long.valueOf(creditcardcc_IdStr);
			CreditCard creditcard = creditcardservice.findCreditCardByCc_Id(creditcardcc_Id);
			
			if(creditcard!=null) {
				
				//pass value to jsp 
				request.setAttribute("creditcard", creditcard);
				AddressService addressService = new AddressService();
				List<Address> addressList = addressService.findAddressByEmployeeId(creditcardcc_Id);
				request.setAttribute("addressList", addressList);
			}
				
			
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			long creditcardcc_Id = Long.valueOf(creditcardcc_IdStr);
			CreditCard creditcard = creditcardservice.findCreditCardByCc_Id(creditcardcc_Id);
			
			if(creditcard!=null) {
				
				//pass value to jsp 
				request.setAttribute("creditcard", creditcard);
				
				MoneyDetailService moneydetService = new MoneyDetailService();
				List<MoneyDetail> monetdetList = moneydetService.findMoneyDetailByUserId(creditcardcc_Id);
				request.setAttribute("monetdetList", monetdetList);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "CreditCard-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	}
	
}
