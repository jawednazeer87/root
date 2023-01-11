package org.jn.core.java.student.shoaeeb.absclss;

public class HourlyEmployeeAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HourlyEmployeeAbsClass abs = new HourlyEmployeeAbsClassImpl();
		abs.setId(1);
		abs.setEmployeeId(5);
		abs.setAnnualSalary(600000);
		System.out.println("Id: "+abs.getId() +" Employee Id: "+abs.employeeId+" Annual Salary "+abs.getAnnualSalary());
	}

}
