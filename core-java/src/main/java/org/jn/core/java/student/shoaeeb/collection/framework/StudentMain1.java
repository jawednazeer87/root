package org.jn.core.java.student.shoaeeb.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list =new ArrayList<>();
		list.add(new Student(1,"Shoaeeb",70f));
		list.add(new Student(2,"Aameen",50f));
		list.add(new Student(3,"sayed",50f));
		list.add(new Student(4,"Aftab",60f));
		//CustomComparator customComparator = new CustomComparator();
		System.out.println(list);
		Collections.sort(list,new CustomComparator());
		System.out.println(list);
	}

}
class CustomComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getMarks()>o2.getMarks())
		{
			return 1;
		}
		else if(o1.getMarks()<o2.getMarks())
		{
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
