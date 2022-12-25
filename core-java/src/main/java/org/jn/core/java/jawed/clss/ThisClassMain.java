package org.jn.core.java.jawed.clss;

public class ThisClassMain {

	public static void main(String[] args) {
		ThisClass class1 = new ThisClass();
		class1.setId(1);
		class1.setName("string");
		int i = class1.getId();
		String n = class1.getName();
		System.out.println("id: "+i);
		System.out.println("name: "+n);
	}
}
