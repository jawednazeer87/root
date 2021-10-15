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
import org.ecom.model.MoneyDetail;
import org.ecom.service.MoneyDetailService;


public class MoneyDetailUpdateController extends HttpServlet {

	private static final long serialVersionUID = 8170467442791463622L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String IdStr = request.getParameter("Id");
		
		System.out.println(" MoneyDetail update do get Id: "+IdStr);
		
		MoneyDetailService moneydetService = new MoneyDetailService();
		
		try {
			long Id = Long.valueOf(IdStr);
			MoneyDetail moneydet = moneydetService.findMoneyDetailById(Id);
			
			if(moneydet!=null) {
				request.setAttribute("moneydet", moneydet);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "MoneyDetail-update.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String IdStr = request.getParameter("Id");
		
		System.out.println("MoneyDetail update do get Id: "+IdStr);
		String useridString = request.getParameter("Uid");
		String balanceString = request.getParameter("num");
		String CreateDate = request.getParameter("Cdate");
		String UpdateDate = request.getParameter("Udate");

		System.out.println("user id: " + useridString);
		System.out.println("balance: " + balanceString);
		System.out.println("Create Date: " + CreateDate);
		System.out.println("Update Date: " + UpdateDate);
		
	
		MoneyDetailService moneydetService = new MoneyDetailService();

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

		Date Cdate = null;
		Date Udate = null;

		try {
			Cdate = formatter.parse(CreateDate);
			System.out.println(Cdate);
			Udate = formatter.parse(UpdateDate);
			System.out.println(Udate);

			MoneyDetail moneydet = new MoneyDetail();
			moneydet.setUserid(Integer.valueOf(useridString));
			moneydet.setBalance(Double.valueOf(balanceString));
			moneydet.setCreatedate(Cdate);
			moneydet.setUpdatedate(Udate);
			moneydetService.updateMoneyDetail(moneydet);

		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		moneydetService.connectionClose();

		// to avoid form submission
		response.sendRedirect("/advance-java/MoneyDetail/list");
	}
}
