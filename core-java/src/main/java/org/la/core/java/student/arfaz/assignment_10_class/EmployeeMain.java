package org.la.core.java.student.arfaz.assignment_10_class;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee pob = new Employee(); 
		//	id, employeeName, employeeNum, dateHired, cityId
	pob.setid(1);
	pob.setemployeeName("Arfaz");
	pob.setemployeeNum(23);
	pob.setDateHired(30081999);
	pob.setCityId(2035);
		System.out.println(pob.getid());
		System.out.println(pob.getemployeeName());
		System.out.println(pob.getemployeeNum());
		System.out.println(pob.getDateHired());
		System.out.println(pob.getCityId());

	}

}
