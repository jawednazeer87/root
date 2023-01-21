package org.jn.core.java.student.shoaeeb.collectn;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = StudentList.getList();
		Comparator<Student> comparator = (o1,o2) -> o1.getName().compareTo(o2.getName());
		
		Collections.sort(list,comparator);
		System.out.println(list);
		
	}

}
