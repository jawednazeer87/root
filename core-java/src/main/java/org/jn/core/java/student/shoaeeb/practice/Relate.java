package org.jn.core.java.student.shoaeeb.practice;

public class Relate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three obj3 = new Three();
		Two obj2= new Two(obj3);
		One obj1 = new One(obj2);
		System.out.println(obj1.cube(5));
		System.out.println(obj2.square(6));
		
		
	}

}
