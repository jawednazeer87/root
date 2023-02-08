package org.jn.core.java.student.shoaeeb.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list =new ArrayList<>();
		list.add(new Student(1,"Shoaeeb",45f));
		list.add(new Student(2,"Aameen",50f));
		list.add(new Student(3,"sayed",50f));
		list.add(new Student(4,"Aftab",60f));
		
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		System.out.println(list);
		
	}

}
