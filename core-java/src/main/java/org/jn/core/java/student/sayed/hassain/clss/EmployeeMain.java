package org.jn.core.java.student.sayed.hassain.clss;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setterId(101);
		System.out.println(employee.getterId());
		
		employee.setterEmployeeName("Rahul Verma");
		System.out.println(employee.getterEmployeeName());
		
		employee.setterEmployeeNum(123456789);
		System.out.println(employee.getterEmployeeNum());
		
		employee.setterDateHired("12th Jan");
		System.out.println(employee.getterDateHired());
		
		employee.setterCityId("Kolkata");
		System.out.println(employee.getterCityId());
	}

}
