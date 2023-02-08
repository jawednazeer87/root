package org.jn.core.java.student.shoaeeb.classes.objects;

public class Program1 {
	
	String name;
	int age;
	
	void talk() {
		System.out.println("My name is: "+name);
		System.out.println("Age is: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 p = new Program1();
		System.out.println("hashcode:"+p.hashCode());
	}

}
