package org.jn.core.java.student.sayed.hassain.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = StudentList.getList();
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());//0  
			}
			
		});
		
		System.out.println(list);
		
	}

}
