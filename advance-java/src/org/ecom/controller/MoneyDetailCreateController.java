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

public class MoneyDetailCreateController extends HttpServlet {

	private static final long serialVersionUID = 6467649553058598678L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String destination = ProjectConstants.JSP_FOLDER_PATH + "MoneyDetail-create.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		System.out.println("MoneyDetail add do get");
		requestDispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String useridString = request.getParameter("id");
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
			moneydetService.createMoneyDetail(moneydet);

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
