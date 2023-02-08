package org.jn.core.java.student.shoaeeb.collection.framework;

public class TeacherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInter mi = (Teacher) -> {
			return Teacher.getSalary()==60000f;
		};
		
		Teacher[] teachers = TeacherUtil.getTeacher();
		
		System.out.println(teachers);
		
	}

}
