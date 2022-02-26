package org.la.core.java.jawed.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.la.core.java.jawed.model.Employee;

/**
 * @author jawednazeer
 *
 */
public class EmployeeUtil {

	//Sorting employee using comparable interface by age
	public static void employeeSortByAge() {
		List<Employee> employeeList = EmployeeUtil.getList();
		GenericUtil.print(employeeList);
		System.out.println("after sort ----------------------------------------------------------------------------------");
		Collections.sort(employeeList);
		GenericUtil.print(employeeList);
	}
	
	//Sorting employee using comparator interface by name
	public static void employeeSortByName() {
		List<Employee> employeeList = EmployeeUtil.getList();
		GenericUtil.print(employeeList);
		System.out.println("after sort ----------------------------------------------------------------------------------");
		Collections.sort(employeeList, (e1, e2)-> e1.getName().compareToIgnoreCase(e2.getName()));
		GenericUtil.print(employeeList);
	}
	
	public static List<Employee> getList() {
		Employee e1 = new Employee(1, "amir", true, 20, "amir@mail.com", "Indian", "graduation", "student");
		Employee e2 = new Employee(2, "naem", true, 12, "naem@mail.com", "USA", "post graduation", "student");
		Employee e3 = new Employee(3, "raees", true, 15, "raees@mail.com", "UK", "under graduate", "student");
		Employee e4 = new Employee(4, "deen", true, 10, "deen@mail.com", "Canada", "graduation", "student");
		Employee e5 = new Employee(5, "anil", true, 17, "anil@mail.com", "Bangladesh", "post graduation", "student");
		Employee e6 = new Employee(6, "vijay", true, 14, "vijay@mail.com", "Malaysia", "graduation", "student");
		Employee e7 = new Employee(7, "altamash", true, 23, "altamash@mail.com", "Indonesia", "graduation", "student");
		Employee e8 = new Employee(8, "amit", true, 29, "amit@mail.com", "Singapore", "under graduate", "student");
		Employee e9 = new Employee(9, "yamin", true, 30, "yamin@mail.com", "Indian", "graduation", "student");
		Employee e10 = new Employee(10, "anis", true, 18, "anis@mail.com", "USA", "post graduation", "student");
		Employee e11 = new Employee(11, "nizam", true, 19, "nizam@mail.com", "Indian", "under graduate", "student");
		Employee e12 = new Employee(12, "rahil", true, 37, "rahil@mail.com", "UK", "graduation", "student");
		Employee e13 = new Employee(13, "yaseer", true, 13, "yaseer@mail.com", "Bangladesh", "under graduate", "student");
		Employee e14 = new Employee(14, "arsalaan", true, 45, "arsalaan@mail.com", "Malaysia", "post graduation", "student");
		Employee e15 = new Employee(15, "amna", false, 23, "amna@mail.com", "Canada", "graduation", "student");
		Employee e16 = new Employee(16, "amira", false, 20, "amira@mail.com", "Singapore", "under graduate", "student");
		Employee e17 = new Employee(17, "hajra", false, 21, "hajra@mail.com", "USA", "graduation", "student");
		Employee e18 = new Employee(18, "meena", false, 22, "meena@mail.com", "Indian", "under graduate", "student");
		Employee e19 = new Employee(19, "rebeca", false, 13, "rebeca@mail.com", "UK", "post graduation", "student");
		Employee e20 = new Employee(20, "rani", false, 15, "rani@mail.com", "Bangladesh", "under graduate", "student");
		Employee e21 = new Employee(21, "gudia", false, 12, "gudia@mail.com", "Canada", "graduation", "student");
		Employee e22 = new Employee(22, "nahid", false, 30, "nahid@mail.com", "Singapore", "under graduate", "student");
		Employee e23 = new Employee(23, "nasreen", false, 29, "nasreen@mail.com", "USA", "post graduation", "student");
		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, 
								e17, e18, e19, e20, e21, e22, e23);
		return list;
	}
}
