package org.jn.core.java.student.shoaeeb.collectn;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
	public static void main(String args[])
	{
		List<Student> list =StudentList.getList();
		CustomComparator customComparator = new CustomComparator();
		
		Collections.sort(list,customComparator);
		
		System.out.println(list);
	}
}

 class CustomComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId())
		{
			return 1;
		}
		if(o1.getId()==o2.getId()) {
			return 0;
		}
		return -1;
	}
	
}
