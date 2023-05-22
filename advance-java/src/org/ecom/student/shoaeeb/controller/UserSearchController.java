package org.ecom.student.shoaeeb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.student.shoaeeb.model.User;
import org.ecom.student.shoaeeb.service.UserService;

public class UserSearchController extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		String name =req.getParameter("name");
		System.out.println("name to be search is :"+name);
		UserService service = new UserService();
		List<User> list = service.getUserByName(name);
		req.setAttribute("userList", list);
		String destination = ProjectConstants.JSP_FOLDER_PATH + "shoaeeb/user-list.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(destination);
		
		rd.forward(req, res);	
		
		
	}
}
