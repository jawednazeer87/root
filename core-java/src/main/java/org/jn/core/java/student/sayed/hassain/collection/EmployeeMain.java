package org.jn.core.java.student.sayed.hassain.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = EmployeeList.getList();
		
		Comparator<Employee> comparator = (o1,o2)-> o1.getName().compareTo(o2.getName());
		
		Collections.sort(employeeList,comparator);
		
		System.out.println(employeeList);
		
		 comparator = (o1,o2)-> o1.getDesignation().compareTo(o2.getDesignation());
		 Collections.sort(employeeList,comparator);
		 System.out.println(employeeList);

	}

}
