package org.jn.core.java.student.mirza.baig.clss.object;

public class SalariedEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SalariedEmployee employee= new SalariedEmployee();
		
		employee.setId(102);
		employee.setAnnualSalary(85000);
		employee.setEmployeeId(110084);
		
		System.out.println("Id :"+employee.getId());
		System.out.println("Annual Salary :"+employee.getAnnualSalary());
		System.out.println("Employee Id :"+employee.getEmployeeId());
	}

}
