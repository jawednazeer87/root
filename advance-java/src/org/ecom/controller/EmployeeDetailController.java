package org.ecom.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ecom.constant.ProjectConstants;
import org.ecom.model.Address;
import org.ecom.model.Employee;
import org.ecom.service.AddressService;
import org.ecom.service.EmployeeService;


@WebServlet("/EmployeeDetailController")
public class EmployeeDetailController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String employeeIdStr = request.getParameter("employeeId");
		
		System.out.println("employee detail do get employeeId: "+employeeIdStr);
		
		EmployeeService employeeService = new EmployeeService();
		
		try {
			long employeeId = Long.valueOf(employeeIdStr);
			Employee employee = employeeService.findEmployeeById(employeeId);
			
			if(employee!=null) {
				
				//pass value to jsp 
				request.setAttribute("employee", employee);
				AddressService addressService = new AddressService();
				List<Address> addressList = addressService.findAddressByEmployeeId(employeeId);
				request.setAttribute("addressList", addressList);
			}
				
			
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		
		
	}
		
		
		String destination = ProjectConstants.JSP_FOLDER_PATH + "employee-detail.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		requestDispatcher.forward(request, response); 
	

		
	}
}
