package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class SalariedEmployeeMain {

	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = new SalariedEmployee();
		salariedEmployee.setAnnualSalary(101);
		salariedEmployee.setEmployeeId(500);
		salariedEmployee.setId(99);
		
		System.out.println("SalariedEmployee [id=" + salariedEmployee.getId() + ", annualSalary=" + salariedEmployee.getAnnualSalary() + ", employeeId=" + salariedEmployee.getEmployeeId() + "]");
	}

}
