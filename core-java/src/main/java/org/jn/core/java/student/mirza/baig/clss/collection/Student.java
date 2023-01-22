package org.jn.core.java.student.mirza.baig.clss.collection;

import java.util.HashSet;
import java.util.Set;

public class Student {
	String name;
	int rollNo;
	public Student(String name, int rollNo ) {
		this.name=name;
		this.rollNo= rollNo;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> set = new HashSet<>();
		
		Student s = new Student("mirza", 102);
		
		set.add(s);
		
		 
			 System.out.println(set);
		 

			
		}
		

	}




// Create a set of Student class using hashset class