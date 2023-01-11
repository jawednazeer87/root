package org.jn.core.java.student.shoaeeb.absclss;

public class EmployeeAbsImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAbsClass abs = new EmployeeAbsImpl();
		abs.setId(1);
		abs.setEmployeeName("John");
		abs.setEmployeeNum(1);
		abs.setCityId(5);
		
		
		System.out.println("Id "+abs.getId()+ "Name: "+abs.getEmployeeName()+" Employee Num: "+abs.getEmployeeNum()+" City Id: "+abs.getCityId());
	}

}
