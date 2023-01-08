package org.jn.core.java.student.sayed.hassain.clss;

public class SalariedEmployeeMain {
	
	public static void main (String[] args) {
		
		SalariedEmployee salariedEmployee=new SalariedEmployee();
		
		salariedEmployee.setterId(15);
		System.out.println(salariedEmployee.getterId());
		
		salariedEmployee.setterAnnualSalary(75000);
		System.out.println(salariedEmployee.getterAnnualSalary());
		
		salariedEmployee.setterEmployeeId(105);
		System.out.println(salariedEmployee.getterEmployeeId());
	}

}
