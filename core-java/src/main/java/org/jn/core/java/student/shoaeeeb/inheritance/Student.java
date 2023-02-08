package org.jn.core.java.student.shoaeeeb.inheritance;

public class Student extends Teacher{

	double marks;
	void setMarks(double marks) {
		this.marks=marks;
	}
	double getMarks() {
		return marks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setId(1001);
		s.setName("Chandra Sekhar");
		s.setAdress("MIG-12, kukatpally, Hyderabad");
		s.setMarks(950d);
		
		
		System.out.println("Id: "+s.getId());
		System.out.println("Name :"+s.getName());
		System.out.println("Address: "+s.getAddress());
		System.out.println("Marks: "+s.getMarks());
	}

}
