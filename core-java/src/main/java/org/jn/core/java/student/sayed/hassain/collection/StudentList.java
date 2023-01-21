package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	public static List getList()
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student(5,"Aryan"));
		list.add(new Student(2,"Rahul"));
		list.add(new Student(3,"Jay"));
		list.add(new Student(9,"Raj"));
		list.add(new Student(1,"Tiyanka"));
		
		return list;
	}
}
