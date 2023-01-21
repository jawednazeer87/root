package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	public static List getList() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("shoaeeb","Testing"));
		list.add(new Employee("aisha","Software Developer"));
		list.add(new Employee("aameen","Digital Marketing"));
		list.add(new Employee("xexo","Intern"));

		return list;

	}
}
