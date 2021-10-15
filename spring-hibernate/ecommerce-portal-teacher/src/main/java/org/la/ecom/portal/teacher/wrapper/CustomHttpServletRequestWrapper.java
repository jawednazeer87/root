package org.la.ecom.portal.teacher.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/*
 * @Auther - Asif Aftab
 * Date    - 1St December 2020s
 * if user is not logged in n access any secure url then will redirect to login page
 * Here I copied request object and then just override its requestURI method
 * I am changing url of target
 */
public class CustomHttpServletRequestWrapper extends HttpServletRequestWrapper {

	public CustomHttpServletRequestWrapper(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getRequestURI() {
		return "/teacher/login";
	}
	
}
