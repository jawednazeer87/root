package org.la.core.java.jawed.colectin;

import java.util.Collections;
import java.util.List;

import org.la.core.java.jawed.model.Employee;
import org.la.core.java.jawed.util.EmployeeUtil;
import org.la.core.java.jawed.util.GenericUtil;

/**
 * @author jawednazeer
 */
public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeUtil.getList();
		GenericUtil.print(employeeList);
		System.out.println("after sort ----------------------------------------------------------------------------------");
		Collections.sort(employeeList, new EmployeeNameComparator());
		GenericUtil.print(employeeList);
	}
	
	public static void comparableExample() {
		List<Employee> employeeList = EmployeeUtil.getList();
		GenericUtil.print(employeeList);
		System.out.println("after sort ----------------------------------------------------------------------------------");
		Collections.sort(employeeList);
		GenericUtil.print(employeeList);
	}
}
