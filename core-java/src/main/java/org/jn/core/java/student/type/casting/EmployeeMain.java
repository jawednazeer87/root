package org.jn.core.java.student.type.casting;

public class EmployeeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee e = new Employee(1,"Shoaeeb");
		e.getData();
		Employee e1 = (Employee)e.myClone();
		e1.getData();
		
	}

}
