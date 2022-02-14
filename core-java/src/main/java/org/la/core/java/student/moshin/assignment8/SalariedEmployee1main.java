package org.la.core.java.student.moshin.assignment8;

public class SalariedEmployee1main {

	public static void main(String[] args) {
		SalariedEmployee1 salary = new SalariedEmployee1();
		
		salary.setId(15);
		salary.setannualSalary("842250");
		salary.setEmployeeId("5487");
		
		System.out.println("ID: "+salary.getId());
		System.out.println("Annual Salary: "+salary.getAnnualSalary());
		System.out.println("Employee ID: "+salary.getEmployeeId());	
	}
}
