package org.jn.core.java.student.sayed.hassain.clss;

public class HourlyEmployeeMain {
	
	public static void main(String[] args) {
		
		HourlyEmployee hourlyEmployee=new HourlyEmployee();
		hourlyEmployee.setterId(10001);
		System.out.println(hourlyEmployee.getterId());
		
		hourlyEmployee.setterAnnualSalary(15000);
		System.out.println(hourlyEmployee.getterAnnualSalary());
		
		hourlyEmployee.setterEmployeeId(101);
		System.out.println(hourlyEmployee.getterEmployeeId());
	}

}
