package org.jn.core.java.student.shoaeeb.classes.objects;

public class Program3 {
	String name;
	int age;
	
	Program3(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void talk() {
		System.out.println("My name is: "+name);
		System.out.println("Age is: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 p = new Program3("Rahul",20);
		p.talk();
		
	}

}
