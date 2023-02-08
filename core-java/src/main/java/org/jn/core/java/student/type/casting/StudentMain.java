package org.jn.core.java.student.type.casting;

public class StudentMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s =new Student(1,"Shoaeeb");
		s.getData();
		Student s1 = (Student)s.clone();
		s1.getData();
	}

}
