package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	public static List getList()
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student(5,"shoaeeb"));
		list.add(new Student(2,"Aameen"));
		list.add(new Student(3,"Shizan"));
		list.add(new Student(9,"Aftab"));
		list.add(new Student(1,"Aaaisha"));
		
		return list;
	}
}
