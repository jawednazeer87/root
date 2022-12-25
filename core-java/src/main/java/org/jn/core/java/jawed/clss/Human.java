package org.jn.core.java.jawed.clss;

public class Human {

	int age;
	
	public void set(int a) {
		if(a<=0) {
			System.out.println("age can not be negative");
			return;
		}
		age = a;
	}
	
	public int get() {
		return age;
	}
}
