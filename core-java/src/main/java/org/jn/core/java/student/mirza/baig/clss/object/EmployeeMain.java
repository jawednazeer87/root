package org.jn.core.java.student.mirza.baig.clss.object;

import java.util.Date;


public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		Date d = new Date ();
		emp.setEmployeeName("kelly");
		emp.setEmployeeNum(102);
		emp.setCityId("pune");
		
		System.out.println("employee name     :"+emp.getEmployeeName());
		System.out.println("employee number   :"+emp.getEmpoloyeeNum());
		System.out.println("Date              :"+d);

		System.out.println("city id           :"+emp.getCityId());
		

	

	}

}
