package org.ecom.student.shoaeeb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.mirza.constant.ProjectConstants;
import org.ecom.student.shoaeeb.model.User;
import org.ecom.student.shoaeeb.service.UserService;

public class UserDetailController extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
	String userIdStr = req.getParameter("userId");
	UserService service = new UserService();
	try {
		long userId = Long.parseLong(userIdStr);
		User user = service.findUserById(userId);
		if(user!=null)
		{
			req.setAttribute("user", user);
		}

	}catch(Exception e)
	{
		e.printStackTrace();
	}
	//redirect to to userdetails jsp file
	String destination = ProjectConstants.JSP_FOLDER_PATH+"shoaeeb/user-detail.jsp";
	RequestDispatcher rd = req.getRequestDispatcher(destination);
	rd.forward(req, res);
}
}
