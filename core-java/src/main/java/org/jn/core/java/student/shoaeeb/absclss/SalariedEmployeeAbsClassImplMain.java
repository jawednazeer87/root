package org.jn.core.java.student.shoaeeb.absclss;

public class SalariedEmployeeAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedEmployeeAbsClass abs = new  SalariedEmployeeAbsClassImpl();
		abs.setId(1);
		abs.setEmployeeId(5);
		abs.setAnnualSalary(600000);
		
		System.out.println("Id: "+abs.getId()+" EmployeeId: "+abs.getEmployeeId()+ " Annual Salary: "+abs.getAnnualSalary());
	}

}
