package org.la.core.java.student.majeed.assignment8;

/*
9.	Create a class HourlyEmployee having member variables id, annualSalary, employeeId. 
create getters and setters for all member variables. Create object of HourlyEmployee 
class in other class inside main method and set all member values and print all member values using getters.
 */

public class HourlyEmployeeMain {	public static void main(String[] args) {
	HourlyEmployee hourlyEmployee = new HourlyEmployee();
	
	hourlyEmployee.setId(2323);
	hourlyEmployee.setAnnualSalary(4800000);
	hourlyEmployee.setEmployeeId(6989);
	
	System.out.println(hourlyEmployee.getId());
	System.out.println(hourlyEmployee.getAnnualSalary());
	System.out.println(hourlyEmployee.getEmployeeId());
}
	
}
