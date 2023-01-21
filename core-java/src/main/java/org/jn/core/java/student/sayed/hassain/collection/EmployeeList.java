package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	public static List getList() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("rahul","Testing"));
		list.add(new Employee("abhay","Software Developer"));
		list.add(new Employee("zayn","Digital Marketing"));
		list.add(new Employee("aryan","Intern"));

		return list;

	}
}
