package org.jn.core.java.student.shoaeeb.classes.objects;

public class Person {

	String name;
	int age;
	
	void talk() {
		System.out.println("My name is: "+name);
		System.out.println("Age is: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.talk();
	}

}
