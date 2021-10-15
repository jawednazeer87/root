package org.ecom.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.service.MoneyDetailService;

public class MoneyDetailDeleteController extends HttpServlet {

	private static final long serialVersionUID = -7234965939251486114L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String IdStr = request.getParameter("Id");
		System.out.println("IdStr: "+IdStr);
		
		MoneyDetailService moneydetService = new MoneyDetailService();
		try {
			long Id = Long.valueOf(IdStr);
			moneydetService.deleteMoneyDetail(Id);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//to avoid form submission
		response.sendRedirect("/advance-java/MoneyDetail/list");  
	}
	
}
