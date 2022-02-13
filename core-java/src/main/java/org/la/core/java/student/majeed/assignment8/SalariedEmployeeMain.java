package org.la.core.java.student.majeed.assignment8;

/*
7.	Create a class SalariedEmployee having member variables id, annualSalary, employeeId. 
create getters and setters for all member variables. Create object of SalariedEmployee 
class in other class inside main method and set all member values and print all member values using getters.
 */

public class SalariedEmployeeMain {
	
	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = new SalariedEmployee();
		
		salariedEmployee.setId(501);
		salariedEmployee.setAnnualSalary(5000000);
		salariedEmployee.setEmployeeId(54545);
		
		System.out.println(salariedEmployee.getId());
		System.out.println(salariedEmployee.getAnnualSalary());
		System.out.println(salariedEmployee.getEmployeeId());
	}
	
}
