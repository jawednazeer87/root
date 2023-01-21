package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashSet;
import java.util.Set;

public class Program41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> studentSet = new HashSet<>();
		
		//adding elements to studentSet;
		studentSet.add(new Student(2,"shoaeeb"));
		studentSet.add(new Student(5,"aameen"));
		studentSet.add(new Student(1,"rakesh"));
		studentSet.add(new Student(6,"gian"));
		
		for(Student s: studentSet)
		{
			System.out.println(s.getId()+ ": "+s.getName());
		}
		
	}

}
