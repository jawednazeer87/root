package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employe = new Employee();
		
		employe.setCityId(12);
		employe.setDateHired("12-10-2018");
		employe.setEmployeeNum(101);
		employe.setEmployeeName("manager");
		employe.setId(901);
		
		System.out.println("Employee [id=" + employe.getId() + ", employeeName=" + employe.getEmployeeName() + ", employeeNum=" + employe.getEmployeeNum() + ", dateHired=" 
				+  employe.getDateHired() + ", cityId=" + employe.getCityId() + "]");
		
	}

}
